/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1_201503422;
import Listas.*;
import java.io.*;
import java.util.*;
import org.jdom.*; 
import org.jdom.input.*; 
/**
 *
 * @author freni_000
 */
public class XML {
    public int dimension;
    public Lista_Simple casillas;
    public Lista_Simple diccionario;
    
    public void abrirArchivo(String Archivo) throws IOException{
        SAXBuilder constructor = new SAXBuilder();
        File archivo = new File(Archivo);
        try
        {
            Document documento= (Document) constructor.build(archivo);
            Element raiz = documento.getRootElement();
            
            //Dimensiones Tablero
            Element dimen = raiz.getChild("dimension");
            this.dimension = Integer.parseInt(dimen.getTextTrim());
            System.out.println("dimension: "+dimension);
        

            casillas = new Lista_Simple();
            //Casillas Dobles
            List casillasDobles = raiz.getChildren("dobles");
            Element casillaDoble = (Element) casillasDobles.get(0);
            List coordenadasDoble = casillaDoble.getChildren();
          
             System.out.println("Casillas Dobles: ");
            for ( int j = 0; j < coordenadasDoble.size(); j++ )
            {
                Element coordenada = (Element)coordenadasDoble.get( j );
                String x = coordenada.getChildTextTrim("x");
                String y = coordenada.getChildTextTrim("y");
                casillas.insertar(x+","+y);               
                System.out.println(x+","+y);
            }
                
                System.out.println("Casillas Triples: ");
            //Casillas Triples
            List casillasTriples = raiz.getChildren("triples");
            Element casillaTriple = (Element) casillasTriples.get(0);
            List coordenadasTriple = casillaTriple.getChildren();
          
            for ( int j = 0; j < coordenadasTriple.size(); j++ )
            {
                Element coordenada = (Element)coordenadasTriple.get( j );
                String x = coordenada.getChildTextTrim("x");
                String y = coordenada.getChildTextTrim("y");
                casillas.insertar(x+","+y);                
                System.out.println(x+","+y);
            }
            
            diccionario = new Lista_Simple();
              //Palabras diccionarios
            Element diccionario = raiz.getChild("diccionario");
            List Palabras = diccionario.getChildren();
            
            for (int i = 0; i < Palabras.size(); i++) {
            Element Palabra = (Element)Palabras.get(i);
            String palabra = Palabra.getTextTrim();
            this.diccionario.insertar(palabra);
            System.out.println(palabra);
            
            //AGREGO LAS PALABRAS A LA LISTA SIMPLE
            }
        }catch ( IOException io ) {
            System.out.println( io.getMessage() );
        }catch ( JDOMException jdomex ) {
            System.out.println( jdomex.getMessage() );
            } 
        }
    
    }
