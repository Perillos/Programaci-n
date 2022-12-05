public class Alumno {
    private String nombre;
    private String nia;
    private String ciclo;
    private int curso;

    // Constructor parametrizado
    public Alumno (String nombre, String nia, String ciclo, int curso) {
        this.nombre = nombre;
        this.nia = nia;
        this.ciclo = ciclo;
        this.curso = curso;
    }

    // Gets
    public String getNombre() {
        return this.nombre;
    }
    public String getNIA() {
        return this.nia;
    }
    public String getCiclo() {
        return this.ciclo;
    }
    public int getCurso() {
        return this.curso;
    }

}
