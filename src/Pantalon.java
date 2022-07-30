abstract public class Pantalon {
    abstract String MarcaPantalon();
}

class HugoBossPantalon extends Pantalon{

    @Override
    String MarcaPantalon() {
        return "Pantalon Hugo Boss";
    }
}

class HermesPantalon extends Pantalon{

    @Override
    String MarcaPantalon() {
        return "Pantalon Hermes";
    }
}

class DiorPantalon extends Pantalon{

    @Override
    String MarcaPantalon() {
        return "Pantalon Dior";
    }
}
