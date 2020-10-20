package br.edu.ifba.pooinf008.model;

public class Localizacao {// CRIEI A CLASSE LOCALIZACAO POR QUESTAO DE ORGANIZACAO
	
	private double abscissa; //PONTO X
	private double ordenada; // PONTO Y
	
	public Localizacao() {
		this(0.0, 0.0);// INICIALMENTE SETADO COM 0
	}

	public Localizacao(double abscissa, double ordenada) { //RECEBE VALOR PASSADO PELO USUARIO
		this.abscissa = abscissa;
		this.ordenada = ordenada;
	}

	//*** GETTERS AND SETTERS ***
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
	
	//***********************************

	@Override
	public String toString() {// METODO P/ FORMAR UMA STRING
		return "[Lat=" + abscissa + "]" + "[ Longit=" + ordenada + "]";
	}
	
	public boolean equals(Localizacao l) {//COMPARA DUAS LOCALIZACOES 
		if(!(l instanceof Localizacao)) {
			return false;
		}
		double abscissaResultado = Double.compare(this.getAbscissa(), l.getAbscissa());
		double ordenadaResultado = Double.compare(this.getOrdenada(), l.getOrdenada());
		return abscissaResultado == 0.0 && ordenadaResultado == 0.0;
	}
	
}
