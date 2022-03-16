import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        //2. Realizar un programa que permita el ingreso de dos números por teclado para ser divididos entre sí.
        // Tomar como precaución la utilización del try y el catch por si el segundo número ingresado para dividir se
        // trata de un cero. Mostrar un mensaje adecuado en caso de que se produzca la excepción.
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        double resultado;

        System.out.println("División. A continuación se te pedirá el 1er número:");
        num1 = teclado.nextInt();
        System.out.println("Ingresa el 2do número:");
        num2 = teclado.nextInt();

        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero!!!.");
        } else {
            resultado = 1.0 * num1 / num2;
            System.out.println("El resultado de dividir " + num1 + "/" + num2 + " = " + resultado);
        }
    }
}
