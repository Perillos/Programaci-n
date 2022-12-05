import java.util.Scanner;

public class Dias {

    public static void main (String[] args) {
        int m, y;

        Scanner read = new Scanner(System.in);

        System.out.print("Elija el número del mes: ");
        m = read.nextInt();
        System.out.print("Elija el año: ");
        y = read.nextInt();


        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            System.out.print("El mes " + m + " del año " + y + " tiene 31 días");
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            System.out.print("El mes " + m + " del año " + y + " tiene 30 días");
        } else if (m == 2){
            if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
                System.out.print("El mes " + m + " del año " + y + " tiene 29 días");
            } else {
                System.out.print("El mes " + m + " del año " + y + " tiene 28 días");
            }
        } else {
            System.out.print("El mes " + m + " no es un mes valido");
        }
    }
}
