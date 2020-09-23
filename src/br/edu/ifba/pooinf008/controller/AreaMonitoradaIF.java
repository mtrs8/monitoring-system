package br.edu.ifba.pooinf008.controller;

import br.edu.ifba.pooinf008.model.Localizacao;
import br.edu.ifba.pooinf008.model.UnidadeMonitora;

public interface AreaMonitoradaIF {  //INTERFACE E METODOS UTILIZADOS PARA ACESSO
	
	public String monitorar(Localizacao localizacao, boolean video,
			boolean termometro, boolean co2, boolean ch4); 
	
	public void addUnidade(UnidadeMonitora unidade);
	
}
