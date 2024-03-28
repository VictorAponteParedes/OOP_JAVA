package src;

import java.util.Date;
import java.util.ArrayList;

public class Doctor {

    private static int nextId = 1; // Variable para controlar el próximo ID disponible
    private int id;
    private String nombre;
    private String correo;
    private String speciality;

    // Constructor

    public Doctor() {
        System.out.println("El nombre es");
    }

    public Doctor(String nombre, String speciality) {
        this.id = nextId++; // Asignar el próximo ID disponible y luego incrementarlo
        this.nombre = nombre;
        this.speciality = speciality;
    }

    // Componentes
    public void ShowName() {
        System.out.println("El nombre del doctor es:" + this.nombre);
        System.out.println("La especialidad del doctor es:" + this.speciality);
    }

    public void ShowId() {
        System.out.println("ID del doctor: " + this.id);
    }

    ArrayList<FechaDeCitas> fechaCitas = new ArrayList<>();

    public void addFechaAgendamiento(Date fechaCita, String dia) {
        fechaCitas.add(new FechaDeCitas(fechaCita, dia));
    }

    public ArrayList<FechaDeCitas> getFechaAgendamiento() {
        return fechaCitas;
    }

    public static class FechaDeCitas {

        private int id;
        private Date fechaCita;
        private String hora;

        // Constructor
        public FechaDeCitas(Date fechaCita, String hora) {
            this.id = nextId++; // Asignar el próximo ID disponible y luego incrementarlo
            this.fechaCita = fechaCita;
            this.hora = hora;
        }

        // Getters
        public String getId() {
            return "Nro: " + this.id;
        }

        public String getFechaCita() {
            return "Cita programada para el: " + this.fechaCita;
        }

        public String getHora() {
            return "Hora: " + this.hora;
        }

    }
}
