package Ejercicio1Singleton;

public class Ventanilla {

    private static Ventanilla instance;
    private int monto;
    private boolean cajeroRegistrado;

    private Ventanilla() {

        System.out.println("En proceso de creacion de ventanilla");

    }

    public static Ventanilla getInstance() {

        if(instance==null) {

            instance = new Ventanilla();

        }

        return instance;

    }

    public void recibirCodigoCajero(Cajero cajero, int codigo) {

        if(codigo != 0) {

            cajeroRegistrado = true;

        }

    }

    public void mostrarMontoVentanilla() {

        System.out.println("El monto es: " + monto);

    }



    public void pagar(int monto) {

        if(cajeroRegistrado) {

            this.monto += monto;

        } else {

            System.out.println("No se pudo realizar el  pago! tenemos dificultades y/o no hay no se encuentra el cajero ");

        }

    }

}

