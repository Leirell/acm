import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class setloc extends GraphicsProgram {
    GOval bola;
    final int ANCHO_VENTANA = 1920;
    final int ALTO_VENTANA = 600;
    final double ALTO_BOLA = 20;
    final double ANCHO_BOLA = 20;
    final int DESPLAZAMIENTO_Y = 2;
    final int TIEMPO_PARADA = 30;

    public void run(){
        final int POS_X_INICIO = 200;
        final int POS_Y_INICIO = 0;

        bola = new GOval(ALTO_BOLA, ANCHO_BOLA);

        setSize(ANCHO_VENTANA,ALTO_VENTANA);
        setBackground(Color.RED);

        bola.setFilled(true);
        bola.setColor(Color.BLUE);
        add(bola,POS_X_INICIO,POS_Y_INICIO);

        pause(TIEMPO_PARADA);

        bola.setLocation(ANCHO_VENTANA/2, ALTO_VENTANA/2);
    }
}
