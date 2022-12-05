import java.util.Scanner;

public class YearMonthDay {

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

        if ( year == 1) {
            nameYear = " año, ";
        } else {
            nameYear = " años, ";
        }

        if ( month == 1) {
            nameMonth = " mes y ";
        } else {
            nameMonth = " meses y ";
        }

        if ( dayAuth == 1) {
            nameDayAuth = " día.";
        } else {
            nameDayAuth = " días.";
        }

        if ( day == 1) {
            nameDay = " día equivale exactamente a ";
        } else {
            nameDay = " días equivalen aproximadamente a ";
        }

        if ( dayAuth == 1) {
            nameDayAuth = " día.";
        } else {
            nameDayAuth = " días.";
        }

        System.out.print(day + nameDay + year + nameYear + month + nameMonth + dayAuth + nameDayAuth);

    }

}
