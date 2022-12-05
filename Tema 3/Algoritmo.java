import java.util.Scanner;

public class Algoritmo {

        public static void main (String[] args) {

            int n, x, np, ne, i;

            Scanner read = new Scanner(System.in);

            System.out.print("Introduce la cantidad de números a analizar: ");
            n = read.nextInt();
            ne= 0;
            np = 0;
            i = 1;
            while (i <= n) {
                i++;
                System.out.print("Introduce un número: ");
                x = read.nextInt();

                if (x <= 0) {
                    ne++;
                } else {
                    np++;
                }
            }
            System.out.println("Números menores iguales a cero: " + ne);
            System.out.println("Números mayores a cero: " + np);
        }
}
