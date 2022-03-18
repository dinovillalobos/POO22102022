/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizaciondecodigo;

import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.equipo.Computadora;
import ico.fes.iu.MiVentana;

/**
 *
 * @author DELL J13MXR2
 */
public class ReutilizacionDeCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String facultad = new String("FES Aragon");
        char letra = facultad.charAt(4);
        System.out.println(letra);
        
        Computadora compu=new Computadora();
        compu.setMarca("asus");
        compu.setModelo("VivoBook 2");
        compu.setCpu(new Procesador("Intel", "i9", 5.0f));
       
        Mouse raton=new Mouse ();
        raton.setMarca("Logitech");
        compu.setRaton(raton);
        
        compu.getRaton().setModelo("GS400");
        
        System.out.println( compu );
    }
    
}
