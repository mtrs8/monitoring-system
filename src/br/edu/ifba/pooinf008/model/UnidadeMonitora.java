package br.edu.ifba.pooinf008.model;

import java.util.ArrayList;

public abstract class UnidadeMonitora {// CLASSE ABSTRATA
	
	private String id;
	private Localizacao localizacao;
	private boolean video, termometro, co2, ch4;
	
	public UnidadeMonitora() { }
	
	public UnidadeMonitora(String id, Localizacao l, boolean video,
			boolean termometro, boolean co2, boolean ch4) {//CONSTRUTOR
		this.id = id;
		this.localizacao = l;
		this.video = video;
		this.ch4 = ch4;
		this.co2 = co2;
		this.termometro = termometro;
	}
	
	
	public abstract double calcularDistancia(Localizacao destino);//METODO ABSTRATO QUE CALCULA A DISTANCIA ENTRE UNIDADES
	
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
	
	public boolean verificaConfiguracaoMinima(boolean video, boolean termometro, boolean co2, 
			boolean ch4) {
		if(video) {
			if(this.getVideo() != video)
				return false;
		}
		if(termometro) {
			if(this.getTermometro() != termometro)
				return false;
		}
		if(co2) {
			if(this.getCo2() != co2)
				return false;
		}
		if(ch4) {
			if(this.getCh4() != ch4)
				return false;
		}
		return true;
	}
	
	// **** GETTERS AND SETTERS ****
	public String getId() {
		return id;
	}


	private void setId(String id) {
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

	@Override
	public String toString() {
		return "UnidadeMonitora [id=" + id + ", localizacao=" + localizacao + ", video=" + video + ", termometro="
				+ termometro + ", co2=" + co2 + ", ch4=" + ch4 + "]";
	}

	//**************************
	
	
}
