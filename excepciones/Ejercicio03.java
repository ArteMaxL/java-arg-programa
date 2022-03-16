public class Ejercicio03 {
    public static void main(String[] args) {
        //Realizar una clase de Excepciones Personalizada que extienda de la clase Exception. Implementar los diferentes
        // métodos que sean necesarios teniendo en cuenta cada uno de los mensajes personalizados que podrían arrojar.
        // Provocar la ejecución de la excepción personalizada mediante la sentencia throw para probar la ejecución de
        // la excepción y responder… ¿Se ejecuta correctamente? ¿Qué método de la excepción se ejecutó?

        double division;
        int[] array = {1, 2, 3};

        try {
            division = 8 / 0;
            throw new Excepciones();
            //  int a = array[3];
            // throw new Excepciones();
        } catch (Excepciones e) {
            e.exMath(e);
            //e.exNull();
        }
    }

    public static class Excepciones extends Exception {

        public Excepciones() {
            super();
        }

        public String exMath(Exception e) {
            return "No se puede dividir por cero!.";
        }

        public String exNull() {
            return "El índice no existe!.";
        }
    }
}