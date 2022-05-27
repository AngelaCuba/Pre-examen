package Ejercicio5Bulider;

public class Cocinero {
    private builderP parrillaBuilder;

    public Parrilla getParrillaFromBuilder() {

        return parrillaBuilder.parrilla;

    }

    public void setBuilder(builderP parrillaBuilder) {

        this.parrillaBuilder = parrillaBuilder;

    }

    public void createParrilla() {

        builderP.createParrilla();
        builderP.buildTipoDeCarne();
        builderP.buildGuarniciones();
        builderP.buildSaborRefresco();

    }

}
