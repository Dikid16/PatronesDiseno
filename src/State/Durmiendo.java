package State;

import java.util.Timer;
import java.util.TimerTask;

public class Durmiendo implements State {
    private GatoTom gatoTom;
    @Override
    public void jugar() {
    }

    @Override
    public void alimentar() {
    }

    @Override
    public void lavar() {
    }

    @Override
    public void dormir() {
    }

    @Override
    public void setGatoTom(GatoTom gatoTom) {
        this.gatoTom = gatoTom;

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Durmiendo.this.gatoTom.setState(new Hambriento());
            }
        },7000);
    }
}
