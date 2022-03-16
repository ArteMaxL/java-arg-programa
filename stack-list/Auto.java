public class Auto {
    private String numPatente;
    private String marca;
    private String modelo;
    private String color;
    private String chasis;

    public Auto(String numPatente, String marca, String modelo, String color, String chasis){
        this.numPatente = numPatente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.chasis = chasis;
    }

    public String getNumPatente() {
        return numPatente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getChasis() {
        return chasis;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return getMarca() + " - " + getModelo() + " - " + getColor();
    }
}