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
	
	public boolean verificaConfiguracaoMinima(boolean video, boolean termometro, boolean co2, 
			boolean ch4) {
			return this.video == video && this.ch4 == ch4 && this.co2 == co2 && this.termometro == termometro;
	}

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnidadeMonitora other = (UnidadeMonitora) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
