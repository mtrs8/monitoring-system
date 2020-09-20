package br.edu.ifba.pooinf008.controller;

import br.edu.ifba.pooinf008.model.Localizacao;

public interface AreaMonitoradaIF {
	
	public String monitorar(Localizacao localizacao, boolean video,
			boolean termometro, boolean co2, boolean ch4);
}
