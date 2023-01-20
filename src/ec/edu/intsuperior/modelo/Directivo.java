/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author NOTEBOOK
 */
public class Directivo extends Persona {
    private String categoria;
    private int idDirectivo;

    public Directivo() {
    }

    public Directivo(String categoria, int idDirectivo, String cedula, String nombre1, String nombre2, String apellido1, String apellido2, Date fechaNacimiento, String direccion, String telefono, String email) {
        super(cedula, nombre1, nombre2, apellido1, apellido2, fechaNacimiento, direccion, telefono, email);
        this.categoria = categoria;
        this.idDirectivo = idDirectivo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getIdDirectivo() {
        return idDirectivo;
    }

    public void setIdDirectivo(int idDirectivo) {
        this.idDirectivo = idDirectivo;
    }
    
    
    
}
