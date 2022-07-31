package State;

public class Aburrido implements State{
    private GatoTom gatoTom;
    @Override
    public void jugar() {
        System.out.println("Vamos a jugar!!!");
        gatoTom.setState(new Cansado());
    }

    @Override
    public void alimentar() {
        System.out.println("No quiero comer!");
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
