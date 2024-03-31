package src.model;

import java.util.Date;
import java.util.ArrayList;

public class Doctor extends Usuario {

    private String especialidad;

    // Constructor
    public Doctor(String nombre, String email) {
        super(nombre, email);

    }

    // Getters and Setters
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return "Especialidad: " + this.especialidad;
    }

    ArrayList<FechaDeCitas> fechaCitas = new ArrayList<>();

    // Metodo
    public void addFechaAgendamiento(Date fechaCita, String hora) {
        fechaCitas.add(new FechaDeCitas(fechaCita, hora));
    }

    public ArrayList<FechaDeCitas> getFechaAgendamiento() {
        return fechaCitas;
    }

    public static class FechaDeCitas {

        private int id;
        private Date fechaCita;
        private String hora;

        // Constructor de la clase hija
        public FechaDeCitas(Date fechaCita, String hora) {

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

        @Override
        public String toString() {
            return "Fechas disponibles: \n Fecha: " + fechaCita + "\n Hora: " + hora;
        }

    }

    @Override
    public String toString() {
        return super.toString()
                + "\n"
                + "Especialidad: " + especialidad + "\n" + "Citas:" + fechaCitas.toString();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Departamento: clinico");
        System.out.println("Hospital: Central de Itá");
    }
}
