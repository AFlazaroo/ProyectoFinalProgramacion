package co.edu.unbosque.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Algoritmos {
	
	public Algoritmos() {	
		
	}
	
	//Burbuja entero
	public int[] burbujaEntero(int [] arreglo) {
		System.out.println(Arrays.toString(arreglo));
		for (int i = 0; i < arreglo.length; i++) {
	        for (int j = 0; j < arreglo.length - 1; j++) {
	            int elementoActual = arreglo[j],
	                    elementoSiguiente = arreglo[j + 1];
	            if (elementoActual > elementoSiguiente) {
	                arreglo[j] = elementoSiguiente;
	                arreglo[j + 1] = elementoActual;
	            }
	        }
	    }
		return arreglo;
	}
	
	//Burbuja String
	public String[] burbuja(String[] arreglo) {
	    System.out.println(Arrays.toString(arreglo));
	    for (int i = 0; i < arreglo.length; i++) {
	        for (int j = 0; j < arreglo.length - 1; j++) {
	            String elementoActual = arreglo[j];
	            String elementoSiguiente = arreglo[j + 1];
	            if (elementoActual.compareTo(elementoSiguiente) > 0) {
	                // Intercambiar
	                arreglo[j] = elementoSiguiente;
	                arreglo[j + 1] = elementoActual;
	            }
	        }
	    }
	    return arreglo;
	}
	//Seleccion String
	public String[] seleccionString(String[] arreglo) {
		System.out.println(Arrays.toString(arreglo));
		for(int i = 0; i <	arreglo.length - 1; i++) {
			int men = i;
			for(int j = i + 1; j < arreglo.length; j++) {
				if(arreglo[j].charAt(0) > arreglo[men].charAt(0)) {
					men = j;
				}
			}
			String aux = arreglo[i];
			arreglo[i] = arreglo[men];
			arreglo[men] = aux;
		}
		return arreglo;
		
	}
	
	//Seleecion Int
	public int[] seleccion(int[] arreglo) {
	    System.out.println(Arrays.toString(arreglo));
	    for(int i = 0; i < arreglo.length - 1; i++) {
	        int men = i;
	        for(int j = i + 1; j < arreglo.length; j++) {
	            if(arreglo[j] > arreglo[men]) {
	                men = j;
	            }
	        }
	        int aux = arreglo[i];
	        arreglo[i] = arreglo[men];
	        arreglo[men] = aux;
	    }
	    return arreglo;
	}
	
	//Insercion Int 
	public int[] ordenamientoPorInsercion(int[] arreglo) {
	    int n = arreglo.length;
	    for (int i = 1; i < n; ++i) {
	        int key = arreglo[i];
	        int j = i - 1;

	        /* Mueve los elementos del arreglo[0..i-1], que son mayores que la llave,
	        a una posición adelante de su posición actual */
	        while (j >= 0 && arreglo[j] < key) {
	            arreglo[j + 1] = arreglo[j];
	            j = j - 1;
	        }
	        arreglo[j + 1] = key;
	    }
	    return arreglo;
	}

	//Insercion String
	public String[] ordenamientoPorInsercion(String[] arreglo) {
	    int n = arreglo.length;
	    for (int i = 1; i < n; ++i) {
	        String key = arreglo[i];
	        int j = i - 1;

	        /* Mueve los elementos del arreglo[0..i-1], que son mayores que la llave,
	        a una posición adelante de su posición actual */
	        while (j >= 0 && arreglo[j].compareTo(key) < 0) {
	            arreglo[j + 1] = arreglo[j];
	            j = j - 1;
	        }
	        arreglo[j + 1] = key;
	    }
	    return arreglo;
	}
	
	public LocalDate[] burbujaFecha(LocalDate[] arreglo) {
	    for (int i = 0; i < arreglo.length - 1; i++) {
	        for (int j = 0; j < arreglo.length - i - 1; j++) {
	            if (arreglo[j].isAfter(arreglo[j+1])) {
	                LocalDate temp = arreglo[j];
	                arreglo[j] = arreglo[j+1];
	                arreglo[j+1] = temp;
	            }
	        }
	    }
	    return arreglo;
	}
	public LocalDate[] seleccionFecha(LocalDate[] arreglo) {
	    System.out.println(Arrays.toString(arreglo));
	    for(int i = 0; i < arreglo.length - 1; i++) {
	        int menor = i;
	        for(int j = i + 1; j < arreglo.length; j++) {
	            if(arreglo[j].compareTo(arreglo[menor]) < 0) {
	                menor = j;
	            }
	        }
	        LocalDate aux = arreglo[i];
	        arreglo[i] = arreglo[menor];
	        arreglo[menor] = aux;
	    }
	    return arreglo;
	}
	public LocalDate[] insercionFecha(LocalDate[] arreglo) {
	    int n = arreglo.length;
	    for (int i = 1; i < n; ++i) {
	        LocalDate key = arreglo[i];
	        int j = i - 1;

	        /* Mueve los elementos del arreglo[0..i-1], que son mayores que la llave,
	        a una posición adelante de su posición actual */
	        while (j >= 0 && arreglo[j].isAfter(key)) {
	            arreglo[j + 1] = arreglo[j];
	            j = j - 1;
	        }
	        arreglo[j + 1] = key;
	    }
	    return arreglo;
	}







}







