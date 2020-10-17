package br.edu.ifba.pooinf008.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.pooinf008.controller.IAreaMonitoradaDAO;
import br.edu.ifba.pooinf008.model.Localizacao;
import br.edu.ifba.pooinf008.model.UnidadeEuclidiana;
import br.edu.ifba.pooinf008.model.UnidadeManhattan;
import br.edu.ifba.pooinf008.model.UnidadeMonitora;

public class AreaMonitoradaDAO implements IAreaMonitoradaDAO {

	private static String SELECT = "SELECT * FROM unidade";
	
	
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
		return unidades;
	}

	@Override
	public void atualizarUnidade(Localizacao localizacao, String id) throws Exception {
		
	}

	@Override
	public void addUnidade(UnidadeMonitora unidade) throws Exception {
		// TODO Auto-generated method stub
		
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
