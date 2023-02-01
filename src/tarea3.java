import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.util.Scanner;

public class tarea3 extends GraphicsProgram {
    GLine lineaVertical;
    GLine lineaHorizontal;

    public void run(){
        int anchuraPantalla;
        int alturaPantalla;


        Scanner readInput = new Scanner(System.in);

        System.out.println("Introduzca la anchura de la pantalla");
        anchuraPantalla = readInput.nextInt();
        System.out.println("Introduzca la altura de la pantalla");
        alturaPantalla = readInput.nextInt();

        lineaHorizontal = new GLine(0, (alturaPantalla / 2), anchuraPantalla, (alturaPantalla / 2));
        lineaVertical = new GLine(anchuraPantalla / 2, 0, anchuraPantalla / 2, alturaPantalla);

        setSize(anchuraPantalla, alturaPantalla);
        setBackground(Color.RED);

        lineaHorizontal.setColor(Color.GREEN);
        lineaVertical.setColor(Color.GREEN);
        add(lineaHorizontal, 0, alturaPantalla / 2);
        add(lineaVertical, anchuraPantalla / 2, 0);


    }
}
