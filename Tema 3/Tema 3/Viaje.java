import java.util.Scanner;

public class Viaje {

    public static void main (String[] args) {

        int na;
        double pa, tot;

        Scanner read = new Scanner(System.in);

        // Solicitamos al usuario los datos
        System.out.print("Introduce el número de Alumnos: ");
        na = read.nextInt();



        if (na < 30) {
            tot = 400;
            pa = tot / na;

        } else if (na < 50) {
            pa = 95;
            tot = pa * na;

        } else if (na < 100) {
            pa = 70.5;
            tot = pa * na;

        }else {
            pa = 65;
            tot = pa * na;

        }
        System.out.println("Precio por alumno: " + pa + ".");
        System.out.println("Precio Total: " + tot + ".");


    }
}
