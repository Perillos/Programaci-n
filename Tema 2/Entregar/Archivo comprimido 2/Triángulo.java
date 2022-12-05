import java.util.Scanner;

public class Triángulo {
    public static void main (String[] args) {

        double sice, area, height, perimeter;

        Scanner read = new Scanner(System.in);

        System.out.print("Introduce el lado de un triángulo equilátero para calcualr el area y el perímetro: ");
        sice = read.nextDouble();

        height = (sice * Math.sqrt(3)) / 2;
        area = (sice * height) / 2;
        perimeter = 3 * sice;

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimeter);
    }
}
