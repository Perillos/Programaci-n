import java.util.Scanner;

public class AñoMesDía {

    public static void main (String[] args) {

        int day, year, month, dayAuth;
        String nameDay, nameMonth, nameYear, nameDayAuth;

        Scanner read= new Scanner(System.in);

        System.out.print("Introduce los días para convertirlos a años y meses: ");
        day = read.nextInt();

        dayAuth = day;

        year = day / 365;
        dayAuth = day % 365;

        month = dayAuth / 30;
        dayAuth = dayAuth % 30;


        System.out.println(day + " días equivalen aproximadamente a " + year + " años, " + month + " meses y " + dayAuth + " días.");
    }
}
