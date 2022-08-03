package AbstractFactory.Camioneta;

public class CamionetaToyota implements InterCamioneta{
    @Override
    public String getMarca() {
        return "Toyota";
    }

    @Override
    public String modelo() {
        return "Prado";
    }

    @Override
    public String getColor() {
        return "Blanca";
    }

    @Override
    public String toString() {
        return "Marca: ".concat(getMarca()).concat(", Modelo: ")
                .concat(modelo()).concat(", Color: ").concat(getColor());
    }
}
