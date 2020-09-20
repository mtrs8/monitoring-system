package br.edu.ifba.pooinf008.model;

//Permite o movimento livre em qualquer direção
public class UnidadeManhattan extends UnidadeMonitora {

	
	
	public UnidadeManhattan(String id, Localizacao l, boolean video, boolean termometro, boolean co2, boolean ch4) {
		super(id, l, video, termometro, co2, ch4);
	}

	public double calcularDistancia(Localizacao destino) {
		double diferencaAbscissa = 0, diferencaOrdenada = 0;
		if(this.getLocalizacao() != null && destino != null) {
			diferencaAbscissa = this.getLocalizacao().getAbscissa() - destino.getAbscissa();
			diferencaOrdenada = this.getLocalizacao().getOrdenada() - destino.getOrdenada();
		}
		return  Math.abs(diferencaAbscissa) + Math.abs(diferencaOrdenada);
	}

}
