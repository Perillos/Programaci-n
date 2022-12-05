import java.util.Scanner;

public class Programa {

    public static void main (String[] args) {

        int n1, n2, i;

        Scanner read = new Scanner(System.in);

        // Solicitamos al usuario los datos
        do {
            System.out.println("Introduce dos números enteros, el primer número debe ser menor que el segundo número.");
            System.out.print("Introduce el primer número: ");
            n1 = read.nextInt();
            System.out.print("Introduce el segundo número: ");
            n2 = read.nextInt();

            if (n1 > n2) {
                System.out.println("Números introducidos erroneamente");
                System.out.println("Introduce el números siguiendo las instrucciones");
            }
        } while (n1 > n2);

        System.out.println("Números pares entre: " + n1 + " y " + n2 + ".");
        for (i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
