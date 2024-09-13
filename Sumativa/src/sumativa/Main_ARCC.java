package sumativa;

import java.util.Scanner;

public class Main_ARCC {
    public static void main(String[] args) {

        Robot_ARCC robot_ARCC = new Robot_ARCC();
        

        Scanner scanner_ARCC = new Scanner(System.in);
        

        System.out.println("Elige un disfraz para el robot:");
        System.out.println("1. Disfraz de Mago");
        System.out.println("2. Disfraz de Cavernícola");
        System.out.println("3. Disfraz de Lavadora");

    
        int opcion_ARCC = scanner_ARCC.nextInt();

        switch(opcion_ARCC) {
            case 1:
                DisfrazMago_ARCC disfrazMago_ARCC = new DisfrazMago_ARCC("azul");
                disfrazMago_ARCC.aplicarOutfit_ARCC();
                robot_ARCC.mostrarEstado_ARCC();
                break;
            case 2:
                DisfrazCavernicola_ARCC disfrazCavernicola_ARCC = new DisfrazCavernicola_ARCC("marrón");
                disfrazCavernicola_ARCC.aplicarOutfit_ARCC();
                robot_ARCC.mostrarEstado_ARCC();
                break;
            case 3:
                DisfrazLavadora_ARCC disfrazLavadora_ARCC = new DisfrazLavadora_ARCC("blanco");
                disfrazLavadora_ARCC.aplicarOutfit_ARCC();
                robot_ARCC.mostrarEstado_ARCC();
                break;
            default:
                System.out.println("El robot es timido y le da verguenza salir a matar sin ropa por lo tanto no se prendera.");
                break;
        }




        scanner_ARCC.close();
    }
}