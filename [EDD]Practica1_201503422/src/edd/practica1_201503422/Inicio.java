/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1_201503422;

import Listas.*;
import java.awt.Component;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.filechooser.*;

/**
 *
 * @author freni_000
 */
public class Inicio extends javax.swing.JFrame {
    public  Lista_Circular jugadores;
    public Cola Abecedario ;
    public ArrayList letras;
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        arch = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton1.setLabel("Subir Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(arch);

        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("S C R A B B L E");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // create a filechooser;
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter xmlfilter = new FileNameExtensionFilter("xml files (*.xml)", "xml");
        chooser.setDialogTitle("Open schedule file");
        // set selected filter
        chooser.setFileFilter(xmlfilter);
        int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " +
                    chooser.getSelectedFile().getName());       
            arch.setText(chooser.getSelectedFile().getPath());
            XML arch = new XML();
            try {
                arch.abrirArchivo(chooser.getSelectedFile().getName());
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        listadoLetras();    
        LetrasJuego(letras);
        
        jugadores=new Lista_Circular();
        String textomsg ="Ingrese Nombre del Jugador";
        boolean ingresar = true;
        int contJugadores =1;
        
        while(ingresar && contJugadores<11){
        JFrame frame = new JFrame("InputDialog Example #2");
        String code = JOptionPane.showInputDialog(
        frame, 
        textomsg, 
        "Ingrese Jugador: "+contJugadores, 
        JOptionPane.WARNING_MESSAGE
        );
        if(code!=null){
            if(jugadores.buscar(code)==false){
            Lista_Simple mano = new Lista_Simple();
            for(int n = 0; n<7;n++){
                mano.insertar(Abecedario.peek());
            }
            jugadores.insertar(code, mano);   
            contJugadores++;
            textomsg ="Ingrese Nombre del Jugador";
            }else{
                textomsg="Nombre Jugador ya existente, ingrese de nuevo";
            }
        }else{
            ingresar=false;
        }        
        }
        if(contJugadores>=10 && ingresar==true){
             showMessageDialog(null, "Ah llegado al Máximo de Jugadores", " Total Jugadores :" + contJugadores, PLAIN_MESSAGE);          
        }
        jugadores.imprimir();

    }//GEN-LAST:event_jButton2ActionPerformed
 private void listadoLetras()
    {
        letras = new ArrayList();
        for(int i=0;i<12;i++)
         {
            letras.add("A");
            letras.add("E");
          }
         for(int i=0;i<9;i++)
         {
             letras.add("O");
         }
         for(int i=0; i<6;i++)
         {
             letras.add("I");
             letras.add("S");
         }
         for(int i=0;i<5;i++)
         {
             letras.add("N");
             letras.add("R");
             letras.add("U");
             letras.add("D");
         }
         for(int i=0;i<4;i++)
         {
             letras.add("L");
             letras.add("T");
             letras.add("C");
         }
         for(int i=0;i<2;i++)
         {
             letras.add("G");
             letras.add("B");
             letras.add("M");
             letras.add("P");
             letras.add("H");
         }
         letras.add("F");
         letras.add("V");
         letras.add("Y");
         letras.add("Q");
         letras.add("J");
         letras.add("Ñ");
         letras.add("X");
         letras.add("Z");
    }
    private void LetrasJuego(ArrayList letras)
    {
        Abecedario=new Cola();
        int rnd;
        for(int i=0 ;i<letras.size();i++)
        {
            rnd = (int) (Math.random()*letras.size());
            Abecedario.offer((String) letras.get(rnd));            
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane arch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
