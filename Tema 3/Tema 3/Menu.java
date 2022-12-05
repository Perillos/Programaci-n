import java.util.Scanner;

public class Menu {

    public static void main (String[] args) {
        int n;

        Scanner read = new Scanner(System.in);


        do {
            System.out.println("MENÚ");
            System.out.println("1. Primera opción.");
            System.out.println("2. Segunda opción.");
            System.out.println("3. Tercera opción.");
            System.out.println("4. Salir del programa.");
            System.out.print("Escoja una opción: ");
            n = read.nextInt();
            if (n == 1) {
                System.out.println("Has escogido la opción 1");
            } else if (n == 2) {
                System.out.println("Has escogido la opción 2");
            } else if (n == 3) {
                System.out.println("Has escogido la opción 3");
            } else if (n == 4) {
                System.out.println("Has escogido la opción 4");
            } else {
                System.out.println("No es una opción valida");
            }
        } while (n != 4);
        System.out.println("Fin del programa");
    }
}
