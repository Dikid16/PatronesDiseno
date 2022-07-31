package AbstractFactory.Camisa;

public class CamisaHermes implements ICamisa{
    @Override
    public String getMarca() {
        return "Hermes";
    }

    @Override
    public String talla() {
        return "L";
    }

    @Override
    public String getColor() {
        return "Azul";
    }
}
