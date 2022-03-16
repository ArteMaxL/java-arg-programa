import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        //Realizar un programa donde se provoque una excepción de tipo “error por desbordamiento”. Tratar la
        // excepción mediante los bloques try y catch y mostrar un mensaje indicando la situación.
        // Por ejemplo: “Se produjo un error por desbordamiento”.
        Scanner teclado = new Scanner(System.in);
        int[] numeros = {1, 2, 3, 4, 5};
        boolean isOk = false;

        do {
            int posicion = 0;
            try {
                System.out.println("Ingresa la posición del vector");
                posicion = teclado.nextInt();
                System.out.println("El elemento en la posición: " + posicion + ", es: " + numeros[posicion]);
                isOk = true;
            } catch (Exception e) {
                System.out.println("Ingresaste una posición no válida!. La posición: " + posicion + " no existe.");
            }
        } while (!isOk);
    }
}