package br.edu.ifba.pooinf008.App;

import java.sql.Connection;
import java.util.Scanner;

import br.edu.ifba.pooinf008.controller.AreaMonitoradaIF;
import br.edu.ifba.pooinf008.model.AreaMonitorada;
import br.edu.ifba.pooinf008.model.Localizacao;
import br.edu.ifba.pooinf008.model.UnidadeEuclidiana;
import br.edu.ifba.pooinf008.model.UnidadeManhattan;
import br.edu.ifba.pooinf008.model.UnidadeMonitora;

public class App {
	
	public void run() {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Id: ");
		//String id = sc.nextLine(); //Ou gerar ID random
		//CRIANDO AS UNIDADES
		/*UnidadeMonitora unidade0 = new UnidadeEuclidiana("UE2333", new Localizacao(1, 1), true, false, true, false);
		UnidadeMonitora unidade1 = new UnidadeEuclidiana("UE9389", new Localizacao(1, 2), true, true, true, true);
		UnidadeMonitora unidade2 = new UnidadeEuclidiana("UE4330", new Localizacao(1, 0), true, false, true, false);
		UnidadeMonitora unidade3 = new UnidadeEuclidiana("UE2ws0", new Localizacao(2, 3), true, true, true, false);
		UnidadeMonitora unidade4 = new UnidadeEuclidiana("UE0s10", new Localizacao(5, 8), false, true, false, true);
		UnidadeMonitora unidade5 = new UnidadeManhattan("UM0923", new Localizacao(3, 4), false, false, true, true);
		UnidadeMonitora unidade6 = new UnidadeManhattan("UM0924", new Localizacao(3, 8), false, false, true, true);
		//ADICIONANDO UNIDADES
		am.addUnidade(unidade0);
		am.addUnidade(unidade1);
		am.addUnidade(unidade2);
		am.addUnidade(unidade3);
		am.addUnidade(unidade4);
		am.addUnidade(unidade5);
		am.addUnidade(unidade6);
		
		try {
			System.out.println(am.monitorar(new Localizacao(abs, ord), false, true, false, true));
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		*/
		//sc.close();
		//System.out.println(am.monitorar(new Localizacao(1.9, 2.0), true, true, true, true));
		//am.addUnidade(new UnidadeEuclidiana(null, new Localizacao(9.0, 10.0), true, true, true, true));
		AreaMonitoradaIF am = new AreaMonitorada();
		String id = am.monitorar(new Localizacao(20.0, 22.0), true, false, true, true);
		try {
			UnidadeMonitora u = am.getUnidadeById(id);
			System.out.println("UNIDADE MAIS PROXIMA ENCONTRADA: ");
			System.out.println("ID: " + u.getId());
			System.out.println(u.getLocalizacao().toString());
			System.out.println("[Medidor CO2: " + u.getCo2() + " ]");
			System.out.println("[Medidor CH4: " + u.getCh4() + " ]");
			System.out.println("[TERMOMETRO: " + u.getTermometro() + " ]");
			System.out.println("[Camera de video: " + u.getVideo() + " ]");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		//App app = new App();
		//app.run();
	}
}
