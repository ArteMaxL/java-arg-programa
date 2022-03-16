import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Crear una stack que permita objetos de tipo Autos, donde cada objeto auto debe tener: num_patente, marca,
        // modelo, color, chasis. Cargar la pila con 7 autos diferentes luego hacer lo siguiente:
        //a.      Buscar un auto de color rojo.
        //b.      Mostrar el auto que se encuentra en la cima de la pila.
        //c.       Borrar el auto que se encuentra en la cima de la pila.
        //d.      Agregar dos nuevos autos a la pila.
        //Recorrer la pila mostrando el nuevo contenido luego de las operaciones realizadas.

        Stack<Auto> listaAutos = new Stack<>();

        listaAutos.add(new Auto("12345", "Ford", "Ranger", "rojo", "pickup"));
        listaAutos.add(new Auto("1kjs", "Peugeot", "206", "gris", "hatch"));
        listaAutos.add((new Auto("kjasd3", "Tata", "Sumo", "blanco", "suv")));
        listaAutos.add(new Auto("kjlms", "Renault", "Clio", "verde", "hatch"));
        listaAutos.add(new Auto("01922h1", "Toyota", "Corolla", "negro", "sedán"));
        listaAutos.add(new Auto("kde2", "Volkswagen", "Golf", "rojo", "hatch"));
        listaAutos.add(new Auto("dkj2l3", "Honda", "Accord", "celeste", "sedán"));


        for (Auto auto :
                listaAutos) {
            if (auto.getColor().equalsIgnoreCase("rojo")) {
                System.out.println("Auto: " + auto.getMarca() + " - Modelo: " + auto.getModelo() + " - Color: " + auto.getColor());
                System.out.println("---------------------------------");
            }
        }

        System.out.println("Auto al final de la pila, a eliminar: ");
        System.out.println(listaAutos.lastElement().toString());
        System.out.println("---------------------------");
        listaAutos.remove(listaAutos.size() - 1);

        listaAutos.add(new Auto("1245fd", "BMW", "M3", "azul", "sedán"));
        listaAutos.add(new Auto("d34kd", "Audi", "A4", "negro", "sedán"));

        for (Auto auto :
                listaAutos) {
            System.out.println("Auto: " + auto.getMarca() + " - Modelo: " + auto.getModelo() + " - Color: " + auto.getColor());
            System.out.println("---------------------------------");
        }
    }
}
