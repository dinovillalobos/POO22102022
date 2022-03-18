/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libros;

import Libros.Partes.Autor;
import Libros.Partes.Editorial;

/**
 *
 * @author DELL J13MXR2
 */
public class Libro {
    
    private String titulo;
    private String formato;
    
    private Autor nombre;
    private Editorial edicion;

    public Libro() {
    }

    public Libro(String titulo, String formato, Autor nombre, Editorial edicion) {
        this.titulo = titulo;
        this.formato = formato;
        this.nombre = nombre;
        this.edicion = edicion;
    }

    public Editorial getEdicion() {
        return edicion;
    }

    public void setEdicion(Editorial edicion) {
        this.edicion = edicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Autor getNombre() {
        return nombre;
    }

    public void setNombre(Autor nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", formato=" + formato + ", nombre=" + nombre + ", edicion=" + edicion + '}';
    }
    
    
    
}
