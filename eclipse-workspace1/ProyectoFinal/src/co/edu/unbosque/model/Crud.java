package co.edu.unbosque.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import co.edu.unbosque.model.Archivos.Archivo;

/*
public class Crud {
    private CSVReader reader;
    private CSVWriter writer;
    private Archivo archivo;
    
    public Crud(CSVReader reader, CSVWriter writer, Archivo archivo) {
        this.reader = reader;
        this.writer = writer;
        this.archivo = archivo;
    }

    public boolean agregarEstudiante(String usuario, String documento, String correoAlternativo, String genero, String programaAcademico, String jornadaAcademica, String lugarNacimiento, File file) {
        // Leer el archivo CSV y cargar los estudiantes
        List<Estudiantes> estudiantesList = null;
        try {
            estudiantesList = archivo.leerArchivo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        if (estudiantesList != null) {
            ArrayList<Estudiantes> estudiantes = new ArrayList<>(estudiantesList);

            Estudiantes nueva = new Estudiantes(usuario, documento, correoAlternativo, genero, programaAcademico, jornadaAcademica, lugarNacimiento);
            if (buscarEstudiantes(usuario, estudiantes) == null) {
                estudiantes.add(nueva);
                // Escribir los estudiantes  en el archivo CSV
                try {
                    archivo.escribirArchivo(estudiantes, file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return true;
            }
        }
        
        return false;
    }
    public Estudiantes buscarEstudiantes(String usuario, ArrayList<Estudiantes> estudiantes) {
        Estudiantes encontrada = null;

        for (Estudiantes mascota : estudiantes) {
            if (usuario.equals(mascota.getUsuario())) {
                encontrada = mascota;
                break;
            }
        }

        return encontrada;
    }

    public ArrayList<Estudiantes> leerArchivo(File file) {
        ArrayList<Estudiantes> estudiantes = new ArrayList<>();

        try (CSVReader reader = new CSVReader(Files.newBufferedReader(Paths.get(file.getPath())))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                String usuario = nextLine[0];
                String documento = nextLine[1];
                String correoAlternativo = nextLine[2];
                String genero = nextLine[3];
                String programaAcademico = nextLine[4];
                String jornadaAcademica = nextLine[5];
                String lugarNacimiento = nextLine[6];

                Estudiantes estudiante = new Estudiantes(usuario, documento, correoAlternativo, genero, programaAcademico, jornadaAcademica, lugarNacimiento);
                estudiantes.add(estudiante);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return estudiantes;
    }

    public void escribirArchivo(ArrayList<Estudiantes> estudiantes, File file) {
        try (Writer writer = Files.newBufferedWriter(Paths.get(file.getPath())); CSVWriter csvWriter = new CSVWriter(writer)) {
            for (Estudiantes estudiante : estudiantes) {
                String[] data = new String[] { estudiante.getUsuario(), estudiante.getDocumento(), estudiante.getCorreoAlternativo(),
                        estudiante.getGenero(), estudiante.getProgramaAcademico(), estudiante.getJornadaAcademica(),
                        estudiante.getLugarNacimiento() };
                csvWriter.writeNext(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public CSVReader getReader() {
		return reader;
	}

	public void setReader(CSVReader reader) {
		this.reader = reader;
	}

	public CSVWriter getWriter() {
		return writer;
	}

	public void setWriter(CSVWriter writer) {
		this.writer = writer;
	}

	
        




    // Método para activar un perfil de estudiante
    public void activarPerfil(String correoAlternativo, String codigoActivacion) {
        for (Estudiantes estudiante : estudiantesRegistrados) {
            if (estudiante.getCorreoAlternativo().equals(correoAlternativo)) {
                if (!estudiante.isPerfilActivado()) {
                    if (codigoActivacion.equals(generarCodigoActivacion())) {
                        estudiante.setPerfilActivado(true);
                        System.out.println("El perfil del estudiante " + estudiante.getUsuario() +
                                " ha sido activado.");
                    } else {
                        System.out.println("El código de activación es incorrecto.");
                    }
                } else {
                    System.out.println("El perfil del estudiante " + estudiante.getUsuario() +
                            " ya se encuentra activado.");
                }
                return;
            }
        }
        System.out.println("No se encontró un estudiante con el correo electrónico alternativo " +
                correoAlternativo);
    }

    // Método privado para generar un código de activación aleatorio
    public String generarCodigoActivacion() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        while (sb.length() < 6) {
            int index = (int) (rnd.nextFloat() * caracteres.length());
            sb.append(caracteres.charAt(index));
        }
        String codigo = sb.toString();
        System.out.println("El código de activación generado es: " + codigo);
        return codigo;
    }

	public ArrayList<Estudiantes> getEstudiantesRegistrados() {
		return estudiantesRegistrados;
	}

	public void setEstudiantesRegistrados(ArrayList<Estudiantes> estudiantesRegistrados) {
		this.estudiantesRegistrados = estudiantesRegistrados;
	
}
*/

