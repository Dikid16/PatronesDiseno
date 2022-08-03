package State;

public class CarroFantastico {
    private State estado;

    public CarroFantastico() {
        setState(new Apagado());
    }

    public void setState(State estado){
        this.estado = estado;
        this.estado.setCarroFantastico(this);
    }

    public void prender(){
        this.estado.prender();
    }

    public void tanquear(){
        this.estado.tanquear();
    }

    public void conducir(){
        this.estado.conducir();
    }

    public void apagar(){
        this.estado.apagar();
    }

}
