public class HugoBossFactory implements Fabrica{
    @Override
    public void crearPantalon() {
        new HugoBossPantalon();
    }

    @Override
    public void crearCamisa() {
        new HugoBossCamisa();
    }

    @Override
    public void crearZapatos() {
        new HugoBossZapatos();
    }
}
