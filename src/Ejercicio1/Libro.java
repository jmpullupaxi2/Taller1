/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author labesp
 */
public class Libro {
    //Metodos
    String titulo, autor, estado;
    int paginas;
    
    //Constructores
    public Libro() {
    }
    
    public Libro(String titulo, String autor, String estado, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = "Disponible";
        this.paginas = paginas;
    }
    
    //Atributos
    public void prestar (){
        if(estado.equalsIgnoreCase("Disponible")){
            estado = "prestado";
            System.out.println("El Libro fue prestado con exito!!");
        }else {
            System.out.println("El Libro no esta disponible - Prestado__Extraviado");
        }
    }

    public void devolver (){
        if(estado.equalsIgnoreCase("prestado")){
            estado= "disponible";
            System.out.println("Libro devuelto");
        }else{
            System.out.println("Libro sin prestar");
        }
    }
    public void mostrarinfo (){
        System.out.println("---Estado del Libro---");
        System.out.println("TItulo del libro: "+titulo);
        System.out.println("Autor del Libro: "+autor);
        System.out.println("Estado del libro: "+estado);
        System.out.println("N Paginas: "+paginas);
        
    }
}
