/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author DELL J13MXR2
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("BANCO ");
        System.out.println("tarea");
        System.out.println("------------------------");
        
        int[] idCliente3 ={15963,35741,95147,75369,78921};
        
        float[] balance ={15000,16000,12500,20000,14000};
        
        String[] nombre={"Angel","Emiliano","Ricardo","Derek","Leonardo"};
             String res="";
        int i = 0;
        
             String Angel =("Nombre: "+ nombre[i]+ "ID: " +"Tu balance es de :" + "Ees: "+res);
        
           
            for(float bal:balance){
            
            if (bal<=15000){
             res= "  Cliente regular ";    
             System.out.println("  Estado de cuenta:"+ bal );
                }else{
                res= "  Cliente premiun  ";   
                System.out.println("  Estado de cuenta: "+bal );
            }
             System.out.println(res);    
                         
            }
        //System.out.println(nombre[0]);
       
            
        
    }
    }
    
