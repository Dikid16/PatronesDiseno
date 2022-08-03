package State;

public class Meta implements State {
    private CarroFantastico carroFantastico;
    @Override
    public void prender() {
        System.out.println("Ya estoy encendido, señor");
    }

    @Override
    public void tanquear() {
        System.out.println("Aún me queda gasolina");
    }

    @Override
    public void conducir() {
        System.out.println("Vamos de nuevo!");
        carroFantastico.setState(new Andando());
    }

    @Override
    public void apagar() {
        System.out.println("Hasta la próxima");
        carroFantastico.setState(new Apagado());
    }

    @Override
    public void setCarroFantastico(CarroFantastico carroFantastico) {
        this.carroFantastico = carroFantastico;
    }
}
