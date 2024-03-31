package src.model;

public class Enfermera extends Usuario {

    private String especialidad;

    Enfermera(String nombre, String email) {
        super(nombre, email);

    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return "Especialidad: " + this.especialidad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Departamento: clinico");
        System.out.println("Hospital: Central de Itá");
        System.out.println("Enfermera: 5 años");

    }

}
