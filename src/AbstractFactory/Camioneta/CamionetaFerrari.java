package AbstractFactory.Camioneta;

public class CamionetaFerrari implements InterCamioneta{
    @Override
    public String getMarca() {
        return "Ferrari";
    }

    @Override
    public String modelo() {
        return "Purosangre";
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

