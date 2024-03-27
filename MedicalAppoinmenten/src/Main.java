package src;

import static src.ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Fernado", "Pediatra");
        myDoctor.ShowName();
        myDoctor.ShowId();

        Doctor myDoctor2 = new Doctor("Federico", "Optamólogo");
        myDoctor2.ShowName();
        myDoctor2.ShowId();

        // Doctor myDoctor2 = new Doctor();
        // myDoctor2.nombre = "Erico Arzamendia";
        // myDoctor2.ShowName();
        // myDoctor2.ShowId();

        // showMenu();

    }
}
