import Camisa.CamisaDior;
import Camisa.ICamisa;
import Pantalon.IPantalon;
import Pantalon.PantalonDior;
import Zapatos.IZapatos;
import Zapatos.ZapatosDior;

public class DiorFactory extends AbstractFactory{
    @Override
    public IPantalon crearPantalon() {
        IPantalon pantalon = new PantalonDior();
        return pantalon;
    }

    @Override
    public ICamisa crearCamisa() {
        ICamisa camisa = new CamisaDior();
        return camisa;
    }

    @Override
    public IZapatos crearZapatos() {
        IZapatos zapatos = new ZapatosDior();
        return zapatos;
    }
}
