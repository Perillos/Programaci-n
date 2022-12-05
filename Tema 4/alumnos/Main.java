public class Main {
    public static void main (String[] args) {
        Alumno a1, a2;

        a1 = new Alumno(21, "David");
        a2 = new Alumno(45, "Jorge");


        // variable estática
        System.out.println(Alumno.num_alumnos);

    }
}
