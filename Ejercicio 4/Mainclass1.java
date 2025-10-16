public class Mainclass1 {

    public static void main(String[] args) {
        ClasePlantilla FAD = new ClasePlantilla();
        
        for (int i = 0; i < 5; i++) {
           
            FAD.pedirDatos();
            FAD.mostrarResultado();
        }
    }
}
