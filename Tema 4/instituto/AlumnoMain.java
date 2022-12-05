import java.util.Scanner;

public class AlumnoMain {
    public static void main (String[] args) {
        

      String nom, nia, ciclo;
      int curso;

      Scanner sc = new Scanner(System.in);

      System.out.println("Introduce los datos del alumno1:");
      System.out.print("Nombre:");
      nom = sc.nextLine();

      System.out.print("NIA:");
      nia = sc.nextLine();

      System.out.print("Ciclo:");
      ciclo = sc.nextLine();

      System.out.print("Curso:");
      curso = sc.nextInt();

      Alumno alu1 = new Alumno(nom, nia, ciclo, curso);
     
      Scanner sh = new Scanner(System.in);

      System.out.println("Introduce los datos del alumno2:");
      System.out.print("Nombre:");
      nom = sh.nextLine();

      System.out.print("NIA:");
      nia = sh.nextLine();

      System.out.print("Ciclo:");
      ciclo = sh.nextLine();

      System.out.print("Curso:");
      curso = sh.nextInt();

      Alumno alu2 = new Alumno(nom, nia, ciclo, curso);



      System.out.print("Alumno 1: ");
      System.out.print(" Nombre: " + alu1.getNombre());
      System.out.print(", NIA: " + alu1.getNIA());
      System.out.print(" Ciclo: " + alu1.getCiclo());
      System.out.println(" Curso: " + alu1.getCurso());

      System.out.print("Alumno 2: ");
      System.out.print(" Nombre: " + alu2.getNombre());
      System.out.print(" NIA: " + alu2.getNIA());
      System.out.print(" Ciclo: " + alu2.getCiclo());
      System.out.print(" Curso: " + alu2.getCurso());




      // for(int i=1; i<=2; i++) {
      //   System.out.println("Introduce los datos del alumno" + i);
      //   System.out.print("Nombre:");
      //   nom = sc.nextLine();

      //   System.out.print("NIA:");
      //   nia = sc.nextLine();

      //   System.out.print("Ciclo:");
      //   ciclo = sc.nextLine();

      //   System.out.print("Curso:");
      //   curso = sc.nextInt();

      //   Alumno alu3 = new Alumno(nom, nia, ciclo, curso);

      // }
    }
}
