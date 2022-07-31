package AbstractFactory.Camisa;

public class CamisaDior implements ICamisa{
    @Override
    public String getMarca() {
        return "Dior";
    }

    @Override
    public String talla() {
        return "M";
    }

    @Override
    public String getColor() {
        return "Negro";
    }
}
