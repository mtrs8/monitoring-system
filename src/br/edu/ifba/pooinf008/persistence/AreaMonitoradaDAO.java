package br.edu.ifba.pooinf008.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.pooinf008.model.Localizacao;
import br.edu.ifba.pooinf008.model.UnidadeEuclidiana;
import br.edu.ifba.pooinf008.model.UnidadeManhattan;
import br.edu.ifba.pooinf008.model.UnidadeMonitora;

public class AreaMonitoradaDAO implements IAreaMonitoradaDAO {
	

	private static String SELECT = " SELECT * FROM unidade";
	
	private static String UPDATE = "UPDATE unidade"
								 + " SET x = ?, y = ?"
								 + " WHERE id = ?";
	
	private static String INSERT = "INSERT INTO unidade(x, y, tipo, video, termometro, co2, ch4)"
								 + "VALUES(?, ?, ?, ?, ?, ?, ?)";
	
	@Override
	public List<UnidadeMonitora> getUnidades() throws Exception { 
		Connection conn = ConnectionDAO.getConnection();
		List<UnidadeMonitora> unidades = new ArrayList<UnidadeMonitora>();
		ResultSet rSet = null;
		PreparedStatement ps = conn.prepareStatement(this.SELECT);
		rSet = ps.executeQuery();
		while(rSet.next()) {
			unidades.add(instanciaUnidade(rSet));
		}
		//ConnectionDAO.closeConnection();
		return unidades;
	}

	@Override
	public void atualizarUnidade(Localizacao localizacao, String id) throws Exception {
		Connection conn = ConnectionDAO.getConnection();
		PreparedStatement ps = conn.prepareStatement(this.UPDATE);
		try {
			ps.setDouble(1, localizacao.getAbscissa());
			ps.setDouble(2, localizacao.getOrdenada());
			ps.setInt(3, Integer.parseInt(id));
			ps.executeUpdate();
		} catch (Exception e) {
			//ConnectionDAO.closeConnection();
			e.printStackTrace();
		}
	}

	@Override
	public void addUnidade(UnidadeMonitora unidade) throws Exception {
		Connection conn = ConnectionDAO.getConnection();
		PreparedStatement ps = conn.prepareStatement(this.INSERT);
		try {
			ps.setDouble(1, unidade.getLocalizacao().getAbscissa());
			ps.setDouble(2, unidade.getLocalizacao().getOrdenada());
			ps.setInt(3, unidade instanceof UnidadeManhattan ? 1 : 0);
			ps.setBoolean(4, unidade.getVideo());
			ps.setBoolean(5, unidade.getTermometro());
			ps.setBoolean(6, unidade.getCo2());
			ps.setBoolean(7, unidade.getCh4());
			ps.executeUpdate();
		} catch(Exception e) {
			//ConnectionDAO.closeConnection();
			e.printStackTrace();
		}
		
	}


	private UnidadeMonitora instanciaUnidade(ResultSet rSet) {
		UnidadeMonitora unidade = null;
		try {
			if(rSet.getInt("tipo") == 0) {
				unidade = new UnidadeEuclidiana(rSet.getString("id"),
						new Localizacao(rSet.getDouble("x"),
								rSet.getDouble("y")),
						rSet.getBoolean("video"),
						rSet.getBoolean("termometro"),
						rSet.getBoolean("co2"),
						rSet.getBoolean("ch4"));
			} else {
				unidade = new UnidadeManhattan(rSet.getString("id"), new Localizacao(rSet.getDouble("x"),
						rSet.getDouble("y")),
						rSet.getBoolean("video"),
						rSet.getBoolean("termometro"),
						rSet.getBoolean("co2"),
						rSet.getBoolean("ch4"));			
			}
			
		} catch(SQLException e) {
			e.getMessage();
		}
		
			
		return unidade;
	}
}
