package AbstractFactory;

import AbstractFactory.Camisa.CamisaHugoBoss;
import AbstractFactory.Camisa.ICamisa;
import AbstractFactory.Pantalon.IPantalon;
import AbstractFactory.Pantalon.PantalonHugoBoss;
import AbstractFactory.Zapatos.IZapatos;
import AbstractFactory.Zapatos.ZapatosHugoBoss;

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
