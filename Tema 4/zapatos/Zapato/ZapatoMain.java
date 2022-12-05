package Zapato;

import Zapato.Zapato;

public class ZapatoMain {
    public static void main (String[] args) {
        Zapato par1 = new Zapato("Náutico", "Azul", 42, false, 10, 40);
        Zapato par2 = new Zapato("De salón", "Rojo", 38, true, 3, 25);
        System.out.print("Tipo: " + par1.tipo);
        System.out.print(", Color: " + par1.color);
        System.out.print(", Número: " + par1.numero);
        System.out.print(", Liquidación: " + par1.liquidacion);
        System.out.print(", Cantidad en almacén: " + par1.almacenado());
        System.out.println(", Precio: " + par1.precioVenta());

        System.out.print("Tipo: " + par2.tipo);
        System.out.print(", Color: " + par2.color);
        System.out.print(", Número: " + par2.numero);
        System.out.print(", Liquidación: " + par2.liquidacion);
        System.out.print(", Cantidad en almacén: " + par2.almacenado());
        System.out.println(", Precio: " + par2.precioVenta());
    }
}


