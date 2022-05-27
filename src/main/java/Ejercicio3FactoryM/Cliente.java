package Ejercicio3FactoryM;

public class Cliente {
    public static void main(String[] args) {

        KE kitEscolar = new CreadorE().createKit();
        KC kitColegial =  new CreadorC().createKit();


        kitEscolar.showInfo();
        kitColegial.showInfo();


    }
}
