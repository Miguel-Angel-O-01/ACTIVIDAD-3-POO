import java.util.Scanner;
import java.lang.Math;

public class ClasePlantilla {

   
    public String datos;
    public double numero1;
    public double numero2;
    public int opcion;
    public double resultado;

    
    private static final Scanner scanner = new Scanner(System.in);

    public void pedirDatos() {
        System.out.println("Seleccione una opción (1-4):");
        System.out.println("1. Suma");
        System.out.println("2. Potencia");
        System.out.println("3. Multiplicación");
        System.out.println("4. Raíces");
        this.opcion = readIntSafe();

        if (opcion >= 1 && opcion <= 4) {
            System.out.println("Ingrese el primer número:");
            this.numero1 = readDoubleSafe();
        }
        .
        if (opcion == 1 || opcion == 2 || opcion == 3) {
            System.out.println("Ingrese el segundo número:");
            this.numero2 = readDoubleSafe();
        } else if (opcion == 4) {
         
            System.out.println("Ingrese el segundo número (para la raíz cúbica):");
            this.numero2 = readDoubleSafe();
        }
        
    }

   
    private int readIntSafe() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Ingrese un entero:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private double readDoubleSafe() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Ingrese un número:");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public double sumar() {
        return numero1 + numero2;
    }

    public double potencia() {
        return Math.pow(numero1, numero2);
    }

    public double multiplicar() {
        return numero1 * numero2;
    }

    public double[] calcularRaices() {
        double[] res = new double[2];
        res[0] = Math.sqrt(numero1);
        res[1] = Math.cbrt(numero2);
        return res;
    }

    public void mostrarResultado() {
        switch (opcion) {
            case 1:
                this.resultado = sumar();
                System.out.println("El resultado de la suma es: " + this.resultado);
                break;
            case 2:
                this.resultado = potencia();
                System.out.println("El resultado de la potencia es: " + this.resultado);
                break;
            case 3:
                this.resultado = multiplicar();
                System.out.println("El resultado de la multiplicación es: " + this.resultado);
                break;
            case 4:
                double[] ra = calcularRaices();
                System.out.println("La raíz cuadrada del primer número es: " + ra[0]);
                System.out.println("La raíz cúbica del segundo número es: " + ra[1]);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}