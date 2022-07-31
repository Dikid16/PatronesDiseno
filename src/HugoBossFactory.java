import Camisa.CamisaHugoBoss;
import Camisa.ICamisa;
import Pantalon.IPantalon;
import Pantalon.PantalonHugoBoss;
import Zapatos.IZapatos;
import Zapatos.ZapatosHugoBoss;

public class HugoBossFactory extends AbstractFactory{
    @Override
    public IPantalon crearPantalon() {
        IPantalon pantalon = new PantalonHugoBoss();
        return pantalon;
    }

    @Override
    public ICamisa crearCamisa() {
        ICamisa camisa = new CamisaHugoBoss();
        return camisa;
    }

    @Override
    public IZapatos crearZapatos() {
        IZapatos zapatos = new ZapatosHugoBoss();
        return zapatos;
    }
}
