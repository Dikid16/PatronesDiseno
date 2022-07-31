package AbstractFactory.Zapatos;

public class ZapatosHermes implements IZapatos{
    @Override
    public String getMarca() {
        return "Hermes";
    }

    @Override
    public String material() {
        return "Cuero";
    }

    @Override
    public String getColor() {
        return "Café";
    }
}
