package co.edu.unbosque.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.jfree.chart.axis.StandardTickUnitSource;
import org.jfree.data.category.DefaultCategoryDataset;

import co.edu.unbosque.model.Archivos.Archivo;

public class GeneradorEstadisticas {
	
	public GeneradorEstadisticas() {
		
	}
	
	public ArrayList<Estudiantes> convertirAArrayList(Archivo archivo) throws IOException{
		archivo = new Archivo();
		ArrayList<Estudiantes> arr = (ArrayList<Estudiantes>) archivo.leerArchivo();
		System.out.println(arr);
		return arr;
	}
	
    public ArrayList<Estudiantes> ordenamientoBurbuja(ArrayList<Estudiantes> estudiantes) {
    	int n = estudiantes.size();
        boolean intercambio;

        for (int i = 0; i < n - 1; i++) {
            intercambio = false;

            for (int j = 0; j < n - i - 1; j++) {
            	if (estudiantes.get(j).getDocumento().compareTo(estudiantes.get(j + 1).getDocumento()) > 0) {
            		Estudiantes temp = estudiantes.get(j);
                    estudiantes.set(j, estudiantes.get(j + 1));
                    estudiantes.set(j + 1, temp);
                    intercambio = true;
                }
            }
            if (!intercambio) {
                break;
            }
        }
        return estudiantes;
    }
    
    public static String calcularModaCarrera(ArrayList<Estudiantes> estudiantes) {
    	
    	int contadorSistemas = 0;
    	int contadorAmbiental = 0;
    	int contadorBioingenieria = 0;
    	int contadorElectronica = 0;
    	int contadorIndustrial = 0;
    	
    	for(Estudiantes x :  estudiantes) {
    		switch(x.getProgramaAcademico()){
    		case"Sistemas":
    			contadorSistemas = contadorSistemas + 1;
    			break;
    		case"Ambiental":
    			contadorAmbiental = contadorAmbiental + 1;
    			break;
    		case"Bioingenieria":
    			contadorBioingenieria = contadorBioingenieria + 1;
    			break;
    		case"Electronica":
    			contadorElectronica = contadorElectronica + 1;
    			break;
    		case"Industrial":
    			contadorIndustrial = contadorIndustrial + 1;
    			break;	
    		}
    		if(contadorSistemas > contadorAmbiental && contadorSistemas > contadorBioingenieria && contadorSistemas > contadorIndustrial && contadorSistemas > contadorElectronica) {
    			return "Sistemas";
    		}
    		else if(contadorAmbiental > contadorBioingenieria && contadorAmbiental > contadorElectronica && contadorAmbiental > contadorIndustrial && contadorAmbiental > contadorSistemas){
    			return "Ambiental";
    		}
    		else if(contadorBioingenieria > contadorAmbiental && contadorBioingenieria > contadorElectronica && contadorBioingenieria > contadorIndustrial && contadorBioingenieria > contadorSistemas) {
    			return "Bioingenieria";
    		}
    		else if(contadorElectronica > contadorAmbiental && contadorElectronica > contadorBioingenieria && contadorElectronica > contadorIndustrial && contadorElectronica > contadorSistemas) {
    			return "Electronica";
    		}else {
    			return "Industrial";
    		}
    		
    	}
    	return "¡ERROR EN EL MOMENTO DE ENCOTRAR LA MODA !";
    }
    
	public void crearGrafica(File file) {
		DefaultCategoryDataset datosG = new DefaultCategoryDataset();
	}
}
