package co.edu.unbosque.model.Archivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.Estudiantes;

public class ArchivoBinario {
	private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    private File file = new File("datos.txt");
    private  ArrayList<Estudiantes> estudiantes = new ArrayList<Estudiantes>();
    
    
    public ArchivoBinario() {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {

            }
        }
    }

    public void escribirArchivo() {
    	
        try {
            salida = new ObjectOutputStream(new FileOutputStream(file));
            salida.writeObject(estudiantes);
            salida.close();
        } catch (java.io.FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Estudiantes> leerArchivo() {
       
        if (file.length() != 0) {
            try {
                entrada = new ObjectInputStream(new FileInputStream(file));
                estudiantes = (ArrayList<Estudiantes>) entrada.readObject();
                entrada.close();
            } catch (java.io.FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
        return estudiantes;
    }

    public ObjectInputStream getEntrada() {
        return entrada;
    }

    public void setEntrada(ObjectInputStream entrada) {
        this.entrada = entrada;
    }

    public ObjectOutputStream getSalida() {
        return salida;
    }

    public void setSalida(ObjectOutputStream salida) {
        this.salida = salida;
    }
   
}


