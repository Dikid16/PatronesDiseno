package AbstractFactory.Pantalon;

public class PantalonDior implements IPantalon{
    @Override
    public String getMarca() {
        return "Dior";
    }

    @Override
    public int talla() {
        return 32;
    }

    @Override
    public String getColor() {
        return "Azul";
    }

    @Override
    public String toString() {
        return "Marca: ".concat(getMarca()).concat(", Talla: ")
                .concat(String.valueOf(talla())).concat(", Color: ").concat(getColor());
    }
}
