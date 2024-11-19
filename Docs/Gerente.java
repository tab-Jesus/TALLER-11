
package co.edu.udec.s2.taller11.Docs;

/**
 *
 * @author JESUS DAVID
 */
public class Gerente extends Empleado {
    
    
      double salarioBase;
     double bono;
    

    public Gerente(double salarioBase, double bono) {
        
         this.salarioBase = salarioBase;
        this.bono = bono;
        
        
    }

    @Override
    public double calcularSalario() {
        
        
        
        return salarioBase + bono;
        
    }
    
}
