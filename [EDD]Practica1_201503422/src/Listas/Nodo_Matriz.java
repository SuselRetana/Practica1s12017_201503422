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
public class Nodo_Matriz {
    private int valor;
    private int posX;
    private int posY;    
    private JButton casilla;
   
    private Nodo_Matriz derecha;
    private Nodo_Matriz izquierda;
    private Nodo_Matriz arriba;
    private Nodo_Matriz abajo;

     public void Nodo_Matriz(){
        this.valor=-1;
        this.derecha = null;    
        this.izquierda = null;    
        this.arriba = null;    
        this.abajo = null;    
    }
    public int getValor(){
    return valor;
    }
     public int getX(){
    return posX;
    }
      public int getY(){
    return posY;
    }
    public JButton getCasilla(){
    return casilla;
    }
    
    
    public Nodo_Matriz getDerecha(){
    return derecha;
    }
    public void  setDerecha(Nodo_Matriz derecha){
    this.derecha=derecha;    
    }
    public Nodo_Matriz getIzquierda(){
    return izquierda;
    }
    public void  setIzquierda(Nodo_Matriz izquierda){
    this.izquierda=izquierda;    
    }
    public Nodo_Matriz getArriba(){
    return arriba;
    }
    public void  setArriba(Nodo_Matriz arriba){
    this.arriba=arriba;    
    }
    public Nodo_Matriz getAbajo(){
    return abajo;
    }
    public void  setAbajo(Nodo_Matriz abajo){
    this.abajo=abajo;    
    }
    
    
    public void  setValor(int valor){
    this.valor=valor;
    }
     public void  setCasilla(JButton casilla){
    this.casilla=casilla;
    }
    public void  setX(int X){
    this.posX=X;
    }
    public void  setY(int Y){
    this.posY=Y;
    }
}
