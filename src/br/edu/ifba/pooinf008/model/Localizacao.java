package br.edu.ifba.pooinf008.model;

public class Localizacao {
	
	private double abscissa;
	private double ordenada;
	
	public Localizacao() {
		this(0.0, 0.0);
	}

	public Localizacao(double abscissa, double ordenada) {
		this.abscissa = abscissa;
		this.ordenada = ordenada;
	}

	public double getAbscissa() {
		return abscissa;
	}

	public void setAbscissa(double abscissa) {
		this.abscissa = abscissa;
	}

	public double getOrdenada() {
		return ordenada;
	}

	public void setOrdenada(double ordenada) {
		this.ordenada = ordenada;
	}

	@Override
	public String toString() {
		return "Localizacao [abscissa=" + abscissa + ", ordenada=" + ordenada + "]";
	}
	
	public boolean equals(Localizacao l) {
		if(!(l instanceof Localizacao)) {
			return false;
		}
		Localizacao outra = l;
		double abscissaResultado = Double.compare(this.getAbscissa(), outra.getAbscissa());
		double ordenadaResultado = Double.compare(this.getOrdenada(), outra.getOrdenada());
		return abscissaResultado == 0.0 && ordenadaResultado == 0.0;
	}
	
}
