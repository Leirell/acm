import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Arbol extends GCompound {
    private GOval hojas;
    private GRect tronco;
    final int TIEMPO_PARADA = 50;
    final int DESPLAZAMIENTO_X = 1;


    Arbol(double ancho, double alto){
        final double AJUSTE_HOJAS = 1.3;
        final double AJUSTE_TRONCO = 0.7;

        hojas = new GOval(ancho * AJUSTE_HOJAS, alto);
        tronco = new GRect((ancho * AJUSTE_TRONCO - 50), alto * AJUSTE_TRONCO);

        add(tronco,((AJUSTE_TRONCO * ancho / 4)),0);
        add(hojas,(tronco.getX() + (-ancho / 2)),(tronco.getY() + (-alto / 2)));

        hojas.setFilled(true);
        tronco.setFilled(true);

        hojas.setColor(Color.green);
        tronco.setColor(Color.ORANGE);
    }

    public void soplarViento(){
        boolean salir = false;
        double posicionHojas = hojas.getX();
        do {
            while (hojas.getX() < tronco.getX() - 30) {
                hojas.move(DESPLAZAMIENTO_X, 0);
                pause(TIEMPO_PARADA);
            }
            while (hojas.getX() > posicionHojas - 20) {
                hojas.move(-DESPLAZAMIENTO_X, 0);
                pause(TIEMPO_PARADA);
            }
        }while(!salir);
    }
}

