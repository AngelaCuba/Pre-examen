package Ejercicio5Bulider;
public abstract class builderP {

    protected Parrilla parrilla;

    public Parrilla getParrilla() {

        return parrilla;

    }

    public static void createParrilla() {

        this.parrilla = new Parrilla();

    }

    public static void buildTipoDeCarne() {
    }

    public static void buildSaborRefresco() {
    }

    public static void buildGuarniciones() {
    }


}

