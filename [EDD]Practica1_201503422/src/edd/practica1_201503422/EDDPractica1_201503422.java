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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
    }
    
}
