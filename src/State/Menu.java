package State;

import java.util.Scanner;

public class Menu {
    GatoTom gatoTom;

    public Menu(GatoTom gatoTom){
        this.gatoTom = gatoTom;
    }

    public void display(){
        Scanner scanner = new Scanner(System.in);
        char opcion;
        String mensajeOpciones = "Acción: "+
                "a) Alimentar, b) Dormir, c) Jugar, d) Lavar, e) Salir";

        while (true){
            System.out.println(mensajeOpciones);
            opcion = scanner.next().charAt(0);
            switch (opcion){
                case 'a': gatoTom.alimemtar(); break;
                case 'b': gatoTom.dormir(); break;
                case 'c': gatoTom.jugar(); break;
                case 'd': gatoTom.lavar(); break;
                case 'e': System.out.println("Hasta pronto!"); System.exit(0);
                default: System.out.println("Opción no valida");
            }
        }
    }
}
