import java.util.Scanner;

public class Boolean {

    public static void main (String[] args) {
        // Prepar la aplicación con las variables y funciones
        boolean X, Y, Z;

        Scanner read= new Scanner(System.in);

        // Solicitamos al usuario los datos
        System.out.println("Introduce el valor de X (true o false): ");
        X = read.nextBoolean();

        System.out.println("Introduce el valor de Y (true o false): ");
        Y = read.nextBoolean();

        System.out.println("Introduce el valor de Z (true o false): ");
        Z = read.nextBoolean();

        // Operar con los datos y mostrar resultado
        System.out.print("Operación AND: ");
        System.out.println(X && Y && Z);

        System.out.print("Operación OR: ");
        System.out.println(X || Y || Z);

    }
}


