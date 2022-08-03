package AbstractFactory.Camioneta;

public class CamionetaChevrolet implements InterCamioneta{
    @Override
    public String getMarca() {
        return "Chevrolet";
    }

    @Override
    public String modelo() {
        return "Blazer";
    }

    @Override
    public String getColor() {
        return "Rojo";
    }

    @Override
    public String toString() {
        return "Marca: ".concat(getMarca()).concat(", Modelo: ")
                .concat(modelo()).concat(", Color: ").concat(getColor());
    }
}

