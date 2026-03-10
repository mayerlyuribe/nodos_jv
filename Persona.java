public class Persona {  
    private String nombre;
    private int edad;
    private String direccion;
    //Modificadores de acceso: public, private, protected, default
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    public String getDireccion() {
        return direccion;
    }
    
}
