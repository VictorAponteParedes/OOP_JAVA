package src;

import java.util.Date;

import src.model.Doctor;
import src.model.Paciente;

public class Main {
    public static void main(String[] args) {

        // Doctor doctor1 = new Doctor("Victor", "victor@gmail.com");// Instanciar o
        // // crear nuevo objeto
        // doctor1.addFechaAgendamiento(new Date(), "4am");
        // doctor1.addFechaAgendamiento(new Date(), "8pm");
        // doctor1.addFechaAgendamiento(new Date(), "12pm");
        // doctor1.setTelefono("975151515");
        // doctor1.setRol("Doctor");
        // doctor1.setEspecialidad("Pediatria");
        // System.out.println(doctor1);

        // for (Doctor.FechaDeCitas citasDoctor : doctor1.getFechaAgendamiento()) {
        // System.out.println(citasDoctor.getId() + " " + citasDoctor.getFechaCita() + "
        // " + citasDoctor.getHora());
        // }

        // Doctor doctor2 = new Doctor("Agata", "agata@gmail.com");
        // doctor2.addFechaAgendamiento(new Date(), "12am");
        // doctor2.addFechaAgendamiento(new Date(), "19pm");
        // doctor2.addFechaAgendamiento(new Date(), "22pm");
        // System.out.println(doctor2.getFechaAgendamiento());

        // for (Doctor.FechaDeCitas citasDoctor : doctor2.getFechaAgendamiento()) {
        // System.out.println(citasDoctor.getId() + " " + citasDoctor.getFechaCita() + "
        // " + citasDoctor.getHora());
        // }

        // Paciente paciente1 = new Paciente("Samuel L Jackson", "jackson@gmail.com",
        // "EUA");

        // Paciente paciente2 = new Paciente("Jorge", "jorge@gmail.com");
        // paciente2.setRol("Paciente");v bfff
        // System.out.println(paciente2);
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

        Doctor usuario = new Doctor("Fernando Lopez", "fer@email.com");

        usuario.mostrarInformacion();

        Paciente paciente = new Paciente("Jorge", "jorge@gmail.com");
        paciente.mostrarInformacion();
    }
}
