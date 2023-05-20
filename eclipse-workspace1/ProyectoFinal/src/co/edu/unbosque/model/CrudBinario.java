package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.Archivos.ArchivoBinario;

public class CrudBinario {
	private ArchivoBinario archivoB;


    public CrudBinario(ArchivoBinario archivoB) {
    	this.archivoB = archivoB;
    	
    }	
    	
    public boolean agregarEstudiante(String usuario, String documento, String correoAlternativo, String genero, String programaAcademico,  String jornadaAcademica, String lugarNacimiento,ArrayList<Estudiantes> estudiantes, java.io.File file) {
        Estudiantes nueva = new Estudiantes(usuario, documento, correoAlternativo, genero, programaAcademico, jornadaAcademica, lugarNacimiento);
        if (buscarEstudiantes(usuario, estudiantes) == null) {
            estudiantes.add(nueva);
            archivoB.escribirArchivo();
            return true;
        } else {
            return false;
        }
    }
    public Estudiantes buscarEstudiantes(String usuario, ArrayList<Estudiantes> estudiantes) {
    	Estudiantes encontrada = null;

        if (!estudiantes.isEmpty()) {
            //for elemento in lista:
            for (Estudiantes estudiantes1 : estudiantes) {
                if (usuario.equals(estudiantes1.getUsuario())) {
                    encontrada = estudiantes1;
                }
            }
        }

        return encontrada;
    }
    public boolean eliminarEstudiante(String usuario, ArrayList<Estudiantes> estudiantes) {
        Estudiantes encontrado = buscarEstudiantes(usuario, estudiantes);
        
        if (encontrado != null) {
            estudiantes.remove(encontrado);
            archivoB.escribirArchivo();
            return true;
        } else {
            return false;
        }
    }

}
