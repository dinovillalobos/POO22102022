/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author DELL J13MXR2
 */
public class Teclado {
    private String marca;
    private int numeroTecaldo;
    private boolean multimedia; //true =multimedia 

    public Teclado() {
    }

    public Teclado(String marca, int numeroTecaldo, boolean multimedia) {
        this.marca = marca;
        this.numeroTecaldo = numeroTecaldo;
        this.multimedia = multimedia;
    }

    public boolean isMultimedia() {
        return multimedia;
    }

    public void setMultimedia(boolean multimedia) {
        this.multimedia = multimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroTecaldo() {
        return numeroTecaldo;
    }

    public void setNumeroTecaldo(int numeroTecaldo) {
        this.numeroTecaldo = numeroTecaldo;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", numeroTecaldo=" + numeroTecaldo + ", multimedia=" + multimedia + '}';
    }
    
    
    
}
