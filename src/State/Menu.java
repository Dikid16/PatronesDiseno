package State;

import java.util.Scanner;

public class Menu {
    CarroFantastico carroFantastico;

    public Menu(CarroFantastico carroFantastico){
        this.carroFantastico = carroFantastico;
    }

    public void display(){
        try (Scanner scanner = new Scanner(System.in)) {
            char opcion;
            String mensajeOpciones = "Acción: "+
                    "a) Prender, b) Tanquear, c) Conducir, d) Apagar, e) Salir";

            while (true){
                System.out.println(mensajeOpciones);
                opcion = scanner.next().charAt(0);
                switch (opcion){
                    case 'a': carroFantastico.prender(); break;
                    case 'b': carroFantastico.tanquear(); break;
                    case 'c': carroFantastico.conducir(); break;
                    case 'd': carroFantastico.apagar(); break;
                    case 'e': System.out.println("Hasta nunca :)"); System.exit(0);
                    default: System.out.println("Esta opción no es válida");
                }
            }
        }
    }
}
