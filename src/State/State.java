package State;

public interface State {

    void jugar();
    void alimentar();
    void lavar();
    void dormir();

    void setGatoTom(GatoTom gatoTom);
}
