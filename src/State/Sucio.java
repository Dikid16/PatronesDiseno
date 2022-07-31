package State;

public class Sucio implements State {
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
        System.out.println("Nos vamos a bañar!!!");
        gatoTom.setState(new Aburrido());
    }

    @Override
    public void dormir() {
        System.out.println("No tengo sueño!");
    }

    @Override
    public void setGatoTom(GatoTom gatoTom) {
        this.gatoTom = gatoTom;
    }
}
