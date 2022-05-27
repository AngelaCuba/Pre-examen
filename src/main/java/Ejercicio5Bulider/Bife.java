package Ejercicio5Bulider;

public class Bife extends builderP{
    @Override
    public void buildTipoDeCarne() {

        parrilla.setTipoDeCarne("bife");

    }

    @Override
    public void buildSaborRefresco() {

        parrilla.setSaborRefresco("Coca-Cola");

    }

    @Override
    public void buildGuarniciones() {

        parrilla.setGuarniciones("papasFritas");

    }
}