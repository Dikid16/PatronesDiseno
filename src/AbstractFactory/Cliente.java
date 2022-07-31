package AbstractFactory;

import AbstractFactory.Pantalon.IPantalon;

public class Cliente {

    public static void main(String[] args) {
        System.out.println("Pantalones disponibles: ");
        AbstractFactory hugoFactory = new HugoBossFactory();

        IPantalon pantalonHugoBoss = hugoFactory.crearPantalon();
        System.out.println(pantalonHugoBoss.toString());

        AbstractFactory hermesFactory = new HermesFactory();

        IPantalon pantalonHermes = hermesFactory.crearPantalon();
        System.out.println(pantalonHermes.toString());

        AbstractFactory diorFactory = new DiorFactory();

        IPantalon pantalonDior = diorFactory.crearPantalon();
        System.out.println(pantalonDior.toString());
    }
}