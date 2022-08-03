package State;


public class Listo implements State {
    private CarroFantastico carroFantastico;
    @Override
    public void prender() {
        System.out.println("Ya estoy encendido, señor");
    }

    @Override
    public void tanquear() {
        System.out.println("No me cabe más!");
    }

    @Override
    public void conducir() {
        System.out.println("En camino!");
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
