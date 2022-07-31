package AbstractFactory.Camisa;

public class CamisaHugoBoss implements ICamisa{
    @Override
    public String getMarca() {
        return "Hugo Boss";
    }

    @Override
    public String  talla() {
        return "S";
    }

    @Override
    public String getColor() {
        return "Blanco";
    }
}
