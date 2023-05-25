package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.Archivos.ArchivoBinario;

public class CrudBinario {
	private ArchivoBinario archivoB;
	
    private ArrayList<Estudiantes> estudiantes; 


    public CrudBinario(ArchivoBinario archivoB, ArrayList<Estudiantes> estudiantes) {
    	this.archivoB = archivoB;
    	this.estudiantes = estudiantes;
    	
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
    public boolean eliminarEstudiante(String usuario1, ArrayList<Estudiantes> estudiantes) {
        Estudiantes encontrado = buscarEstudiantes(usuario1, estudiantes);
        buscarEstudiantes(usuario1, estudiantes);
        if (encontrado != null) {
            estudiantes.remove(encontrado);
            archivoB.escribirArchivo();
            return true;
        } else {
            return false;
        }
    }

}
