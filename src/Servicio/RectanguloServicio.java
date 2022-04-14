
package Servicio;

import Entidades.Rectangulo;
import Interfaz.CalculoForma;
import java.util.Scanner;

public class RectanguloServicio implements CalculoForma{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //lo tengo que instancear aca afuera porque no me deja pasarlo por parametro en el override
    Rectangulo r1=new Rectangulo();
    
    
    @Override
    public void area() {

        System.out.println("ingrese la base del rectangulo");
        r1.setBase(leer.nextDouble());
        
        System.out.println("ingrese la altura del rectangulo");
        r1.setAltura(leer.nextDouble());
        
      double AreaRectangulo= r1.getBase()*r1.getAltura();
        System.out.println("el area der rectangulo es : " + AreaRectangulo );
    }

    @Override
    public void perimetro() {
      
     double perimetro= (r1.getBase()+r1.getAltura())*2;
     System.out.println("el area der rectangulo es : " + perimetro);
    }
    
}
