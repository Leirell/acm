import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Parque extends GraphicsProgram {
    static Arbol arbol1, arbol2, arbol3, arbol4, arbol5;

    static final int ANCHO_PANTALLA = 1920;
    static final int ALTO_PANTALLA = 1080;
    final double ANCHO = 100;
    final double ALTO = 200;
    static int TIEMPO_PARADA = 50;
    static int DESPLAZAMIENTO_Y = 3;

    public void run() {
        setSize(ANCHO_PANTALLA,ALTO_PANTALLA);
        setBackground(Color.white);

        arbol1 = new Arbol(ANCHO, ALTO);
        arbol2 = new Arbol(ANCHO, ALTO);
        arbol3 = new Arbol(ANCHO, ALTO);
        arbol4 = new Arbol(ANCHO, ALTO);
        arbol5 = new Arbol(ANCHO, ALTO);

        add(arbol1,500,500);
        add(arbol2, 700, 500);
        add(arbol3, 900, 500);
        add(arbol4, 1100, 500);
        add(arbol5, 1300, 500);

        moverSusArbol();
        arbol1.soplarViento();


    }

    private void moverSusArbol(){
        while(arbol3.getX() < ANCHO_PANTALLA - 20 && arbol3.getY() > 50) {
            arbol3.move(1, -DESPLAZAMIENTO_Y);
            pause(TIEMPO_PARADA);
        }
    }
}
