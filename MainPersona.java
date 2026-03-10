import java.util.ArrayList;

public class MainPersona {
    public static void main(String[] args) {
        Persona juan = new Persona("Juan", 30, "Calle 123");
        Persona maria = new Persona("Maria", 25);
        Persona pedro = new Persona("Pedro", 40, "Avenida 456");
        Persona ana = new Persona("Ana", 35);
        ArrayList<Persona> mostrar=new ArrayList<>();
        mostrar.add(juan);
        mostrar.add(maria);
        mostrar.add(pedro);
        mostrar.add(ana);
        for (Persona persona : mostrar) {
            System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad() + ", Dirección: " + persona.getDireccion());
        }


    }
    
}
