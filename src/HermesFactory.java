import Camisa.CamisaHermes;
import Camisa.ICamisa;
import Pantalon.IPantalon;
import Pantalon.PantalonHermes;
import Zapatos.IZapatos;
import Zapatos.ZapatosHermes;

public class HermesFactory extends AbstractFactory{
    @Override
    public IPantalon crearPantalon() {
        IPantalon pantalon = new PantalonHermes();
        return pantalon;
    }

    @Override
    public ICamisa crearCamisa() {
        ICamisa camisa = new CamisaHermes();
        return camisa;
    }

    @Override
    public IZapatos crearZapatos() {
        IZapatos zapatos = new ZapatosHermes();
        return zapatos;
    }
}
