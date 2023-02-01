import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.util.Scanner;

public class tarea2 extends GraphicsProgram {
    GOval huevo;
    final int ANCHO_PANTALLA = 900;
    final int ALTO_PANTALLA = 400;

    public void run(){
        Scanner readInput = new Scanner(System.in);
        final int POS_X_INICIO;
        final int POS_Y_INICIO;
        int anchuraHuevo, alturaHuevo, numeroColor;

        System.out.println("Introduzca la anchura del huevo");
        anchuraHuevo = readInput.nextInt();
        System.out.println("Introduzca la altura del huevo");
        alturaHuevo = readInput.nextInt();

        huevo = new GOval(anchuraHuevo, alturaHuevo);

        setSize(ANCHO_PANTALLA,ALTO_PANTALLA);
        setBackground(Color.red);

        System.out.println("Introduzca un número para determinar el color del huevo \n 1 - Cyan.  2 - Negro.  3 - Azul.  4 - Verde.");
        numeroColor = readInput.nextInt();
        establecerColor(numeroColor, huevo);

        huevo.setFilled(true);
        add(huevo, 40, 40);

        readInput.close();
    }
    public static void establecerColor(int opcionUsuario, GOval huevo){

        switch (opcionUsuario){
            case 1: huevo.setColor(Color.cyan);
            break;
            case 2: huevo.setColor(Color.BLACK);
            break;
            case 3: huevo.setColor(Color.BLUE);
            break;
            case 4: huevo.setColor(Color.GREEN);
            break;
        }
    }
}
