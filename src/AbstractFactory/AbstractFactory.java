package AbstractFactory;

import AbstractFactory.Camioneta.InterCamioneta;
import AbstractFactory.Automovil.InterAutomovil;

public abstract class AbstractFactory {
    public abstract InterAutomovil crearAutomovil();
    public abstract InterCamioneta crearCamioneta();
}
