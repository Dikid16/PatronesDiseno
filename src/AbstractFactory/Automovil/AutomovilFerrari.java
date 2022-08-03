package AbstractFactory.Automovil;

public class AutomovilFerrari implements InterAutomovil{
    @Override
    public String getMarca() {
        return "Ferrari";
    }

    @Override
    public String modelo() {
        return "LaFerrari";
    }

    @Override
    public String getColor() {
        return "Rojo Ferrari";
    }

    @Override
    public String toString() {
        return "Marca: ".concat(getMarca()).concat(", Modelo: ")
                .concat(modelo()).concat(", Color: ").concat(getColor());
    }
}
