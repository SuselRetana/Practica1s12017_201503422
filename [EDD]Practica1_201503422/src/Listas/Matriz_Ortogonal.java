/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import javax.swing.JButton;

/**
 *
 * @author freni_000
 */
public class Matriz_Ortogonal {
        private JButton boton;
        private Nodo_Matriz inicio;
        private int tamaño;
    public void Matriz_Ortogonal(){
        inicio=null;
        tamaño=0;    
    }
   public Nodo_Matriz getCabeza(){
   return inicio;
   }
    public void crear(int dim, int alto, int ancho){         
        int altoB=alto/dim;
        int anchoB=ancho/dim;
        for (int posY=0 ; posY<dim ; posY++){ //Recorre las filas
             for (int posX=0 ; posX<dim ; posX++){ //recorre columnas
                 Nodo_Matriz nuevo = new Nodo_Matriz(); //crea el nodo
                 boton = new JButton();                 
                 nuevo.setX(posX); //trabaje con posiciones
                 nuevo.setY(posY); 
                 boton.setBounds(posX*(altoB), posY*(anchoB), altoB, anchoB);
                 nuevo.setCasilla(boton);
                 if(posX==0 && posY==0){ 
                 inicio=nuevo;
                 }else{
                     Nodo_Matriz aux=null;
                     if(posX>0){
                         aux = buscarPosicion(0,posY,dim); //Busco el nodo Inicial de la fila en la que me encuentro (Sí es que ya inserte el inicial)
                    
                  while(aux.getDerecha()!=null)  {
                        aux=aux.getDerecha(); //busco la ultima posicion para insertar el nodo
                    }          
                        aux.setDerecha(nuevo); //puntero derecho
                        nuevo.setIzquierda(aux); //puntero izquierdo
                     }else{
                         aux=nuevo; //Si no he insertado el inicial de la fila, lo creo
                     }
                     if(posY>0){ //Si no es la primer fila, ya inserto puntero abajo, puntero arriba
                         Nodo_Matriz aux2 = buscarPosicion(posX,posY-1,dim);                         
                        aux2.setAbajo(nuevo); 
                        nuevo.setArriba(aux2);
                          }
                        }
                    }
                 }
                 imprimir(dim);
             }                                     
      public Nodo_Matriz buscarPosicion(int X, int Y, int dim){ //buscar nodo por posicion (podes usar este metodo, para obtener datos, insertar dato en el nodo, etc.)
        
        Nodo_Matriz aux= inicio;
        boolean encontrado=false;
        
        for (int posY=0 ; posY<dim; posY++){
            if(Y==aux.getY()){
             for (int posX=0 ; posX<dim; posX++){
                 if(X==aux.getX()){
                     posX=dim+1;
                     posY=dim+1;
                     encontrado=true;
                 }
                 if(encontrado==false){
                 aux=aux.getDerecha();            
                 }
                }                  
            }else{
                aux=aux.getAbajo();
            }            
        }
        return aux;
    }
      public void imprimir(int dim){
        Nodo_Matriz aux1= inicio;
        Nodo_Matriz aux= inicio;
       
        while (aux!=null){
          while (aux.getDerecha()!=null){
              System.out.print("<- ["+aux.getValor()+"]->");
              aux = aux.getDerecha();
        }   
            System.out.print("<- ["+aux.getValor()+"]->");
            System.out.println("   ");
            aux=aux1.getAbajo();
            aux1=aux;
    }
      }
       public Nodo_Matriz buscarCasilla(int X, int Y, int dim){ //buscar nodo por posicion (podes usar este metodo, para obtener datos, insertar dato en el nodo, etc.)
        
        Nodo_Matriz aux= inicio;
        boolean encontrado=false;
        
        for (int posY=0 ; posY<dim; posY++){
            if(Y>=aux.getCasilla().getY()-10 && Y<=aux.getCasilla().getY()+10){
             for (int posX=0 ; posX<dim; posX++){
                 if(X>=aux.getCasilla().getX()-20 && X<=aux.getCasilla().getX()+20){
                     posX=dim+1;
                     posY=dim+1;
                     encontrado=true;
                 }
                 if(encontrado==false){
                 aux=aux.getDerecha();            
                 }
                }                  
            }else{
                aux=aux.getAbajo();
            }            
        }
        return aux;
    }
}    