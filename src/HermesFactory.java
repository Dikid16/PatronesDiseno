public class HermesFactory implements Fabrica{
    @Override
    public Pantalon crearPantalon() {
        return new HermesPantalon();
    }

    @Override
    public Camisa crearCamisa() {
        return new HermesCamisa();
    }

    @Override
    public Zapatos crearZapatos() {
        return new HermesZapatos();
    }
}
