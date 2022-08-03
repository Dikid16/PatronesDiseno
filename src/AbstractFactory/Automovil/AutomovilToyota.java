package AbstractFactory.Automovil;

public class AutomovilToyota implements InterAutomovil{
    @Override
    public String getMarca() {
        return "Toyota";
    }

    @Override
    public String modelo() {
        return "Corolla";
    }

    @Override
    public String getColor() {
        return "Blanco";
    }

    @Override
    public String toString() {
        return "Marca: ".concat(getMarca()).concat(", Modelo: ")
                .concat(modelo()).concat(", Color: ").concat(getColor());
    }
}

