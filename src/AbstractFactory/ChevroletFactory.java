package AbstractFactory;

import AbstractFactory.Automovil.AutomovilChevrolet;
import AbstractFactory.Automovil.InterAutomovil;
import AbstractFactory.Camioneta.InterCamioneta;
import AbstractFactory.Camioneta.CamionetaChevrolet;

public class ChevroletFactory extends AbstractFactory{
    @Override
    public InterAutomovil crearAutomovil() {
        InterAutomovil automovil = new AutomovilChevrolet();
        return automovil;
    }

    @Override
    public InterCamioneta crearCamioneta() {
        InterCamioneta camioneta = new CamionetaChevrolet();
        return camioneta;
    }

}
