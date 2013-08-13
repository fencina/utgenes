package main.java.ar.edu.utn.frba.ia.ag.ejemplos.maximo2d;

import java.util.logging.Logger;

import main.java.ar.edu.utn.frba.ia.ag.AlgoritmoGenetico;
import main.java.ar.edu.utn.frba.ia.ag.Configuracion;
import main.java.ar.edu.utn.frba.ia.ag.ConfiguracionDefault;
import main.java.ar.edu.utn.frba.ia.ag.Individuo;

public class Optimizacion {
	
	public static void main(String[] args) {
		
		Configuracion config = new ConfiguracionDefault();
		
		AlgoritmoGenetico maximoLocal = new AlgoritmoGenetico(config, Combinaciones.class);
		
		Individuo xyz = maximoLocal.ejecutar();
		
		Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).severe("Individuo final: " + xyz.toString());
		
		// Resultado Esperado https://docs.google.com/drawings/d/1i5sv1zcMGIulYWkuLcAv6UQV5haLKlKHm_FgiDWXdG0
	}
	
}