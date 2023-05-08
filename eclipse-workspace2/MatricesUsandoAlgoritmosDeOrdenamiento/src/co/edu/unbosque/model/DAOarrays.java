package co.edu.unbosque.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DAOarrays {
    private String[] negocios;
    private LocalDate[] fechas;
    private int[] ventas;
    private int[] clientes;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 

    public DAOarrays() {
        negocios = new String[]{"Textiles LuisP Se", "Comidas Rápidas: ¡Qué Alitas!", "Panadería DKCH", "Zapatería Donde Mercedes", "Supermercado San Juan"};
        fechas = new LocalDate[]{LocalDate.parse("20/03/2008", formatter),
        	    LocalDate.parse("25/12/2018", formatter),
        	    LocalDate.parse("14/04/2015", formatter),
        	    LocalDate.parse("07/03/2000", formatter),
        	    LocalDate.parse("10/06/1999", formatter)};
        ventas = new int[]{37456000, 62876000, 123345000, 12500000, 92889000};
        clientes = new int[]{342, 2347, 5654, 398, 2554};
    }

    public void ordenarNegocios(Algoritmos algoritmos) {
        // Ordenar negocios con el algoritmo seleccion
        String[] negociosOrdenados = algoritmos.seleccionString(negocios);
        
        // Mostrar negocios ordenados
        for (String negocio : negociosOrdenados) {
            System.out.println(negocio);
        }
        
    }
    public void ordenarFechas(Algoritmos algoritmos) {
        // Ordenar fechas con el algoritmo seleccion
        LocalDate[] fechasOrdenadas = algoritmos.seleccionFecha(fechas);

        // Mostrar fechas ordenadas
        for (LocalDate fecha : fechasOrdenadas) {
            System.out.println(fecha);
        }
    }
    public void ordenarVentas(Algoritmos algoritmos) {
        // Ordenar ventas con el algoritmo seleccion
        int[] ventasOrdenadas = algoritmos.seleccion(ventas);

        // Mostrar ventas ordenadas
        for (int venta : ventasOrdenadas) {
            System.out.println(venta);
        }
    }
    public void ordenarClientes(Algoritmos algoritmos) {
        // Ordenar clientes con el algoritmo seleccion
        int[] clientesOrdenados = algoritmos.seleccion(clientes);

        // Mostrar clientes ordenados
        for (int cliente : clientesOrdenados) {
            System.out.println(cliente);
        }
    }
    
    
    
    
    
    
    
    
    public void ordenarNegociosBurbuja(Algoritmos algoritmos) {
        // Ordenar negocios con el algoritmo seleccionado
        String[] negociosOrdenados = algoritmos.burbuja(negocios);
        
        // Mostrar negocios ordenados
        for (String negocio : negociosOrdenados) {
            System.out.println(negocio);
        }
        
    }
    public void ordenarFechasBurbuja(Algoritmos algoritmos) {
        // Ordenar fechas con el algoritmo seleccionado
        LocalDate[] fechasOrdenadas = algoritmos.burbujaFecha(fechas);

        // Mostrar fechas ordenadas
        for (LocalDate fecha : fechasOrdenadas) {
            System.out.println(fecha);
        }
    }
    public void ordenarVentasBurbuja(Algoritmos algoritmos) {
        // Ordenar ventas con el algoritmo seleccionado
        int[] ventasOrdenadas = algoritmos.burbujaEntero(ventas);

        // Mostrar ventas ordenadas
        for (int venta : ventasOrdenadas) {
            System.out.println(venta);
        }
    }
    public void ordenarClientesBurbuja(Algoritmos algoritmos) {
        // Ordenar clientes con el algoritmo seleccionado
        int[] clientesOrdenados = algoritmos.burbujaEntero(clientes);

        // Mostrar clientes ordenados
        for (int cliente : clientesOrdenados) {
            System.out.println(cliente);
        }
    }
    
    
    
    
    
    
    public void ordenarNegociosInserccion(Algoritmos algoritmos) {
        // Ordenar negocios con el algoritmo seleccionado
        String[] negociosOrdenados = algoritmos.ordenamientoPorInsercion(negocios);
        
        // Mostrar negocios ordenados
        for (String negocio : negociosOrdenados) {
            System.out.println(negocio);
        }
        
    }
    public void ordenarFechasInserccion(Algoritmos algoritmos) {
        // Ordenar fechas con el algoritmo seleccionado
        LocalDate[] fechasOrdenadas = algoritmos.insercionFecha(fechas);

        // Mostrar fechas ordenadas
        for (LocalDate fecha : fechasOrdenadas) {
            System.out.println(fecha);
        }
    }
    public void ordenarVentasInsercion(Algoritmos algoritmos) {
        // Ordenar ventas con el algoritmo seleccionado
        int[] ventasOrdenadas = algoritmos.ordenamientoPorInsercion(ventas);

        // Mostrar ventas ordenadas
        for (int venta : ventasOrdenadas) {
            System.out.println(venta);
        }
    }
    public void ordenarClientesInserccion(Algoritmos algoritmos) {
        // Ordenar clientes con el algoritmo seleccionado
        int[] clientesOrdenados = algoritmos.ordenamientoPorInsercion(clientes);

        // Mostrar clientes ordenados
        for (int cliente : clientesOrdenados) {
            System.out.println(cliente);
        }
    }

	public String[] getNegocios() {
		return negocios;
	}

	public void setNegocios(String[] negocios) {
		this.negocios = negocios;
	}

	

	public int[] getVentas() {
		return ventas;
	}

	public void setVentas(int[] ventas) {
		this.ventas = ventas;
	}

	public int[] getClientes() {
		return clientes;
	}

	public void setClientes(int[] clientes) {
		this.clientes = clientes;
	}

	public LocalDate[] getFechas() {
		return fechas;
	}

	public void setFechas(LocalDate[] fechas) {
		this.fechas = fechas;
	}

	public DateTimeFormatter getFormatter() {
		return formatter;
	}

	public void setFormatter(DateTimeFormatter formatter) {
		this.formatter = formatter;
	}
	
    
    
    
    
    

		
}
