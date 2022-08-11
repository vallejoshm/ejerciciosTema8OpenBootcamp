import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Main {

    public static void main (String [] args){

        Persona miPersona1 = new Persona();
        miPersona1.setNombre("Hernan");
        miPersona1.setEdad(33);
        miPersona1.setTelefono("1122334455");

        System.out.println("Nombre: "+ miPersona1.getNombre());
        System.out.println("Edad: "+ miPersona1.getEdad());
        System.out.println("Teléfono: "+ miPersona1.getTelefono());

    }

}

class Persona {

    private int edad;
    private String nombre;
    private String telefono;

    public Persona() {}

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
