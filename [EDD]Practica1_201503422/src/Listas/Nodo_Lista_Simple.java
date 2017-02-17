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
    private Nodo_Lista_Simple siguiente;
    
    public void Nodo_Lista_Simple(){
        this.valor="";
        this.siguiente = null;    
    }
    public String getValor(){
    return valor;
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
}
