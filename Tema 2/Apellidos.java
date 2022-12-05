import java.util.Scanner;

public class Apellidos {

    public static void main (String[] args) {

        String firstName, seconName, auth;

        Scanner read= new Scanner(System.in);

        System.out.print("Escribe tu primer apellido: ");
        firstName = read.nextLine();

        System.out.print("Escribe tu segundo apellido: ");
        seconName = read.nextLine();

        auth = firstName;
        firstName = seconName;
        seconName = auth;

        System.out.print("Los apellidos intercambiados son: " + firstName + " " + seconName);
    }
}
