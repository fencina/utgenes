package main.java.ar.edu.utn.frba.ia.ag.ejemplos.perfumes;

import main.java.ar.edu.utn.frba.ia.ag.AlgoritmoGenetico;
import main.java.ar.edu.utn.frba.ia.ag.Configuracion;
import main.java.ar.edu.utn.frba.ia.ag.ConfiguracionDefault;

public class AcertijoPerfumes {
	
	public static void main(String[] args) {
		
		//Configuracion 1
		Configuracion config = new ConfiguracionDefault();
		
		//Descomentar para tener la "configuracion 2"
		{
//		config.setCriterioDeParo(new TiempoTranscurrido(0, 1, 0));
//		config.setMetodoDeSeleccion(new Ranking(10));
//		config.setPoblacionInicial(500000);
		}
		//Descomentar junto con la "configuracion 2" para tener la "configuracion 3"
		{
//		config.setCriterioDeParo(new TiempoTranscurrido(0, 5, 0));
		}
		
		AlgoritmoGenetico combinacionPerfumes = new AlgoritmoGenetico(config, CombinacionPerfumes.class);
		
		combinacionPerfumes.ejecutar();
	}
	
}

