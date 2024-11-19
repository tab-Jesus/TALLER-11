/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller11.Docs;

/**
 *
 * @author JESUS DAVID
 */
public abstract class Empleado {
    public abstract double calcularSalario();
    

    public void mostrarDetalles() {
        
        
        System.out.println("salario: " + calcularSalario());
        
        
    }
}

