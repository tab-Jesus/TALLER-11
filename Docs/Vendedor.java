/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller11.Docs;

/**
 *
 * @author JESUS DAVID
 */
public class Vendedor extends Empleado {
    
    
     double salarioBase;
    private double comision;

    public Vendedor(double salarioBase, double comision) {
        
        
        
        this.salarioBase = salarioBase;
          this.comision = comision;
        
        
    }
    
    

    @Override
    public double calcularSalario() {
        
        return salarioBase + comision;
        
        
        
    }
}
