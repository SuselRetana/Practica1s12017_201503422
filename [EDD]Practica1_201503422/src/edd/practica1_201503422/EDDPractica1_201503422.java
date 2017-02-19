/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1_201503422;

import Listas.*;

/**
 *
 * @author freni_000
 */
public class EDDPractica1_201503422 {  
    
      public static void main(String args[]) {
      
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    
/*    public static void main(String[] args) {
          Matriz_Ortogonal m = new Matriz_Ortogonal();
          m.insertar(5);
      
      
        Lista_Simple listaS1 = new Lista_Simple();
        listaS1.insertar("1L1");
        listaS1.insertar("1L2");               
        
         Lista_Simple listaS2 = new Lista_Simple();
        listaS2.insertar("2L1");
        listaS2.insertar("2L2");
          
        Lista_Simple listaS3 = new Lista_Simple();
        listaS3.insertar("3L1");
        listaS3.insertar("3L2");
        
        Lista_Circular lista = new Lista_Circular();
        lista.insertar("prueba1",listaS1);
        lista.insertar("prueba2",listaS2);
        lista.insertar("prueba3",listaS3);
        lista.imprimir();
        Cola cola1=new Cola();
        cola1.offer("prueba1");
        cola1.offer("prueba2");
        cola1.offer("prueba3");
        cola1.imprimir();
        System.out.println("Extraemos elemento de la cola:  "+cola1.peek());
        cola1.imprimir(); 
        System.out.println("Insertamos");
        cola1.offer("prueba1");
        cola1.imprimir(); */
    }    
