package AbstractFactory;

import AbstractFactory.Automovil.AutomovilToyota;
import AbstractFactory.Automovil.InterAutomovil;
import AbstractFactory.Camioneta.InterCamioneta;
import AbstractFactory.Camioneta.CamionetaToyota;

public class ToyotaFactory extends AbstractFactory{
    @Override
    public InterAutomovil crearAutomovil() {
        InterAutomovil automovil = new AutomovilToyota();
        return automovil;
    }

    @Override
    public InterCamioneta crearCamioneta() {
        InterCamioneta camioneta = new CamionetaToyota();
        return camioneta;
    }

}

