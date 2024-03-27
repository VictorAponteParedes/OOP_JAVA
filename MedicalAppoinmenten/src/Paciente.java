package src;

public class Paciente {
    int id;
    String nombre;
    String correo;
    String direccion;
    String telefono;
    String aniversario;
    float peso;
    String altura;
    String blood;

    Paciente(String nombre, String correo, String direccion) {

        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
    }

}