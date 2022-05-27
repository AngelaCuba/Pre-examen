package Ejercicio5Bulider;

public class Tira extends builderP{
    @Override
    public void buildTipoDeCarne() {

        parrilla.setTipoDeCarne("tira de carne");

    }

    @Override
    public void buildSaborRefresco() {

        parrilla.setSaborRefresco("Coca-Cola");

    }

    @Override
    public void buildGuarniciones() {

        parrilla.setGuarniciones("fideo");

    }
}
