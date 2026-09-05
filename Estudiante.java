public class Estudiante {
    
    private String nombre;
    private String carrera;
    private int semestre;
    private double promedio;

    public Estudiante(String nombre, String carrera, int semestre, double promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
        System.out.println("Promedio: " + promedio);
    }
    
    public String aprobo() {
        if(promedio >= 51) {
            return "Aprobó";
        } else {
            return "Reprobó";
        }
    }
}

