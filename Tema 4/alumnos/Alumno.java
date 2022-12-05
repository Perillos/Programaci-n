public class Alumno {
    private int edad;
    public static int num_alumnos = 0;
    public String nombre;

    public Alumno(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
        num_alumnos++;
    }


}
