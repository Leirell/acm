import acm.program.*;
import acm.graphics.*;
import java.util.Scanner;
import java.awt.*;

public class tareaAdicional extends GraphicsProgram {
    GOval pelotaLenta;
    GOval pelotaRapida;

    final int ANCHO_PANTALLA = 1920;
    final int ALTO_PANTALLA = 1080;

    final int ANCHO_PELOTA = 20;
    final int ALTO_PELOTA = 20;
    final int TIEMPO_PARADA = 20;
    final int DESPLAZAMIENTO_X = 2;

    public void run() {
        boolean salir = false;
        pelotaLenta = new GOval(ANCHO_PELOTA, ALTO_PELOTA);
        pelotaRapida = new GOval(ANCHO_PELOTA, ALTO_PELOTA);

        setSize(ANCHO_PANTALLA, ALTO_PANTALLA);
        setBackground(Color.red);

        pelotaLenta.setFilled(true);
        pelotaRapida.setFilled(true);
        pelotaLenta.setColor(Color.blue);
        pelotaRapida.setColor(Color.green);
        add(pelotaLenta, 0, 504);
        add(pelotaRapida, ANCHO_PANTALLA - 19, 504);

        while (pelotaLenta.getX() <= (pelotaRapida.getX() - 20)) {
            avanzarUnFotograma(DESPLAZAMIENTO_X, 0);
            pause(TIEMPO_PARADA);
        }
        while(!salir) {
            movimientoRandomizado();
            pause(1000);
        }
    }
    public void avanzarUnFotograma(int dx, int dy){
        pelotaLenta.move(dx,dy);
        pelotaRapida.move((-dx - 2),dy);
    }
    public void movimientoRandomizado(){
        int dx, dy;
        int dxRapida,dyRapida;
        dx = (int) (1900 * Math.random());
        dy = (int) (1050 * Math.random());
        dxRapida = (int) (1900 * Math.random());
        dyRapida = (int) (1050 * Math.random());

        pelotaLenta.setLocation(dx,dy);
        pelotaRapida.setLocation(dxRapida,dyRapida);
    }
}