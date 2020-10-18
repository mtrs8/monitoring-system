package br.edu.ifba.pooinf008.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.pooinf008.controller.AreaMonitoradaIF;
import br.edu.ifba.pooinf008.persistence.AreaMonitoradaDAO;
import br.edu.ifba.pooinf008.persistence.IAreaMonitoradaDAO;

public class AreaMonitorada implements AreaMonitoradaIF{ //CLASSE QUE IMPLEMENTA AREAMONITORADAIF
	private List<UnidadeMonitora> unidades = null ; //LISTA DE UNIDADES
	private IAreaMonitoradaDAO areaMon = new AreaMonitoradaDAO();
	public AreaMonitorada() {
	}
	
	public String monitorar(Localizacao localizacao, boolean video,
			boolean termometro, boolean co2, boolean ch4) { //MONITORA UNIDADES E RETORNA ID DA MAIS PROXIMA
		try {
			unidades = areaMon.getUnidades();
			List<UnidadeMonitora> unidadesConfigMinima = new ArrayList<>();
			for(UnidadeMonitora unidade : unidades)
				if(unidade.verificaConfiguracaoMinima(video, termometro, co2, ch4))
					unidadesConfigMinima.add(unidade);
			
			UnidadeMonitora unidadeProxima = unidadeMaisProxima(localizacao, unidadesConfigMinima);
			areaMon.atualizarUnidade(localizacao, unidadeProxima.getId());
			return unidadeProxima.getId();			
		} catch(NullPointerException e) {
			throw new NullPointerException("Unidade não encontrada!!"); 
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public UnidadeMonitora unidadeMaisProxima(Localizacao localizacao, 
			List<UnidadeMonitora> unidadeConfigMinima) { // VERIFICA UNIDADE MAIS PROXIMA
		UnidadeMonitora unidade = null;
		Double maiorDistancia = Double.MAX_VALUE;
		for(UnidadeMonitora u : unidadeConfigMinima) {
			Double novaDistancia = u.calcularDistancia(localizacao);
			if(novaDistancia < maiorDistancia) {
				unidade = u;
				maiorDistancia = novaDistancia;
			}	
		}
		return unidade;
	}
	
	public void atualizarLocalizacao(UnidadeMonitora unidade, Localizacao localizacao) {
		unidade.moverUnidade(localizacao);
	}
	
	public void addUnidade(UnidadeMonitora unidade) { // ADICIONA 1 UNIDADE A LISTA DE UNIDADES
		try {
			areaMon.addUnidade(unidade);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public UnidadeMonitora getUnidadeById(String id) throws Exception {
		
		for(UnidadeMonitora u : unidades) {
			if(u.getId() == id)
				return u;
		}
		return null;
	}
	
	
	
}
