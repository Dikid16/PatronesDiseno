package State;

public interface State {

    void prender();
    void tanquear();
    void conducir();
    void apagar();

    void setCarroFantastico(CarroFantastico carroFantastico);
}
