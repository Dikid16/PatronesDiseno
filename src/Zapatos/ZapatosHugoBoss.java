package Zapatos;

public class ZapatosHugoBoss implements IZapatos{
    @Override
    public String getMarca() {
        return "Hugo Boss";
    }

    @Override
    public String material() {
        return "Cuero";
    }

    @Override
    public String getColor() {
        return "Negro";
    }
}
