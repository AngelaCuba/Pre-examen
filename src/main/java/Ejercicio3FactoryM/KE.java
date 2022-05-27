package Ejercicio3FactoryM;

public class KE implements Kit {

    private Mochila mochila;
    private Deportivo deportivo;
    private Cuaderno[] cuadernos;

    public KE() {



    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuaderno[] getCuadernos() {
        return cuadernos;
    }

    public void setCuadernos(Cuaderno[] cuadernos) {
        this.cuadernos = cuadernos;
    }

    @Override

    public void showInfo() {
        System.out.println("KitEscolar: ");
        System.out.println("Mochila NroBolsillos: " + getMochila().getNroBolsillos());
        System.out.println("Mochila Tamanio: " + getMochila().getTamano());
        System.out.println("Deportivo Talla: " + getDeportivo().getTalla());
        System.out.println("Deportivo Color: " + getDeportivo().getColor());
        System.out.println("Deportivo NroPrendas: " + getDeportivo().getNroDePrendas());
        for(int i = 0; i< cuadernos.length; i++) {

            System.out.println("Cuaderno " + (i+1) + " Tipo: " + getCuadernos()[i].getTipo());
            System.out.println("Cuaderno " + (i+1) + " NroHojas: " + getCuadernos()[i].getNroHojas());

        }

        System.out.println("/*/*/*/*/*/*/*/*//*/*/*/*/*/*/*/*/*/*");




    }

}
