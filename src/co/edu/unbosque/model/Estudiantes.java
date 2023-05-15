package co.edu.unbosque.model;

import java.io.Serializable;

import java.io.Serializable;

public class Estudiantes implements Serializable {
    private static final long serialVersionUID = 1L;
    private String usuario;
    private String documento;
    private String correoAlternativo;
    private String genero;
    private String programaAcademico;
    private String jornadaAcademica;
    private String lugarNacimiento;
    private int fechaRegistro;
    private boolean perfilActivado;

    public Estudiantes(String usuario, String documento, String correoAlternativo, String genero, String programaAcademico, String jornadaAcademica, String lugarNacimiento) {
        this.usuario = usuario;
        this.documento = documento;
        this.correoAlternativo = correoAlternativo;
        this.genero = genero;
        this.programaAcademico = programaAcademico;
        this.jornadaAcademica = jornadaAcademica;
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreoAlternativo() {
        return correoAlternativo;
    }

    public void setCorreoAlternativo(String correoAlternativo) {
        this.correoAlternativo = correoAlternativo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    public String getJornadaAcademica() {
        return jornadaAcademica;
    }

    public void setJornadaAcademica(String jornadaAcademica) {
        this.jornadaAcademica = jornadaAcademica;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public int getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(int fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isPerfilActivado() {
        return perfilActivado;
    }

    public void setPerfilActivado(boolean perfilActivado) {
        this.perfilActivado = perfilActivado;
    }

    public String[] toArray() {
        String[] estudianteData = {usuario, documento, correoAlternativo, genero, programaAcademico, jornadaAcademica, lugarNacimiento};
        return estudianteData;
    }

    @Override
    public String toString() {
        return "Estudiantes [usuario=" + usuario + ", documento=" + documento + ", correoAlternativo=" + correoAlternativo
            + ", genero=" + genero + ", programaAcademico=" + programaAcademico + ", jornadaAcademica="
            + jornadaAcademica + ", lugarNacimiento=" + lugarNacimiento + ", fechaRegistro=" + fechaRegistro + "]";
    }
}




