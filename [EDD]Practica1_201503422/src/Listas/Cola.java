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
public class Cola {
    class Nodo{
        String valor;
        Nodo siguiente;
    }
    private Nodo cabeza, fin;
    public Cola(){
        this.cabeza=this.fin=null;
    }
    public boolean esVacia(){
        return cabeza==null;
    }
    public void offer(String valor){
        Nodo nuevo = new Nodo();
        nuevo.valor=valor;
        nuevo.siguiente=null;
        if(esVacia()){
            cabeza=nuevo;
            fin=nuevo;
        }else{
            fin.siguiente=nuevo;
            fin=nuevo;
        }
    }
    public String peek(){
        if(!esVacia()){
            String valor= cabeza.valor;
            if(cabeza==fin){
                cabeza=null;
                fin=null;
            }else{
                cabeza=cabeza.siguiente;
            }
            return valor;
        }else{
            return "cola vacia";
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
