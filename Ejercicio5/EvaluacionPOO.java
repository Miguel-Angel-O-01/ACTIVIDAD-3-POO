// Clase plantilla
public class EvaluacionPOO {

    // Variables para almacenar las notas y el promedio
    public double notaGuia;
    public double notaControlLectura;
    public double notaParcial;
    public double promedioFinal;

    // Método para pedir los datos necesarios desde consola
    // Ahora recibe un Scanner creado por el llamador para evitar múltiples instancias
    public void pedirDatos(java.util.Scanner scanner) {
        System.out.println("Ingrese la nota de la Guía (30%):");
        this.notaGuia = scanner.nextDouble();

        System.out.println("Ingrese la nota del Control de Lectura (10%):");
        this.notaControlLectura = scanner.nextDouble();

        System.out.println("Ingrese la nota del Parcial (60%):");
        this.notaParcial = scanner.nextDouble();
    }

    // Método que regresa el cálculo de la nota de la guía ponderada
    public double calcularNotaGuiaPonderada() {
        return this.notaGuia * 0.30;
    }

    // Método que regresa el cálculo de la nota del control de lectura ponderada
    public double calcularNotaControlLecturaPonderada() {
        return this.notaControlLectura * 0.10;
    }

    // Método que regresa el cálculo de la nota del parcial ponderada
    public double calcularNotaParcialPonderada() {
        return this.notaParcial * 0.60;
    }

    // Método que regresa el cálculo del promedio obtenido por el estudiante
    public double calcularPromedio() {
        this.promedioFinal = calcularNotaGuiaPonderada() + calcularNotaControlLecturaPonderada() + calcularNotaParcialPonderada();
        return this.promedioFinal;
    }

    // Método que muestra mensaje para saber si el estudiante APROBO o REPROBO
    public void mostrarResultadoEvaluacion() {
        if (this.promedioFinal >= 6) {
            System.out.println("El estudiante ha APROBADO la evaluación con un promedio de: " + this.promedioFinal);
        } else {
            System.out.println("El estudiante ha REPROBADO la evaluación con un promedio de: " + this.promedioFinal);
        }
    }
}
