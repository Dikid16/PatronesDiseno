package State;

public class GatoTom {
    private State estado;

    public GatoTom() {
        setState(new Aburrido());
    }

    public void setState(State estado){
        this.estado = estado;
        this.estado.setGatoTom(this);
    }

    public void alimemtar(){
        this.estado.alimentar();
    }

    public void dormir(){
        this.estado.dormir();
    }

    public void jugar(){
        this.estado.jugar();
    }

    public void lavar(){
        this.estado.lavar();
    }
}
