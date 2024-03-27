package src.ui;

import java.util.Scanner;

public class UIMenu {

    public static final String[] MESES = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };

    public static void showMenu() {
        System.out.println("Bienvenido a Mis citas");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();

                    break;
                case 0:
                    System.out.println("Gracias por su visita");
                    break;
                default:
                    System.out.println("Por favor, seleccione una respuesta correcta");
            }
        } while (response != 0);
    }

    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Paciente");
            System.out.println("1. Concierte una cita");
            System.out.println("2. Mis citas");
            System.out.println("0. Atrás");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Concierte una cita");
                    break;
                case 2:
                    System.out.println("::Mis citas");

                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + "." + MESES[i]);
                    }
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);
    }
}
