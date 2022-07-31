package AbstractFactory;

import AbstractFactory.Camisa.CamisaHermes;
import AbstractFactory.Camisa.ICamisa;
import AbstractFactory.Pantalon.IPantalon;
import AbstractFactory.Pantalon.PantalonHermes;
import AbstractFactory.Zapatos.IZapatos;
import AbstractFactory.Zapatos.ZapatosHermes;

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
