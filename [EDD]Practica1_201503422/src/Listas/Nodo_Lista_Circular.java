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
public class Nodo_Lista_Circular {
    private int punteo;
    private String valor;    
    private Nodo_Lista_Circular siguiente;
    private Lista_Simple listaLetras;
    public void Nodo_Lista_Circular(){
        this.valor="";
        this.siguiente=null;
    }    
    public String getValor(){
        return valor;
    }
     public int getPunteo(){
        return punteo;
    }
    public Lista_Simple getLetras(){
        return listaLetras;
    }
    public void setValor(String valor, Lista_Simple letras, int punteo){
        this.valor=valor;        
        this.listaLetras=letras;
        this.punteo=punteo;        
    }
    public Nodo_Lista_Circular getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(Nodo_Lista_Circular siguiente){
        this.siguiente=siguiente;
    }
}
