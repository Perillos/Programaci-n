import java.util.Scanner;

public class Media {

    public static void main (String[] args) {
        // Prepar la aplicación con las variables y funciones
        float C1, C2, C3, C4, S, P;

        Scanner read= new Scanner(System.in);

        // Solicitamos al usuario los datos
        System.out.print("Introduce la primera nota: ");
        C1 = read.nextFloat();

        System.out.print("Introduce la segunda nota: ");
        C2 = read.nextFloat();

        System.out.print("Introduce la tercera nota: ");
        C3 = read.nextFloat();

        System.out.print("Introduce la cuarta nota: ");
        C4 = read.nextFloat();

        // Operar con los datos
        S = C1 + C2 + C3 + C4;
        P = S / 4;

        // Mostrar resultado
        System.out.print("La nota media es: " + P);
    }
}
