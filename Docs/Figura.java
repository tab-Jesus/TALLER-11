
package co.edu.udec.s2.taller11.Docs;

/**
 *
 * @author JESUS DAVID
 */
public abstract class Figura {
    public abstract double calcularArea();
    
    public void mostrarArea(){
        
        System.out.println("Area:" + calcularArea());
        
        
    }
    
    public class Circulo extends Figura {
        
        double radio;
        
        public Circulo (double radio) {
            
           this.radio = radio; 
            
            
        }
        
        @Override public double calcularArea (){
            
            return Math.PI * radio * radio;
            
        }
        
        public class Rectangulo extends Figura {
            
            double ancho;
            double alto;
            
            public Rectangulo (double ancho , double alto){

            }
            
              @Override
              
              public double calcularArea() {
                  
                  return ancho * alto;
                  
              }
            
        }
    }
    
    
}