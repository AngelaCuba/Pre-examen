package Ejercicio3FactoryM;

public class KC implements Kit {

    private Mochila mochila;
    private Libro[] libros;
    private Compu computadora;

    public KC() {}


    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public Compu getComputadora() {
        return computadora;
    }

    public void setComputadora(Compu computadora) {
        this.computadora = computadora;
    }

    @Override

    public void showInfo() {

        System.out.println("KitColegial: ");
        System.out.println("Mochila NroBolsillos: " + getMochila().getNroBolsillos());
        System.out.println("Mochila Tamanio: " + getMochila().getTamano());

        for(int i = 0; i< libros.length; i++) {

            System.out.println("Libro " + (i+1) + " Tipo: " + getLibros()[i].getTipo());
            System.out.println("Libro " + (i+1) + " Autor: " + getLibros()[i].getAutor());

        }

        System.out.println("Computadora Marca: " + getComputadora().getMarca());
        System.out.println("Computadora OS: " + getComputadora().getOs());

        System.out.println("--------------------------------------------");
    }





}
