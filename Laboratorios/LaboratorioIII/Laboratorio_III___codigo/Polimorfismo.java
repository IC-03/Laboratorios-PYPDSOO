public class Polimorfismo
{
    public static void testDinamico() {
        // Polimorfismo Ascendente
        MaterialBiblioteca materiales = new MaterialBiblioteca("El Hobbit", "J.R.R. Tolkien", "Español", 2010);
        materiales.mostrarInformacion();
        System.out.println("*************************************************");
        materiales = new Audiolibro("El Hobbit", "J.R.R. Tolkien", "Español", 2010, "MP3", "Morgan Freeman");
        materiales.mostrarInformacion();
        System.out.println("*************************************************");        
        MaterialDigital digital = new Pelicula("Interestelar", "Christopher Nolan", "Inglés", 2014, "MP4", 169);
        digital.mostrarInformacion();
        
        
        // Polimorfismo Descendente
        System.out.println("*************************************************");
        MaterialBiblioteca book1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 
        "Español", 1967, 432, 10, "Realismo mágico", "Editorial Sudamericana");
        book1.mostrarInformacion();
        System.out.println("*************************************************");
        Libro book2 = (Libro) book1;
        book2.mostrarInformacion();
        System.out.println("*************************************************");
    }
}
