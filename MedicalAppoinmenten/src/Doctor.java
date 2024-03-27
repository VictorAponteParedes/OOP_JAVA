package src;

public class Doctor {

    static int id = 0;
    String nombre;
    String correo;
    String speciality;

    // Constructor
    Doctor() {
        System.out.println("El nombre del doctor designado es: ");

    }

    Doctor(String nombre, String speciality) {
        this.nombre = nombre;
        this.speciality = speciality;
        id++;
    }

    // Componentes
    public void ShowName() {
        System.out.println("El nombre del doctor es:" + this.nombre);
        System.out.println("La especialidad del doctor es:" + this.speciality);
    }

    public void ShowId() {
        System.out.println("ID del doctor: " + id);
    }

}
