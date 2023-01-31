package uniandes.dpoo.taller0.modificacion;

import uniandes.dpoo.taller0.procesamiento.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Modificacion {
	public static void main(String[] args) {
		System.out.println("Hola, Mundo!");
		try {
			CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("atletas.csv");
			System.out.println(calc.paisConMasMedallistas());
		} catch (FileNotFoundException e) {
			System.err.println("[!] El archivo no se ha encontrado!");
		} catch (IOException e ) {
			System.err.println("[!] Se ha producido un error leyendo el archivo!");
		}
		
	}
}
