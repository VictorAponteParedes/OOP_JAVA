package src.model;

import java.util.Date;

public class CitasEnfermera implements IHorariaable {

    private int id;
    private Paciente paciente;
    private Enfermera enfermera;

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

    public void setEnfermera(Enfermera enfermera) {
        this.enfermera = enfermera;
    }

    public String getEnfermera() {
        return "Enfermera: " + this.enfermera;
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
