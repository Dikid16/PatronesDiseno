public class DiorFactory implements Fabrica{
    @Override
    public Pantalon crearPantalon() {
        return new DiorPantalon();
    }

    @Override
    public Camisa crearCamisa() {
        return new DiorCamisa();
    }

    @Override
    public Zapatos crearZapatos() {
        return new DiorZapatos();
    }
}
