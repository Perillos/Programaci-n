public class Alumno2 {
    private int edad;
    public static int num_alumnos = 0;
    public String nombre;

    public Alumno(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
        num_alumnos++;
    }

    // objetos de clases inmutables

}
