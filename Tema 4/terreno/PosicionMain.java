public class PosicionMain {
    public static void main (String[] args) {

        Posicion area = new Posicion(200, 150);

        System.out.println("Punto 1: (0, 0) m.");
        System.out.println("Punto 2: (" + area.getX() + ", 0) m.");
        System.out.println("Punto 3: (0, " + area.getY() + ") m.");
        System.out.println("Punto 4: (" + area.getX() + ", " + area.getY() + ") m.");
        System.out.println("Punto 4: " + area.getArea() + " m2.");
    }
}
