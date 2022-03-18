/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libros.Partes;

/**
 *
 * @author DELL J13MXR2
 */
public class Editorial {
    
    private String editorial;
    private String edicion;

    public Editorial() {
    }

    public Editorial(String editorial, String edicion) {
        this.editorial = editorial;
        this.edicion = edicion;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Editorial{" + "editorial=" + editorial + ", edicion=" + edicion + '}';
    }
    
    
}
