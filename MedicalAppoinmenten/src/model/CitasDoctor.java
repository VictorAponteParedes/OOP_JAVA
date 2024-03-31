package src.model;

import java.util.Date;

public class CitasDoctor implements IHorariaable {

    private int id;
    private Paciente paciente;
    private Doctor doctor;

    private Date fecha;
    private String hora;

    public void setId(int id) {
        this.id = id;
    }

    public String getId() {
        return "ID: " + this.id;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getPaciente() {
        return "Paciente: " + this.paciente;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getDoctor() {
        return "Doctor: " + this.doctor;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return "Fecha: " + this.fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return "Hora: " + this.hora;
    }

    @Override
    public void horario(Date fecha, String hora) {

    }

}
