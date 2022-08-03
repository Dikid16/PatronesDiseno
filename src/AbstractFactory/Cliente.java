package AbstractFactory;

import AbstractFactory.Automovil.InterAutomovil;
import AbstractFactory.Camioneta.InterCamioneta;

public class Cliente {

    public static void main(String[] args) {
        System.out.println("Automoviles disponibles: ");
        AbstractFactory chevroletFactory = new ChevroletFactory();

        InterAutomovil automovilChevrolet = chevroletFactory.crearAutomovil();
        System.out.println(automovilChevrolet.toString());

        AbstractFactory ferrariFactory = new FerrariFactory();

        InterAutomovil automovilFerrari = ferrariFactory.crearAutomovil();
        System.out.println(automovilFerrari.toString());

        AbstractFactory toyotaFactory = new ToyotaFactory();

        InterAutomovil automovilToyota = toyotaFactory.crearAutomovil();
        System.out.println(automovilToyota.toString());

        System.out.println("Camionetas disponibles: ");

        InterCamioneta camionetaChevrolet = chevroletFactory.crearCamioneta();
        System.out.println(camionetaChevrolet.toString());

        InterCamioneta camionetaFerrari = ferrariFactory.crearCamioneta();
        System.out.println(camionetaFerrari.toString());

        InterCamioneta camionetaToyota = toyotaFactory.crearCamioneta();
        System.out.println(camionetaToyota.toString());
    }
}