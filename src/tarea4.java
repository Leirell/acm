import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class tarea4 extends GraphicsProgram {
    GOval bola;
    final int ANCHO_VENTANA = 600;
    final int ALTO_VENTANA = 600;
    final double ALTO_BOLA = 20;
    final double ANCHO_BOLA = 20;
    final int DESPLAZAMIENTO_Y = 2;
    final int TIEMPO_PARADA = 10;

    public void run(){
        final int POS_X_INICIO = 200;
        final int POS_Y_INICIO = 0;
        int tiempoPasado = 0;

        bola = new GOval(ALTO_BOLA, ANCHO_BOLA);

        setSize(ANCHO_VENTANA,ALTO_VENTANA);
        setBackground(Color.RED);

        bola.setFilled(true);
        bola.setColor(Color.BLUE);
        add(bola,POS_X_INICIO,POS_Y_INICIO);

        do {
            while (bola.getY() < (1.684 * ALTO_VENTANA - (2 * ALTO_BOLA))) {
                avanzarUnFotogramaAbajo(0, DESPLAZAMIENTO_Y);
                pause(TIEMPO_PARADA);
                tiempoPasado += 30;
            }
            while (bola.getY() >(0)){
                avanzarUnFotogramaArriba(0, DESPLAZAMIENTO_Y);
                pause(TIEMPO_PARADA);
                tiempoPasado += 30;
            }
        }while(tiempoPasado <= 120000);
    }

    private void avanzarUnFotogramaAbajo(int dx, int dy){
        bola.move(dx,dy);
    }
    private void avanzarUnFotogramaArriba(int dx, int dy) {
        bola.move(dx, -dy);
    }
}
