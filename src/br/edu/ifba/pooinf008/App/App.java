package br.edu.ifba.pooinf008.App;

import java.util.Scanner;

import br.edu.ifba.pooinf008.controller.AreaMonitoradaIF;
import br.edu.ifba.pooinf008.model.AreaMonitorada;
import br.edu.ifba.pooinf008.model.Localizacao;
import br.edu.ifba.pooinf008.model.UnidadeEuclidiana;
import br.edu.ifba.pooinf008.model.UnidadeManhattan;
import br.edu.ifba.pooinf008.model.UnidadeMonitora;

public class App {
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		AreaMonitoradaIF am = new AreaMonitorada();
		//System.out.println("Id: ");
		//String id = sc.nextLine(); //Ou gerar ID random
		System.out.println("Localizacao: ");
		Double abs = sc.nextDouble();
		Double ord = sc.nextDouble();
		
		UnidadeMonitora unidade0 = new UnidadeEuclidiana("UE2333", new Localizacao(123.0, 125.0), true, false, true, false);
		UnidadeMonitora unidade1 = new UnidadeEuclidiana("UE9389", new Localizacao(345.0, 856.0), true, true, true, true);
		UnidadeMonitora unidade2 = new UnidadeEuclidiana("UE4330", new Localizacao(393.0, 329.0), true, false, true, false);
		UnidadeMonitora unidade3 = new UnidadeEuclidiana("UE2ws0", new Localizacao(920.0, 345.0), true, true, true, false);
		UnidadeMonitora unidade4 = new UnidadeEuclidiana("UE0s10", new Localizacao(344.0, 993.0), false, true, false, true);
		UnidadeMonitora unidade5 = new UnidadeManhattan("UM0923", new Localizacao(123.0, 323.0), false, false, true, true);
		UnidadeMonitora unidade6 = new UnidadeManhattan("UM0924", new Localizacao(102.0, 423.0), false, false, true, true);
		
		am.addUnidade(unidade0);
		am.addUnidade(unidade1);
		am.addUnidade(unidade2);
		am.addUnidade(unidade3);
		am.addUnidade(unidade4);
		//am.addUnidade(unidade5);
		//am.addUnidade(unidade6);
		
		try {
			System.out.println(am.monitorar(new Localizacao(abs, ord), true, true, true, false));
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		sc.close();
		
	}
	

	public static void main(String[] args) {
		App app = new App();
		app.run();
	}
}
