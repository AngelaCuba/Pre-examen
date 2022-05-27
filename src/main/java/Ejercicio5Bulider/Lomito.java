package Ejercicio5Bulider;

public class Lomito extends builderP{
    @Override
    public void buildTipoDeCarne() {

        parrilla.setTipoDeCarne("lomo");

    }

    @Override
    public void buildSaborRefresco() {

        parrilla.setSaborRefresco("pepsi");

    }

    @Override
    public void buildGuarniciones() {

        parrilla.setGuarniciones("arroz");

    }
}
