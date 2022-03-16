import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //1.      Crear una clase Mascota, que tenga los siguientes atributos: nombre, especie, sexo, color, pelaje y
        // raza (tener en cuenta todos sus atributos, constructores y métodos getters y setters). A partir de ello:
        //a.      Crear un ArrayList de tipo Mascota. Crear 5 mascotas y guardarlas en la lista.
        //b.      Recorrer la lista creada y mostrar por pantalla el nombre, especie y pelaje de las mascotas almacenadas.
        //c.       Durante el recorrido, cambiar el nombre de dos mascotas. Volver a recorrer la lista y mostrar los nuevos datos
        //d.      Agregar dos nuevas mascotas a la lista.
        //e.      Recorrer la lista pero solo mostrando las mascotas que sean de la especie “perro”.
        ArrayList<Mascota> listaMascotas = new ArrayList<>();
        int count = 0;
        listaMascotas.add(new Mascota(
                "Nina", "gato", "femenino", "blanco", "largo", "angora"));
        listaMascotas.add(new Mascota(
                "Teo", "gato", "masculino", "blanco", "corto", "portugués"));
        listaMascotas.add(new Mascota(
                "La Monita", "gato", "femenino", "marrón", "corto", "criolla"));
        listaMascotas.add(new Mascota(
                "Marcia", "gato", "femenino", "blanco", "largo", "angora"));
        listaMascotas.add(new Mascota(
                "Molly", "perro", "femenino", "negro", "corto", "cruza galgo"));

        System.out.println("Listado parcial de mascotas, hay " + (listaMascotas.size()) + " en total\n" +
                "*********************************************");
        for (Mascota mascota :
                listaMascotas) {
            if (mascota.getNombre().equalsIgnoreCase("Teo")) {
                mascota.setNombre("El Monito");
            }
            if (mascota.getNombre().equalsIgnoreCase("Nina")) {
                mascota.setNombre("El Panda");
            }
            System.out.println("Nombre: " + mascota.getNombre() + " - Especie: " + mascota.getEspecie() + " - Pelaje: "
                    + mascota.getPelaje());
            System.out.println("-------------------------------------------------------");
        }

        listaMascotas.add(new Mascota(
                "Winnie", "perro", "femenino", "negro", "mediano", "cruza ovejero"));
        listaMascotas.add(new Mascota(
                "Mía", "gato", "femenino", "marrón", "largo", "criolla"));

        System.out.println("Listado de mascotas, especie perro: \n***********************************");
        for (Mascota mascota :
                listaMascotas) {
            if (mascota.getEspecie().equalsIgnoreCase("perro")) {
                count += 1;
                System.out.println("Nombre: " + mascota.getNombre() + " - Especie: " + mascota.getEspecie() + " - Pelaje: "
                        + mascota.getPelaje());
                System.out.println("-------------------------------------------------------");
            }
        }
        if (count != 0) {
            if (count == 1) {
                System.out.println("Se encontró " + count + " perro.");
            } else {
                System.out.println("Se encontraron " + count + " perros.");
            }
        } else {
            System.out.println("No se encontraron perros en la lista.");
        }
    }
}