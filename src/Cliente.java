import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Pantalones disponibles: ");
        List<Fabrica> listadoPantalones = new ArrayList<>();
        listadoPantalones.add(new HugoBossFactory());
        listadoPantalones.add(new HermesFactory());
        listadoPantalones.add(new DiorFactory());

        System.out.println(listadoPantalones);
/*
        System.out.println("Camisas disponibles: ");
        List<Camisa> listadoCamisas = new ArrayList<>();
        listadoCamisas.add(new HugoBossCamisa());
        listadoCamisas.add(new HermesCamisa());
        listadoCamisas.add(new DiorCamisa());

        for (Camisa camisa : listadoCamisas){
            System.out.println(camisa.MarcaCamisa());
        }

        System.out.println("Zapatos disponibles: ");
        List<Zapatos> listadoZapatos = new ArrayList<>();
        listadoZapatos.add(new HugoBossZapatos());
        listadoZapatos.add(new HermesZapatos());
        listadoZapatos.add(new DiorZapatos());

        for (Zapatos zapatos : listadoZapatos){
            System.out.println(zapatos.MarcaZapatos());
        }*/
    }
}