package AbstractFactory;

import AbstractFactory.Automovil.AutomovilFerrari;
import AbstractFactory.Automovil.InterAutomovil;
import AbstractFactory.Camioneta.InterCamioneta;
import AbstractFactory.Camioneta.CamionetaFerrari;

public class FerrariFactory extends AbstractFactory{
    @Override
    public InterAutomovil crearAutomovil() {
        InterAutomovil automovil = new AutomovilFerrari();
        return automovil;
    }

    @Override
    public InterCamioneta crearCamioneta() {
        InterCamioneta camioneta = new CamionetaFerrari();
        return camioneta;
    }

}

