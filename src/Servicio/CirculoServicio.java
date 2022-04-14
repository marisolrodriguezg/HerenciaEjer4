
package Servicio;

import Entidades.Circulo;
import Interfaz.CalculoForma;
import java.util.Scanner;

public class CirculoServicio implements CalculoForma {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //lo tengo que instancear aca afuera porque no me deja pasarlo por parametro en el override
Circulo c1=new Circulo();

    @Override
    public void area() {
        System.out.println("ingresa el radio del circulo");
        c1.setRadio(leer.nextDouble());
       double AreaCirculo=pi*c1.getRadio()*c1.getRadio();
        System.out.println("el area del circulo es de : " +  AreaCirculo);
    }

    @Override
    public void perimetro() {
      double perimetroCirculo=pi*(c1.getRadio()*2);
      System.out.println("el perimetro del circulo es de : " +  perimetroCirculo);
    }
   
}
