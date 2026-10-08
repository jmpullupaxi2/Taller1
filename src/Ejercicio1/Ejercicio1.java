/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;
import java.util.Scanner;
/**
 *
 * @author labesp
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op;
        CuentaBancaria cuenta= null;
        do{
            System.out.println("==MENU BANCO DE LA ESPE===");
            System.out.println("1. Creacion de Cuenta Bancaria");
            System.out.println("2. Deposito");
            System.out.println("3. Retiro");
            System.out.println("4. Mostrar Datos de la Cuenta Bancaria");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            op=sc.nextInt();
            sc.nextLine();

            switch(op){
                case 1:
                    System.out.println("");
                    System.out.println("===CREACION CUENTA BANCARIA===");
                    System.out.print("Nombre del Titular: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellido del Titular: ");
                    String apellido = sc.nextLine();
                    System.out.print("Tipo Cuenta: ");
                    String tipocuenta = sc.nextLine();
                    System.out.print("Saldo Inicial: ");
                    double saldo= sc.nextDouble();
                    sc.nextLine();
                    
                    cuenta = new CuentaBancaria ( nombre, apellido, tipocuenta, saldo);break;
                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double deposito=sc.nextDouble();                    
                    cuenta.depositar(deposito); break;
                case 3:
                    System.out.print("Ingrese el Monto a Retirar: ");
                    double retiro=sc.nextDouble();                   
                    cuenta.retirar(retiro);break;
                case 4:                    
                    cuenta.mostrarSaldo();break;
                case 5: break;
                default:
                    System.out.println("Opcion No Valida!!");break;
                    }          
        }while (op!=5);
        sc.close();
    }    
}
