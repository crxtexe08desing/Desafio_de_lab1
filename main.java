public class main {
    public static void main(String[] args) {
        
        Estudiante e1 = new Estudiante("Carlos Mendoza", "Ingeniería de Sistemas", 5, 82.5);
        Estudiante e2 = new Estudiante("Ana Flores", "Ingeniería Civil", 3, 90.2);
        Estudiante e3 = new Estudiante("Luis Torres", "Derecho", 7, 48.0);
        Estudiante e4 = new Estudiante("Maria Lopez", "Medicina", 2, 75.8);

        System.out.println("------ ESTUDIANTE 1 -----");
        e1.mostrarDatos();
        System.out.println("Estado: " + e1.aprobo());
        System.out.println();

        System.out.println("------ ESTUDIANTE 2 -----");
        e2.mostrarDatos();
        System.out.println("Estado: " + e2.aprobo());
        System.out.println();

        System.out.println("------ ESTUDIANTE 3 -----");
        e3.mostrarDatos();
        System.out.println("Estado: " + e3.aprobo());
        System.out.println();

        System.out.println("------ ESTUDIANTE 4 -----");
        e4.mostrarDatos();
        System.out.println("Estado: " + e4.aprobo());
    }
}

