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
import java.util.Arrays;
import java.util.List;

import javax.swing.JTextArea;

import co.edu.unbosque.model.Estudiantes;
import co.edu.unbosque.view.EstadisticasPanel;

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
    private File file = new File("datosEST.csv");
    private EstadisticasPanel estadisticas;
    

    public Archivo() throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }
        reader = new CSVReader(new FileReader(file), ';');
       
    }
    
    

   /* public void escribirArchivo(List<Estudiantes> estudiantes, File file) throws IOException {
        List<String[]> data = new ArrayList<>();
        for (Estudiantes estudiante : estudiantes) {
            data.add(new String[]{estudiante.getUsuario(), estudiante.getDocumento(), estudiante.getCorreoAlternativo(), estudiante.getGenero(),estudiante.getProgramaAcademico(), estudiante.getJornadaAcademica(), estudiante.getLugarNacimiento()});
        }
        writer.writeAll(data);
        writer.close();
    }
*/
    public List<Estudiantes> leerArchivo() throws IOException {
        List<Estudiantes> estudiantes = new ArrayList<>();
        List<String[]> data = reader.readAll();
        
        // Iterar desde la segunda fila (índice 1)
        for (int i = 1; i < data.size(); i++) {
            String[] row = data.get(i);
            
            // Realizar verificación de fila incompleta o vacía
            if (row.length >= 7) {
                estudiantes.add(new Estudiantes(row[0], row[1], row[2], row[3], row[4], row[5], row[6] ));
            } else {
                throw new IllegalArgumentException("Fila incompleta o vacía: " + Arrays.toString(row));
            }
            
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
}
