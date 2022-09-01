package clases;

public class Estudiante {

    private String nombre;
    private String identificacion;
    private int edad;
    private int salon;
    private int nota;
    private double promedioNota;

    public Estudiante() {
    }

    public Estudiante(String nombre, String identificacion, int edad, int salon, int nota, double promedioNota) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.salon = salon;
        this.nota = nota;
        this.promedioNota = promedioNota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public double getPromedioNota() {
        return promedioNota;
    }

    public void setPromedioNota(double promedioNota) {

        if(promedioNota > 5){
            System.out.println("NOta invalida");
        }else{
            this.promedioNota = promedioNota;
        }
    }

    public double calcularPromedioNota(){

        return this.nota + this.promedioNota;

    }
}
