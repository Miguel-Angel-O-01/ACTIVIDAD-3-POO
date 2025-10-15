public class Principal {

    public static void main(String[] args) {
        Disco disco1 = new Disco();
        disco1.titulo = "The Dark Side of the Moon";
        disco1.genero = "Rock";
        disco1.cantante = "Pink Floyd";
        disco1.duracion = 42;

        Disco disco2 = new Disco();
        disco2.titulo = "Thriller";
        disco2.genero = "Pop";
        disco2.cantante = "Michael Jackson";
        disco2.duracion = 42;

        System.out.println("Información del primer disco:");
        disco1.mostrarInfo();

        System.out.println("\nInformación del segundo disco:");
        disco2.mostrarInfo();
    }
    
}
