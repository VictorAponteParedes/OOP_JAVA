package src;

import static src.ui.UIMenu.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Doctor doctor1 = new Doctor();
        doctor1.addFechaAgendamiento(new Date(), "4am");
        doctor1.addFechaAgendamiento(new Date(), "8pm");
        doctor1.addFechaAgendamiento(new Date(), "12pm");
        System.out.println(doctor1.getFechaAgendamiento());

        for (Doctor.FechaDeCitas citasDoctor : doctor1.getFechaAgendamiento()) {
            System.out.println(citasDoctor.getId() + " " + citasDoctor.getFechaCita() + " " + citasDoctor.getHora());
        }

        Doctor doctor2 = new Doctor();
        doctor2.addFechaAgendamiento(new Date(), "12am");
        doctor2.addFechaAgendamiento(new Date(), "19pm");
        doctor2.addFechaAgendamiento(new Date(), "22pm");
        System.out.println(doctor2.getFechaAgendamiento());

        for (Doctor.FechaDeCitas citasDoctor : doctor2.getFechaAgendamiento()) {
            System.out.println(citasDoctor.getId() + " " + citasDoctor.getFechaCita() + " " + citasDoctor.getHora());
        }

        // Paciente paciente1 = new Paciente("Samuel L Jackson", "jackson@gmail.com",
        // "EUA");

        // Paciente paciente2 = new Paciente("Jorge", "jorge@gmail.com", "EUA");
        // System.out.println(paciente1.getNombre());
        // System.out.println(paciente2.getNombre());
        // paciente1 = paciente2;
        // System.out.println(paciente1);
        // System.out.println(paciente1.getNombre());
        // System.out.println(paciente1);
        // System.out.println(paciente2);

        // paciente1.setPeso(71.5);
        // System.out.println(paciente1.getPeso());

        // paciente1.setTelefono("985123123");
        // System.out.println(paciente1.getTelefono());

    }
}
