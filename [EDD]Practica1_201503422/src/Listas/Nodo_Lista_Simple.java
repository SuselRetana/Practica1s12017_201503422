/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author freni_000
 */
public class Nodo_Lista_Simple {
    private String valor;
    private int puntos;
    private Nodo_Lista_Simple siguiente;
    private Nodo_Matriz casilla;
    public void Nodo_Lista_Simple(){
        this.valor="";
        this.siguiente = null;    
    }
    public String getValor(){
    return valor;
    }
    public int getPunto(){
    return puntos;
    }
    public Nodo_Matriz getCasilla(){
    return casilla;
    }
    public Nodo_Lista_Simple getSiguiente(){
    return siguiente;
    }
    public void  setSiguiente(Nodo_Lista_Simple siguiente){
    this.siguiente=siguiente;    
    }
     public void  setValor(String valor){
    this.valor=valor;
    }
     public void  setPuntos(int valor){
    this.puntos=valor;
    }
      public void  setCasilla(Nodo_Matriz valor){
    this.casilla=valor;
    }
}
