package AbstractFactory;

import AbstractFactory.Camisa.CamisaDior;
import AbstractFactory.Camisa.ICamisa;
import AbstractFactory.Pantalon.IPantalon;
import AbstractFactory.Pantalon.PantalonDior;
import AbstractFactory.Zapatos.IZapatos;
import AbstractFactory.Zapatos.ZapatosDior;

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
