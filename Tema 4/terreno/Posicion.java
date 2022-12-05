public class Posicion {
    private int x;
    private int y;

    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    };
    public int getY() {
        return y;
    }

    public double getArea() {
        double a, b;
        a = x;
        b = y;

        return a * b;
    }
}
