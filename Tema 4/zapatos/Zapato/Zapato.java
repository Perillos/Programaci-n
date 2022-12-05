package Zapato;

public class Zapato {
    public String tipo;
    public String color;
    public int numero;
    public boolean liquidacion;

    private int cantidad;
    private double precio;

    // Constructor parametrizado
    public Zapato(String tipo, String color, int numero, boolean liquidacion, int cantidad, double precio) {
        this.tipo = tipo;
        this.color = color;
        this.numero = numero;
        this.liquidacion = liquidacion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int almacenado () {
        return cantidad;
    }
    public double precioVenta () {
        return precio;
    }
}


// introduce