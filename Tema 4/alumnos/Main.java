public class Main {
    //variable no estatica no puede entrar en el métoco estatico
    int num;
    public static void main (String[] args) {
        Alumno a1, a2;

        a1 = new Alumno(21, "David");
        a2 = new Alumno(45, "Jorge");


        // variable estática static, los atributos y los metodos estaticos no se pueden acceder
        System.out.println(Alumno.num_alumnos);
        //num;

    }
}
