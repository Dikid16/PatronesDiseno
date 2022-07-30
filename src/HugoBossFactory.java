public class HugoBossFactory implements Fabrica{
    @Override
    public Pantalon crearPantalon() {
        return new HugoBossPantalon();
    }

    @Override
    public Camisa crearCamisa() {
        return new HugoBossCamisa();
    }

    @Override
    public Zapatos crearZapatos() {
        return new HugoBossZapatos();
    }
}
