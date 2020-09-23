package br.edu.ifba.pooinf008.model;

//Permite o movimento livre em qualquer direção
public class UnidadeManhattan extends UnidadeMonitora {// CALCULA A DISTANCIA MANHATTAN

	
	
	public UnidadeManhattan(String id, Localizacao l, boolean video, boolean termometro, boolean co2, boolean ch4) {
		super(id, l, video, termometro, co2, ch4);
	}

	public double calcularDistancia(Localizacao destino) {
		double diferencaAbscissa = 0, diferencaOrdenada = 0;
		if(this.getLocalizacao() != null && destino != null) {//VERIFICA A EXISTENCIA DAS DUAS LOCALIZACOES
			diferencaAbscissa = this.getLocalizacao().getAbscissa() - destino.getAbscissa();//TIRA A DIFERENCA DOS PONTOS
			diferencaOrdenada = this.getLocalizacao().getOrdenada() - destino.getOrdenada();
		}
		return  Math.abs(diferencaAbscissa) + Math.abs(diferencaOrdenada);// RETORNA O VALOR DO CALCULO
	}

}
