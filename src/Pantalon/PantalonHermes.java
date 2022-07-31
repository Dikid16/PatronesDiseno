package Pantalon;

public class PantalonHermes implements IPantalon{
    @Override
    public String getMarca() {
        return "Hermes";
    }

    @Override
    public int talla() {
        return 30;
    }

    @Override
    public String getColor() {
        return "Gris";
    }

    @Override
    public String toString() {
        return "Marca: ".concat(getMarca()).concat(", Talla: ")
                .concat(String.valueOf(talla())).concat(", Color: ").concat(getColor());
    }
}
