package Ejercicio3FactoryM;

public class CreadorC extends Creador {
    @Override
    public KC createKit() {

        KC kitColegial = new KC();

        Mochila mochila = new Mochila();

        mochila.setTamano(100);
        mochila.setNroBolsillos(5);

        Compu computadora = new Compu();

        computadora.setMarca("HP");
        computadora.setOs("Linux");

        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        libro1.setTipo("Aventura");
        libro1.setAutor("Mark Twain");

        libro2.setTipo("Drama");
        libro2.setAutor("Dalas Review");

        kitColegial.setComputadora(computadora);
        kitColegial.setMochila(mochila);
        kitColegial.setLibros(new Libro[]{libro1, libro2});

        return kitColegial;



    }
}
