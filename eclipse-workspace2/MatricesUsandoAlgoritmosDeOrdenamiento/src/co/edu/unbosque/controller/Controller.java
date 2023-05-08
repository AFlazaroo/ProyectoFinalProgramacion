package co.edu.unbosque.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

import co.edu.unbosque.model.Algoritmos;
import co.edu.unbosque.model.DAOarrays;
import co.edu.unbosque.view.VistaConsola;

public class Controller {
	
	Scanner scan;
	VistaConsola vista;
	Algoritmos algoritmos;
	DAOarrays daoArrays;
	
	public Controller() {
		scan = new Scanner(System.in);
		vista = new VistaConsola();
		algoritmos = new Algoritmos();
		daoArrays = new DAOarrays();
		
		funcionar();
	}
	
	public void funcionar() {
		
		vista.mostrarInformacion("------------------------------------------------");
		vista.mostrarInformacion("¿ Qué algoritmo de ordenamiento te gustaría usar ?");
		vista.mostrarInformacion("1. Burbuja");
		vista.mostrarInformacion("2. Selección");
		vista.mostrarInformacion("3. Inserción");
		vista.mostrarInformacion("4. Salir");
		vista.mostrarInformacion("-------------------------------------------------");
		
		String respuesta = scan.nextLine();
		
		switch(respuesta) {
			case "1": 
				System.out.println("Burbuja: ");
				String[] negocios = daoArrays.getNegocios();
				String[] negociosOrdenadosBurbuja = algoritmos.burbuja(negocios);
				System.out.println(Arrays.toString(negociosOrdenadosBurbuja));
				
				LocalDate[] fechas = daoArrays.getFechas();
				LocalDate[] fechasOrdenadosBurbuja = algoritmos.burbujaFecha(fechas);
				System.out.println(Arrays.toString(fechasOrdenadosBurbuja));
				
				int[] ventas = daoArrays.getVentas();
				int[] ventasOrdenadosBurbuja = algoritmos.burbujaEntero(ventas);
				System.out.println(Arrays.toString(ventasOrdenadosBurbuja));
				
				int[] clientes = daoArrays.getClientes();
				int[] clientesOrdenadosBurbuja = algoritmos.burbujaEntero(clientes);
				System.out.println(Arrays.toString(clientesOrdenadosBurbuja));
				
				
				break;
			case "2": 
				System.out.println("Seleccion");
				String[] negocios1 = daoArrays.getNegocios();
				String[] negociosOrdenadosSeleccion1 = algoritmos.seleccionString(negocios1);
				System.out.println(Arrays.toString(negociosOrdenadosSeleccion1));
				
				LocalDate[] fechas1 = daoArrays.getFechas();
				LocalDate[] fechasOrdenadossSeleccion1 = algoritmos.seleccionFecha(fechas1);
				System.out.println(Arrays.toString(fechasOrdenadossSeleccion1));
				
				int[] ventas1 = daoArrays.getVentas();
				int[] ventasOrdenadossSeleccion1 = algoritmos.seleccion(ventas1);
				System.out.println(Arrays.toString(ventasOrdenadossSeleccion1));
				
				int[] clientes1 = daoArrays.getClientes();
				int[] clientesOrdenadossSeleccion1 = algoritmos.seleccion(clientes1);
				System.out.println(Arrays.toString(clientesOrdenadossSeleccion1));
				break;
				
				
			case "3": 
				System.out.println("Inserción: ");
				String[] negocios2 = daoArrays.getNegocios();
				String[] negociosOrdenadosInsercion = algoritmos.ordenamientoPorInsercion(negocios2);
				System.out.println(Arrays.toString(negociosOrdenadosInsercion));
				
				LocalDate[] fechas2 = daoArrays.getFechas();
				LocalDate[] fechasOrdenadossInsercion = algoritmos.insercionFecha(fechas2);
				System.out.println(Arrays.toString(fechasOrdenadossInsercion));
				
				int[] ventas2 = daoArrays.getVentas();
				int[] ventasOrdenadossInsercion = algoritmos.ordenamientoPorInsercion(ventas2);
				System.out.println(Arrays.toString(ventasOrdenadossInsercion));
				
				int[] clientes2 = daoArrays.getClientes();
				int[] clientesOrdenadossInsercion = algoritmos.ordenamientoPorInsercion(clientes2);
				System.out.println(Arrays.toString(clientesOrdenadossInsercion));
				break;
			case "4":
				System.exit(0);
				break;
			default:
				vista.mostrarError("Opción inválida.");
				break;
		}
		
		funcionar();
	}
}
