package State;

public class Hambriento implements State{
    private GatoTom gatoTom;
    @Override
    public void jugar() {
        System.out.println("No quiero jugar!");
    }

    @Override
    public void alimentar() {
        System.out.println("Tengo hambre, vamos a comer!!!");
        gatoTom.setState(new Sucio());
    }

    @Override
    public void lavar() {
        System.out.println("El baño no!");
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
