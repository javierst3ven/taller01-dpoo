package uniandes.dpoo.taller0.modificacion;

import uniandes.dpoo.taller0.procesamiento.*;
import java.io.IOException;

public class Modificacion {
	public static void main(String[] args) {
		// System.out.println("Hola, Mundo!");
		try {
			CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("atletas");
			System.out.println(calc.paisConMasMedallistas());
		} catch (IOException e ) {
			System.out.println("[!] Se ha producido un error con el archivo!");
		}
		
	}
}
