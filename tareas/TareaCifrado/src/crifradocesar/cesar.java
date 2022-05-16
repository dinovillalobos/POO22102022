/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crifradocesar;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL J13MXR2
 */
public class cesar extends JFrame{
    FlowLayout Layout;
    JTextField cuadro1;
    JTextField cuadro2;
    JLabel resultado;
    JLabel tx1;
    JLabel tx2;
    JLabel N;
    JButton boton;

    public cesar() throws HeadlessException {
        Layout = new FlowLayout();
        this.setLayout(Layout);
        cuadro1 = new JTextField(5); 
        cuadro2 = new JTextField(15);
        resultado = new JLabel("");
        tx1 = new JLabel("Tipo de desplazamiento:");
        tx2 = new JLabel("Ingrese un mensaje con minusculas :");
        N = new JLabel("Mensaje cifrado:");
        boton = new JButton("CIFRAR");
       
        this.getContentPane().add(tx1);
        this.getContentPane().add(cuadro1);
        this.getContentPane().add(tx2);
        this.getContentPane().add(cuadro2);
        
      
        this.getContentPane().add(boton);
        this.getContentPane().add(N);
        this.getContentPane().add(resultado);
        this.setTitle("Cifrado Cesar");
        this.setSize(500, 400);
        this.pack();
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
 
            public void windowClosing(WindowEvent e) {
                System.exit(0);
               
            }
        });
        this.boton.addMouseListener(new MouseAdapter() {
        
            @Override
            public void mouseClicked(MouseEvent e) {
                String abecedario = "abcdefghijklmnñopqrstuvwxyz";
                int clave = Integer.parseInt(cuadro1.getText());
                String letras = cuadro2.getText();
                String Encriptar = "";
                
                for (int i = 0; i < letras.length (); i++){
                   for(int j = 0 ; j < abecedario.length() ; j ++){
                      if(letras.charAt(i) == abecedario.charAt(j)){
                       if( j + clave < 0){
                      Encriptar += abecedario.charAt(abecedario.length() + (clave -j));
                         }
                         else{
                         Encriptar += abecedario.charAt( j + clave);
                          }
                           }
                         }}
                
                resultado.setText(Encriptar);
                
                
            }
        });
            
    }
    }
    
            

    
    
