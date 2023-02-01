import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class tarea1 extends GraphicsProgram {
    final int ANCHO_PANTALLA = 1920;
    final int ALTURA_PANTALLA = 1080;
    final int LADO_CUADRADO = 100;
    final int ANCHO_RECTANGULO = 15;

    GRect cuadrado;
    GRect rectangulo;

    public void run(){
        final int POS_X_INICIO = 200;
        final int POS_Y_INICIO = 200;

        cuadrado = new GRect(LADO_CUADRADO,LADO_CUADRADO);
        rectangulo = new GRect(ANCHO_RECTANGULO, LADO_CUADRADO);

        setSize(ANCHO_PANTALLA,ALTURA_PANTALLA);

        cuadrado.setFilled(true);
        cuadrado.setColor(Color.GREEN);
        add(cuadrado, POS_X_INICIO, POS_Y_INICIO);

        rectangulo.setFilled(true);
        rectangulo.setColor(Color.ORANGE);
        add(rectangulo, 240, 250);
    }
}
