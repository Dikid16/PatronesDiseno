abstract public class Zapatos {
    abstract String MarcaZapatos();
}

class HugoBossZapatos extends Zapatos{

    @Override
    String MarcaZapatos() {
        return "Zapatos Hugo Boss";
    }
}

class HermesZapatos extends Zapatos{

    @Override
    String MarcaZapatos() {
        return "Zapatos Hermes";
    }
}

class DiorZapatos extends Zapatos{

    @Override
    String MarcaZapatos() {
        return "Zapatos Dior";
    }
}
