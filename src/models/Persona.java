package models;

public class Persona {
    private int edad;
    private String nombre;
public Persona(){}
    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return edad;
    }

    public void setCodigo(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
    }
    

}
