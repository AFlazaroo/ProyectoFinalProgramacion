package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Random;

public class Crud {
	private ArrayList<Estudiantes> estudiantesRegistrados;

    public Crud() {
        this.estudiantesRegistrados = new ArrayList<>();
    }

    // Método para registrar un estudiante
    public void registrarEstudiante(Estudiantes estudiante) {
        estudiantesRegistrados.add(estudiante);
        System.out.println("El estudiante " + estudiante.getUsuario() + " ha sido registrado.");
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
}


