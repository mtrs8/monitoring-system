package br.edu.ifba.pooinf008.model;

import java.util.ArrayList;

public abstract class UnidadeMonitora {
	
	private String id;
	private Localizacao localizacao;
	private boolean video, termometro, co2, ch4;
	
	public UnidadeMonitora(String id, Localizacao l, boolean video,
			boolean termometro, boolean co2, boolean ch4) {
		this.id = id;
		this.localizacao = null;
		this.video = this.ch4 = this.termometro = this.co2 = false;
	}
	
	
	public abstract double calcularDistancia(Localizacao destino);
	
	public boolean comparaCoordenadas(Localizacao destino) {
		return !this.getLocalizacao().equals(destino);
	}
	
	public boolean moverUnidade(Localizacao destino) {
		if(this.comparaCoordenadas(destino)) {
			this.setLocalizacao(destino);
			return true;
		}
		return false;
	}
	
	public boolean verificaConfiguracaoMinima(ArrayList<UnidadeMonitora> unidades) {
		for(UnidadeMonitora config : unidades)
			//if()
				return true;
		return false;
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Localizacao getLocalizacao() {
		return localizacao;
	}


	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}


	public boolean getVideo() {
		return video;
	}


	public void setVideo(boolean video) {
		this.video = video;
	}


	public boolean getTermometro() {
		return termometro;
	}


	public void setTermometro(boolean termometro) {
		this.termometro = termometro;
	}


	public boolean getCo2() {
		return co2;
	}


	public void setCo2(boolean co2) {
		this.co2 = co2;
	}


	public boolean getCh4() {
		return ch4;
	}


	public void setCh4(boolean ch4) {
		this.ch4 = ch4;
	}
	
	
}
