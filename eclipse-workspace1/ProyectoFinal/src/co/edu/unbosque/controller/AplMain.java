package co.edu.unbosque.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Estudiantes;
import co.edu.unbosque.model.GeneradorEstadisticas;
import co.edu.unbosque.model.Archivos.Archivo;

public class AplMain {

	public static void main(String[] args) throws IOException {
		new Controller();
		
		Archivo archivo = new Archivo();
		List<Estudiantes> ar = archivo.leerArchivo();
		System.out.println(ar);
	
		GeneradorEstadisticas gt = new GeneradorEstadisticas();
		
		ArrayList<Estudiantes> estu = gt.convertirAArrayList(archivo);
		gt.ordenamientoBurbuja(estu);
		
		System.out.println(gt.calcularModaCarrera(estu));
	}
}
	