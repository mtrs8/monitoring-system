package br.edu.ifba.pooinf008.controller;

import java.util.List;

import br.edu.ifba.pooinf008.model.Localizacao;
import br.edu.ifba.pooinf008.model.UnidadeMonitora;

public interface IAreaMonitoradaDAO {
	
	public List<UnidadeMonitora> getUnidades() throws Exception;
	
	public void atualizarUnidade(Localizacao localizacao, String id) throws Exception;
	
	public void addUnidade(UnidadeMonitora unidade) throws Exception;
}
