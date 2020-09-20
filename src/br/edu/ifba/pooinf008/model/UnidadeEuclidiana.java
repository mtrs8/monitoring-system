package br.edu.ifba.pooinf008.model;

//Permite o movimento horizontal e vertical
public class UnidadeEuclidiana extends UnidadeMonitora {
	

	public UnidadeEuclidiana(String id, Localizacao l, boolean video, boolean termometro, boolean co2, boolean ch4) {
		super(id, l, video, termometro, co2, ch4);
	}

	public double calcularDistancia(Localizacao destino) {
		return Math.sqrt(Math.sqrt(destino.getAbscissa() - destino.getOrdenada())
				+ Math.sqrt(destino.getAbscissa() - destino.getOrdenada()));
	}

}
