import Camisa.ICamisa;
import Pantalon.IPantalon;
import Zapatos.IZapatos;

public abstract class AbstractFactory {
    public abstract IPantalon crearPantalon();
    public abstract ICamisa crearCamisa();
    public abstract IZapatos crearZapatos();
}
