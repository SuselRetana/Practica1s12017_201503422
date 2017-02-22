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
public class Lista_Simple {
        private Nodo_Lista_Simple inicio;
        private int tamaño;
    public void Lista_Simple(){
        inicio=null;
        tamaño=0;    
    }
     public Nodo_Lista_Simple getInicio(){
        return inicio;
    }
    public boolean esVacia(){
        return inicio==null;
    }
    public int getTamaño(){
        return tamaño;
    }
    public void insertar(String valor){
        Nodo_Lista_Simple nuevo = new Nodo_Lista_Simple();
        nuevo.setValor(valor);
         if(esVacia()){
            inicio=nuevo;
        }else{
            Nodo_Lista_Simple aux = inicio;
         while(aux.getSiguiente()!=null)  {
             aux=aux.getSiguiente();
         }          
            aux.setSiguiente(nuevo);
        }
        tamaño++;
    }
    public void insertarMano(String valor, int punto){
        Nodo_Lista_Simple nuevo = new Nodo_Lista_Simple();
        nuevo.setValor(valor);
        nuevo.setPuntos(punto);
         if(esVacia()){
            inicio=nuevo;
        }else{
            Nodo_Lista_Simple aux = inicio;
         while(aux.getSiguiente()!=null)  {
             aux=aux.getSiguiente();
         }          
            aux.setSiguiente(nuevo);
        }
        tamaño++;
    }
    public void insertarJuego(Nodo_Matriz valor){
        Nodo_Lista_Simple nuevo = new Nodo_Lista_Simple();
        nuevo.setCasilla(valor);
         if(esVacia()){
            inicio=nuevo;
        }else{
            Nodo_Lista_Simple aux = inicio;
         while(aux.getSiguiente()!=null)  {
             aux=aux.getSiguiente();
         }          
            aux.setSiguiente(nuevo);
        }
        tamaño++;
    }
    public boolean buscar(String referencia){
        Nodo_Lista_Simple aux= inicio;
        boolean encontrado=false;
        while(aux!=null && encontrado!=true){
            if(referencia.equalsIgnoreCase(aux.getValor())){
                encontrado=true;
            }else{
                aux=aux.getSiguiente();
            }
        }
        return encontrado;
    }
      public int buscarR(String referencia){
        Nodo_Lista_Simple aux= inicio;
        boolean encontrado=false;
        while(aux!=null && encontrado!=true){
            if(referencia==aux.getValor()){
                encontrado=true;
            }else{
                aux=aux.getSiguiente();
            }
        }
        return aux.getPunto();
    }
    
    public void eliminarLista(){
        inicio = null;
        tamaño = 0;
    }
    public void imprimir(){
        if (!esVacia()) {
            Nodo_Lista_Simple aux = inicio;
            int posicion = 0;
            while(aux != null){
                System.out.print(posicion + ".[ " + aux.getValor() + " ]" + " ->  ");
                aux = aux.getSiguiente();
                posicion++;
            }
        }
    }
    public void imprimirNodo(){
        if (!esVacia()) {
            Nodo_Lista_Simple aux = inicio;
            int posicion = 0;
            while(aux != null){
                System.out.print(posicion + ".[ " + aux.getCasilla().getX()+"_"+ aux.getCasilla().getY()+" ]" + " ->  ");
                aux = aux.getSiguiente();
                posicion++;
            }
        }
    }
    
    public void eliminarElemento(String referencia){
        if(buscar(referencia)){
            if(inicio.getValor()==referencia){
                inicio=inicio.getSiguiente();
            }else{
                Nodo_Lista_Simple aux = inicio;
            while(aux.getSiguiente().getValor()!=referencia){
                aux=aux.getSiguiente();
            }
            Nodo_Lista_Simple siguiente = aux.getSiguiente().getSiguiente();
            aux.setSiguiente(siguiente);
            }
            tamaño--;
        }
    }
}
