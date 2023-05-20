package co.edu.unbosque.model;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.Archivos.ArchivoBinario;

public class EstudiantesDTO1 {
	private ArrayList<Estudiantes> estudiantes;
    private CrudBinario crud;
    private File file = new File("datos.txt");
    private ArchivoBinario archivoB;
    
    public EstudiantesDTO1(){
        estudiantes = new ArrayList<Estudiantes>();
        archivoB = new ArchivoBinario();
        crud = new CrudBinario(archivoB);
        estudiantes = archivoB.leerArchivo();
    }

    public ArrayList<Estudiantes> getEstudiantes() {
        return estudiantes;
    }

	public CrudBinario getCrud() {
		return crud;
	}

	public void setCrud(CrudBinario crud) {
		this.crud = crud;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public ArchivoBinario getArchivoB() {
		return archivoB;
	}

	public void setArchivoB(ArchivoBinario archivoB) {
		this.archivoB = archivoB;
	}

	public void setEstudiantes(ArrayList<Estudiantes> estudiantes) {
		this.estudiantes = estudiantes;
	}
     
}


