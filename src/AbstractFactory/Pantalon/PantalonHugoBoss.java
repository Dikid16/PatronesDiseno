package AbstractFactory.Pantalon;

public class PantalonHugoBoss implements IPantalon {
    @Override
    public String getMarca() {
        return "Hugo Boss";
    }

    @Override
    public int talla() {
        return 32;
    }

    @Override
    public String getColor() {
        return "Negro";
    }

    @Override
    public String toString() {
        return "Marca: ".concat(getMarca()).concat(", Talla: ")
                .concat(String.valueOf(talla())).concat(", Color: ").concat(getColor());
    }
}
