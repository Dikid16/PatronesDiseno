public class HermesFactory implements Fabrica{
    @Override
    public void crearPantalon() {
        new HermesPantalon();
    }

    @Override
    public void crearCamisa() {
        new HermesCamisa();
    }

    @Override
    public void crearZapatos() {
        new HermesZapatos();
    }
}
