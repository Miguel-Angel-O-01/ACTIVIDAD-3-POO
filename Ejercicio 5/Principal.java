public class Principal {
    public static void main(String[] args) {
        // Instancia la clase plantilla
        EvaluacionPOO evaluacion1 = new EvaluacionPOO();
        // Crear un único Scanner y cerrarlo correctamente con try-with-resources
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            evaluacion1.pedirDatos(scanner);
        }
        evaluacion1.calcularPromedio();
        evaluacion1.mostrarResultadoEvaluacion();
    }
}