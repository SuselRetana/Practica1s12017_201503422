/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.util.ArrayList;

/**
 *
 * @author freni_000
 */
public class Cola {
    public class Nodo{
       public String valor;
       public int punteo;
       public Nodo siguiente;
    }
    private Nodo cabeza, fin;
    private int tamaño=0;
    
    public Cola(){
        this.cabeza=this.fin=null;
        this.tamaño=0;
    }
    public Nodo getCabeza(){
    return cabeza;
    }
    public Nodo getSiguiente(){
    return cabeza.siguiente;
    }
    public boolean esVacia(){
        return cabeza==null;
    }
    public int tamaño(){
        return tamaño;
    }
    public void offer(String valor, int punteo){
        Nodo nuevo = new Nodo();
        nuevo.valor=valor;
        nuevo.punteo=punteo;
        nuevo.siguiente=null;
        if(esVacia()){
            cabeza=nuevo;
            fin=nuevo;
        }else{
            fin.siguiente=nuevo;
            fin=nuevo;
        }
        tamaño++;
    }
    public ArrayList peek(){
        if(!esVacia()){
            ArrayList valor = new ArrayList();
            valor.add(cabeza.valor);
            valor.add(cabeza.punteo);            
            if(cabeza==fin){
                cabeza=null;
                fin=null;
            }else{
                cabeza=cabeza.siguiente;
            }
             tamaño--;
            return valor;            
        }else{
            return null;
        }
    }
    public void imprimir(){
        Nodo aux=cabeza;
        while(aux!=null){
        System.out.println(aux.valor+"_");
        aux=aux.siguiente;
        }
    }
}
