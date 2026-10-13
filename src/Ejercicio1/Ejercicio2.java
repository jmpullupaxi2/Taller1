/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int op ;
        Vehiculo vehi[] = null;
        System.out.print("Cuantos vehiculos desea matricular: ");
        int n = sc.nextInt();
        sc.nextLine();
        do {
            System.out.println("SISTEMA DE MATRICULACION VEHICULAR");
            System.out.println("1. Ingreso de vehiculos");
            System.out.println("2. Revision vehicular");
            System.out.println("3. Matricular");
            System.out.println("4. Mostrar datos");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch (op){
                case 1 :
                    vehi = new Vehiculo[n]; //se definio un objeto array, se esta conteniendo a varios vehiculso
                    for (int i = 0; i < n; i++) {
                    System.out.println("Datos vehiculo " + (i+1) + ":");
                    System.out.println("Marca: ");
                    String marca = sc.nextLine();
                    System.out.println("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.println("Estado: ");
                    String estado = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Anio de fabricacion: ");
                    int anio = sc.nextInt();
                    sc.nextLine();
                    
                    vehi[i] = new Vehiculo(marca, modelo, estado, anio);
            }break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        vehi[i].revisionVehicular();
                    }break;
                case 3:
                    for (int i = 0; i < n; i++) {
                       vehi[i].matricula();
                    }break;
                case 4: 
                    for (int i = 0; i < n; i++) {
                        vehi[i].mostrarDatos();
                    }break;
        }
        
        }while(op != 5);
        
       sc.close();
    }
    
}