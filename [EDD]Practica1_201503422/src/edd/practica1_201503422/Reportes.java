/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1_201503422;

import Listas.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author freni_000
 */
public class Reportes {
    //C:\Program Files (x86)\Graphviz2.38\bin\dot.exe
    private void crear(String nombre)
    {
        
         try {
      
          String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";

          String fileInputPath = "C:\\Users\\freni_000\\Desktop\\Practica1EDD\\"+nombre+".txt";
          String fileOutputPath = "C:\\Users\\freni_000\\Desktop\\Practica1EDD\\"+nombre+".jpg";

          String tParam = "-Tjpg";
          String tOParam = "-o";

          String[] cmd = new String[5];
          cmd[0] = dotPath;
          cmd[1] = tParam;
          cmd[2] = fileInputPath;
          cmd[3] = tOParam;
          cmd[4] = fileOutputPath;

          Runtime rt = Runtime.getRuntime();
          rt.exec( cmd );
      
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
    }
    }
    public void Jugadores(Lista_Circular jugador){
        try {
            String ruta = "C:\\Users\\freni_000\\Desktop\\Practica1EDD\\jugadores.txt";
            File archivo = new File(ruta);
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("digraph G {");
            Nodo_Lista_Circular inicio;
            inicio=jugador.getInicio();
            do{
                bw.write(inicio.getValor()+"->"+inicio.getSiguiente().getValor()+" ");
                inicio=inicio.getSiguiente();
            }while(inicio!=jugador.getInicio());            
            bw.write("}");
            bw.close();
            crear("jugadores");
        } catch (IOException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void Mano(Lista_Simple mano, String jugador){
        try {
            String ruta = "C:\\Users\\freni_000\\Desktop\\Practica1EDD\\mano.txt";
            File archivo = new File(ruta);
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("digraph G {");
            Nodo_Lista_Simple inicio;
            inicio=mano.getInicio();
            
            int i=0;
            while(inicio.getSiguiente()!=null){
                bw.write(i+"[label="+inicio.getValor()+"] ");
                inicio=inicio.getSiguiente();
                i++;
            }
            bw.write(jugador +"->"+0+" ");
            for (int j =0; j<i-1;j++){
                    bw.write(j+"->"+(j+1)+" ");
            }
            bw.write("}");
            bw.close();
            crear("mano");
        } catch (IOException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void diccionario(Lista_Simple diccionario){
        try {
            String ruta = "C:\\Users\\freni_000\\Desktop\\Practica1EDD\\diccionario.txt";
            File archivo = new File(ruta);
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("digraph G {");
            Nodo_Lista_Simple inicio;
            inicio=diccionario.getInicio();
             int i=0;
            while(inicio.getSiguiente()!=null){
                bw.write(i+"[label="+inicio.getValor()+"] ");
                inicio=inicio.getSiguiente();
                i++;
            }
            for (int j =0; j<i-1;j++){
                    bw.write(j+"->"+(j+1)+" ");
            }
            bw.write("}");
            bw.close();
            crear("diccionario");
        } catch (IOException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void TotalFichas(Cola ficha){
        try {
            Cola prueba=ficha;
            Cola.Nodo recorrido=prueba.getCabeza();
            String ruta = "C:\\Users\\freni_000\\Desktop\\Practica1EDD\\fichas.txt";
            File archivo = new File(ruta);
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("digraph G {");            
             int i=0;
            while(recorrido!=null){
                bw.write(i+"[label="+recorrido.valor+"] ");                
                recorrido=recorrido.siguiente;
                i++;
            }
            for (int j =0; j<i-1;j++){
                    bw.write(j+"->"+(j+1)+" ");
            }
            bw.write("}");
            bw.close();
            crear("fichas");
        } catch (IOException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
