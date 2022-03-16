import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //2.      Crear una clase persona que tenga los siguientes atributos: dni, nombre, apellido, dirección, celular,
        // edad (tener en cuenta todos sus atributos, constructores y métodos getters y setters). A partir de ello:
        //a.      Crear una LinkedList de tipo Persona y agregar 20 personas distintas.
        //b.      Crear dos LinkedLists de tipo Persona diferentes a la primera, una para almacenar a los menores de
        // edad y otra para los mayores.
        //c.       Recorrer la lista principal buscando a las personas que sean mayores de 18 años. En caso que una
        // persona tenga o sea mayor a 18 años, agregarla a la lista de mayores, caso contrario agregarla a una lista de menores.
        //d.      Una vez realizada la separación, recorrer ambas nuevas listas y mostrar por pantalla el nombre,
        // apellido y edad de cada una de las personas contenidas en cada lista.

        LinkedList<Persona> listaPersonas = new LinkedList<>();
        LinkedList<Persona> listaMenores = new LinkedList<>();
        LinkedList<Persona> listaMayores = new LinkedList<>();


        for (int i = 1; i <= 20; i++) {
            listaPersonas.add(new Persona(i, ("Persona" + i), ("Apellido" + i), ("Direccion" + i), ("12345"+i), (13+i) ));
        }
        for (Persona persona:
             listaPersonas) {
            if(persona.getEdad() >= 18){
                listaMayores.add(persona);
            }else{
                listaMenores.add(persona);
            }
        }
        System.out.println("Listado de Menores de edad:\n************************");
        for (Persona menor:
             listaMenores) {
            System.out.println("Nombre: " + menor.getNombre() + " - Apellido: " + menor.getApellido() + " - Edad: " + menor.getEdad());
            System.out.println("--------------------------------------------------");
        }

        System.out.println("Listado de Mayores de edad:\n************************");
        for (Persona mayor:
                listaMayores) {
            System.out.println("Nombre: " + mayor.getNombre() + " - Apellido: " + mayor.getApellido() + " - Edad: " + mayor.getEdad());
            System.out.println("--------------------------------------------------");
        }
    }
}