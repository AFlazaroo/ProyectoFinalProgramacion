	package co.edu.unbosque.model.Archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Crud;
import co.edu.unbosque.model.Estudiantes;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Archivo {
    private CSVReader reader;
    private CSVWriter writer;

    public Archivo(File file) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }
        reader = new CSVReader(new FileReader(file));
        writer = new CSVWriter(new FileWriter(file));
    }

    public void escribirArchivo(List<Estudiantes> estudiantes, File file) throws IOException {
        List<String[]> data = new ArrayList<>();
        for (Estudiantes estudiante : estudiantes) {
            data.add(new String[]{estudiante.getUsuario(), estudiante.getDocumento(), estudiante.getCorreoAlternativo(), estudiante.getGenero(),estudiante.getProgramaAcademico(), estudiante.getJornadaAcademica(), estudiante.getLugarNacimiento()});
        }
        writer.writeAll(data);
        writer.close();
    }

    public List<Estudiantes> leerArchivo(File file) throws IOException {
        List<Estudiantes> estudiantes = new ArrayList<>();
        List<String[]> data = reader.readAll();
        for (String[] row : data) {
            estudiantes.add(new Estudiantes(row[0], row[1], row[2], row[3], row[4], row[5], row[6]));
        }
        reader.close();
        return estudiantes;
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
}
