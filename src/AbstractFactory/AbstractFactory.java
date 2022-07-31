package AbstractFactory;

import AbstractFactory.Camisa.ICamisa;
import AbstractFactory.Pantalon.IPantalon;
import AbstractFactory.Zapatos.IZapatos;

public abstract class AbstractFactory {
    public abstract IPantalon crearPantalon();
    public abstract ICamisa crearCamisa();
    public abstract IZapatos crearZapatos();
}
