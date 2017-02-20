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
public class Lista_Circular {
    private Nodo_Lista_Circular inicio;
    private Nodo_Lista_Circular ultimo;
    private int tamaño;
    
    public void Lista_Circular(){
        inicio = null;
        ultimo = null;
        tamaño = 0;
    } 
    public boolean esVacia(){
        return inicio==null;
    }
    public int getTamaño(){
        return tamaño;
    }
    public void insertar(String valor,  Lista_Simple lista){
         Nodo_Lista_Circular nuevo = new Nodo_Lista_Circular();     
         nuevo.setValor(valor,lista);
        if(esVacia()){
           inicio=nuevo;
           ultimo=nuevo;
           ultimo.setSiguiente(inicio);           
        }else{
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            ultimo=nuevo;        
    }
        tamaño++;
    }
     public void eliminar(){
        inicio = null;
        ultimo = null;
        tamaño = 0;
    } 
      public void imprimir(){
        if (!esVacia()) {
            Nodo_Lista_Circular aux = inicio;
            int posicion = 0;
            System.out.print("-> ");
            do{
                System.out.print(posicion + ".[ " + aux.getValor() + "_Lista Interna :");                
                aux.getLetras().imprimir();
                System.out.print( " _ ]" + " ->  ");                
                aux = aux.getSiguiente();
                posicion++;
            }while(aux != inicio);
        }
    }
      public boolean buscar(String referencia){
          boolean encontrado = false;
           Nodo_Lista_Circular aux = inicio;
           if(aux!=null){           
          do{
              if(aux.getValor().equalsIgnoreCase(referencia)){
                    encontrado=true;
                    aux=inicio;
              }else{
                    aux=aux.getSiguiente();
               }
          }while(aux!=inicio);
           }
          return encontrado;
      }

}
