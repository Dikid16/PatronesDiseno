package State;

public class Cansado implements State {
    private GatoTom gatoTom;
    @Override
    public void jugar() {
        System.out.println("No quiero jugar!");
    }

    @Override
    public void alimentar() {
        System.out.println("No tengo hambre!");
    }

    @Override
    public void lavar() {
        System.out.println("No quiero baño!");
    }

    @Override
    public void dormir() {
        System.out.println("Me voy a dormir...");
        gatoTom.setState(new Durmiendo());
    }

    @Override
    public void setGatoTom(GatoTom gatoTom) {
        this.gatoTom = gatoTom;
    }
}
