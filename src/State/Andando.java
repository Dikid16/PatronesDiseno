package State;

import java.util.Timer;
import java.util.TimerTask;

public class Andando implements State{
    private CarroFantastico carroFantastico;
    @Override
    public void prender() {
        System.out.println("Ya estoy encendido, señor");
    }

    @Override
    public void tanquear() {
        System.out.println("No me cabe más!");
    }

    @Override
    public void conducir() {
        System.out.println("Ya casi llegamos");
    }

    @Override
    public void apagar() {
        System.out.println("No me puedo apagar, nos volcaremos!");
    }

    @Override
    public void setCarroFantastico(CarroFantastico carroFantastico) {
        this.carroFantastico = carroFantastico;

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Andando.this.carroFantastico.setState(new Meta());
            }
        },10000);
    }

}
