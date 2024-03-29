package src;

//Clase Padre
public class Paciente extends Usuario {
    // Propiedad o Atributo
    private double peso;
    private String aniversario;
    private String altura;
    private String sangre;

    // Constructor o pude haber mas!
    Paciente(String nombre, String email) {
        super(nombre, email);
    }

    // Metodos Setters and Getters
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPeso() {
        return this.peso + " Kg.";
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public String getAniversario() {
        return "Cumpleaños: " + this.aniversario;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getAltura() {
        return "Altura: " + this.altura;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public String getSangre() {
        return "Sangre: " + this.sangre;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n"
                + "Peso: " + "\n" + peso + "\n"
                + "Aniversario: " + aniversario + "\n"
                + "Altura: " + altura + "\n"
                + "Sangre: " + sangre + "\n";
    }

}