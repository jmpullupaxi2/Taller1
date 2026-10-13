/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;
import java.util.Scanner;
/**
 *
 * @author labesp
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int op, n;
        Empleado Empleados[] =null;
        
        System.out.print("Ingrese el numero de empleados que desea registrar");
        int n=sc.nextInt();
        sc.nextLine();
        
        do{
            System.out.println("==Menu de Opciones==");
            System.out.println("1. Ingreso de datos");
            System.out.println("2. Calculo de salario");
            System.out.println("3. Mostrar Datos");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            op=sc.nextInt();
            sc.nextLine();
            
            switch (op){
                case 1:
                    Empleados = new Empleado[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("--Datos del empleado--");
                        System.out.print("Ingrese el nombre del empleado "(i+1)+ " :");
                        
                    }
            }
        }
        
    }
    
}
