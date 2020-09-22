package br.edu.ifba.pooinf008.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.pooinf008.controller.AreaMonitoradaIF;

public class AreaMonitorada implements AreaMonitoradaIF{
	private List<UnidadeMonitora> unidades = new ArrayList<>();
	
	public AreaMonitorada() {
	}
	
	public String monitorar(Localizacao localizacao, boolean video,
			boolean termometro, boolean co2, boolean ch4) {
		try {
			ArrayList<UnidadeMonitora> unidadesConfigMinima = new ArrayList<>();
			for(UnidadeMonitora unidade : unidades)
				if(unidade.verificaConfiguracaoMinima(video, termometro, co2, ch4))
					unidadesConfigMinima.add(unidade);
			
			UnidadeMonitora unidadeProxima = unidadeMaisProxima(localizacao, unidadesConfigMinima);
			return unidadeProxima.getId();			
		} catch(NullPointerException e) {
			throw new NullPointerException("Unidade não encontrada!!"); 
		}
	}
	
	public UnidadeMonitora unidadeMaisProxima(Localizacao localizacao, 
			List<UnidadeMonitora> unidadeConfigMinima) {
		UnidadeMonitora unidade = null;
		Double maiorDistancia = Double.MAX_VALUE;
		for(UnidadeMonitora u : unidadeConfigMinima) {
			if(u.calcularDistancia(localizacao) < maiorDistancia) {
				unidade = u;
			}	
		}
		return unidade;
	}
	
	public void addUnidade(UnidadeMonitora unidade) {
		unidades.add(unidade);
	}
	
	
	
}
