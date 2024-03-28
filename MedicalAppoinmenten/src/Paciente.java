package src;

//Clase Padre
public class Paciente {
    // Propiedad o Atributo
    int id;
    private String nombre;
    private String correo;
    private String direccion;
    private String telefono;
    private String aniversario;
    private double peso;
    private String altura;
    private String blood;

    // Constructor
    Paciente(String nombre, String correo, String direccion) {
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
    }

    // Metodos Setters and Getters
    public void setPeso(double peso) // los paramentros son los valores que pones los usuarios
    {
        this.peso = peso;
    }

    public String getPeso() {
        return this.peso + " Kg.";
    }

    public void setTelefono(String nroTelefono) {
        if (nroTelefono.length() > 9) {
            System.out.println("Solo se permite 8 digítos");
        } else if (nroTelefono.length() < 9) {
            System.out.println("El numero debe ser ser mas largo");
        } else {

            this.telefono = nroTelefono;
        }
    }

    public String getTelefono() {
        return "Nro: " + this.telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return "Nombre: " + this.nombre;
    }

}