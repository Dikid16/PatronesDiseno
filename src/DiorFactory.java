public class DiorFactory implements Fabrica{
    @Override
    public void crearPantalon() {
        new DiorPantalon();
    }

    @Override
    public void crearCamisa() {
        new DiorCamisa();
    }

    @Override
    public void crearZapatos() {
        new DiorZapatos();
    }
}
