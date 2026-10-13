/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author labesp
 */
public class Empleado {
    //Atributos
    String nombre;
    int horasExtras;
    double salarioBase;
    
    //Constructores

    public Empleado() {
    }

    public Empleado(String nombre, int horasExtras) {
        this.nombre = nombre;
        this.horasExtras = horasExtras;
        this.salarioBase = 480;
    }
    //Metodos
    public void calcularSalarioTotal(){
        if(horasExtras > 0){
            salarioBase =(horasExtras *10)+salarioBase;
            System.out.println("El salario  de "+nombre+" con las horas extras es de: "+salarioBase);
        }
    }
    
    public void mostrarDatos(){
        System.out.println("---Datos del personal---");
        System.out.println("Nombre: "+nombre);
        System.out.println("Salario base: 480");
        System.out.println("Horas extras: "+horasExtras);
        System.out.println("Salario incluido horas extras: "+salarioBase);
    }
}
