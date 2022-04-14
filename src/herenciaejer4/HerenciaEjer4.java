
package herenciaejer4;

import Servicio.CirculoServicio;
import Servicio.RectanguloServicio;

public class HerenciaEjer4 {

    public static void main(String[] args) {
     RectanguloServicio rs=new RectanguloServicio();
     rs.area();
     rs.perimetro();
     
     
     CirculoServicio cs=new CirculoServicio();
     cs.area();
     cs.perimetro();
    }
    
}
