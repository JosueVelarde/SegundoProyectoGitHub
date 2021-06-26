/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoproyectogithub;

import java.util.ArrayList;

/**
 *
 * @author DarkEvilBlood
 */
public class ClaseArrayList {
 
    public  ArrayList<String>articulos = new ArrayList<String>();
    public  ArrayList<String>apartados = new ArrayList<String>();
    public  ArrayList<String>opciones = new ArrayList<String>();
    public  ArrayList<String>texto = new ArrayList<String>();

    public ArrayList<String> Mostrararticulos(){
        articulos.toString().replace("[", "").replace("]", "");
        return articulos;
    }
    
    public void LlenarArticulos(){
        articulos.add("1");
        articulos.add("2");
        articulos.add("3");
        articulos.add("4");
        articulos.add("5");
        articulos.add("6");
    }    
    
    public void LlenarApartados(){
        apartados.add("1");
        apartados.add("2");
        apartados.add("3");
        apartados.add("4");
        apartados.add("5");
    }  
    
    public void LlenarOpciones(){
        opciones.add("a");
        opciones.add("b");
        opciones.add("c");
        opciones.add("d");
        opciones.add("e");
        opciones.add("f");
    }
    
    public void LlenarTexto(){
        texto.add("La seguridad ciudadana es un requisito indispensable para el pleno ejercicio de los derechos fundamentales y las libertades públicas, y su salvaguarda, como bien jurídico de carácter colectivo, "
                + "es función del Estado, con sujeción a la Constitución y a las Leyes");
        texto.add("Esta Ley tiene por objeto la regulación de un conjunto plural y diversificado de actuaciones de distinta naturaleza orientadas a la tutela de la seguridad ciudadana, mediante la protección de "
                + "personas y bienes y el mantenimiento de la tranquilidad de los ciudadanos.");
    }
    
    public String artciulos(String articulo){
        LlenarArticulos();
        for(int i = 0; i < articulos.size(); i++){
            if(articulos.get(i).toString().equalsIgnoreCase(articulo)){
                return "Articulo: " + articulos.get(i).toString();
            }
        }
        return null;
    }
}
