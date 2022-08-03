package AbstractFactory.Automovil;

public class AutomovilChevrolet implements InterAutomovil{
    @Override
    public String getMarca() {
        return "Chevrolet";
    }

    @Override
    public String modelo() {
        return "Camaro";
    }

    @Override
    public String getColor() {
        return "Amarillo";
    }

    @Override
    public String toString() {
        return "Marca: ".concat(getMarca()).concat(", Modelo: ")
                .concat(modelo()).concat(", Color: ").concat(getColor());
    }
}
