abstract public class Camisa {
    abstract String MarcaCamisa();
}

class HugoBossCamisa extends Camisa{

    @Override
    String MarcaCamisa() {
        return "Camisa Hugo Boss";
    }
}

class HermesCamisa extends Camisa{

    @Override
    String MarcaCamisa() {
        return "Camisa Hermes";
    }
}

class DiorCamisa extends Camisa{

    @Override
    String MarcaCamisa() {
        return "Camisa Dior";
    }
}