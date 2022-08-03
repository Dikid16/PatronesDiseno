package State;

public class Encendido implements State {
    private CarroFantastico carroFantastico;
    @Override
    public void prender() {
        System.out.println("Ya estoy encendido, señor");
    }

    @Override
    public void tanquear() {
        System.out.println("500m más y no aguanto!");
        carroFantastico.setState(new Listo());
    }

    @Override
    public void conducir() {
        System.out.println("Necesito gasolina para andar, no soy eléctrico");
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
