package src.model;

public abstract class Usuario {

    private int id;
    private String nombre;
    private String email;
    private String direccion;
    private String nroTelefono;
    private String rol;

    // Constructor
    public Usuario(String nombre, String email) {

        this.nombre = nombre;
        this.email = email;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId() {
        return "ID: " + this.id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return "El nombre es: " + this.nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return "Email: " + this.email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        if (this.direccion == null) {
            return "Dirección: Sin dirección";
        } else {
            return "Dirección: " + this.direccion;
        }
    }

    public void setTelefono(String nroTelefono) {
        if (nroTelefono.length() > 9) {
            System.out.println("Solo se permite 8 digítos");
        } else if (nroTelefono.length() < 9 || nroTelefono.length() == 0)

        {
            System.out.println("El numero debe ser ser mas largo");
        } else {

            this.nroTelefono = nroTelefono;
        }
    }

    public String getTelefono() {
        if (this.nroTelefono == null) {
            return "Nro Teléfono: " + "Sin Nro de Teléfono";
        }
        return "Nro Teléfono: " + this.nroTelefono;

    }

    public void setRol(String rol) {
        this.rol = rol;

    }

    public String getRol() {
        return "Rol: " + this.rol;
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + "\n"
                + "Email: " + email + "\n"
                + getDireccion() + "\n"
                + getTelefono() + "\n"
                + getRol();
    }

    public abstract void mostrarInformacion();

}
