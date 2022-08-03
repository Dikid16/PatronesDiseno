package State;

public class Apagado implements State{
    private CarroFantastico carroFantastico;
    @Override
    public void prender() {
        System.out.println("Bienvenido, amo");
        carroFantastico.setState(new Encendido());
    }

    @Override
    public void tanquear() {
    }

    @Override
    public void conducir() {
    }

    @Override
    public void apagar() {
    }

    @Override
    public void setCarroFantastico(CarroFantastico carroFantastico) {
        this.carroFantastico = carroFantastico;
    }
}
