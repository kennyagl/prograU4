package unidad4.implementaciones;

/**
 *
 * @author Kenny
 */
public class TestColaPersonas {

    public static void main(String[] args) {
        ColaPersonas cola = new ColaPersonas();
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        cola.agregar(persona);

        persona = new Persona();
        persona.setNombre("Maria");
        persona.setApellido("Gonzalez");
        cola.agregar(persona);

        persona = new Persona();
        persona.setNombre("Carlos");
        persona.setApellido("Slim");
        cola.agregar(persona);

        Persona aux = (Persona) cola.siguiente();
        while(aux != null){
            System.out.println(aux.getNombre() + " " + aux.getApellido());
            aux = (Persona) cola.siguiente();
        }

    }
}
