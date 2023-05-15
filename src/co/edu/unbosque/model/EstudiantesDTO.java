package co.edu.unbosque.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import co.edu.unbosque.model.Archivos.Archivo;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EstudiantesDTO {
    
    private ArrayList<Estudiantes> estudiantes;
    private Crud crud;
    private File file = new File("datosEST.csv");
    private CSVReader reader;
    private CSVWriter writer;
    private Archivo archivo;
    

    public EstudiantesDTO()  {
        try {
            archivo = new Archivo(file);  // Mover la inicialización de 'archivo' aquí
            reader = archivo.getReader();
            writer = archivo.getWriter();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        estudiantes = new ArrayList<Estudiantes>();
        crud = new Crud(reader, writer, archivo);
        estudiantes = crud.leerArchivo(file);
    }
    

    public ArrayList<Estudiantes> getEstudiantes() {
        return estudiantes;
    }

    public Crud getCrud() {
        return crud;
    }

    public void setCrud(Crud crud) {
        this.crud = crud;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
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

    public void setEstudiantes(ArrayList<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
    }
}


