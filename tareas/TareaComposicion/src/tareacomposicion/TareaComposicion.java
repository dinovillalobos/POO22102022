/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposicion;

import Libros.Libro;
import Libros.Partes.Autor;
import Libros.Partes.Editorial;

/**
 *
 * @author DELL J13MXR2
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("TAREA:COMPOSICION");
        
       Libro lib=new Libro();
       lib.setTitulo("Viaje al centro de la tierra");
       lib.setFormato("Rustico");
       
        Autor persona=new Autor();
        persona.setNombre("Julio");
        persona.setApellido("verne");
        lib.setNombre(persona);
        
        
        Editorial informacion=new Editorial();
        informacion.setEdicion("primera edicion");
        lib.setEdicion(informacion);
        
        System.out.println(lib);
        //System.out.println(persona);
    }
    
}
