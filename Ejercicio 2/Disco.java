public class Disco {
    public String titulo;
    public String genero;
    public String cantante;
    public int duracion;

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Cantante: " + cantante);
        System.out.println("Duración: " + duracion + " minutos");
    }
    
}
