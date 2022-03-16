public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String celular;
    private int edad;

    public Persona(int dni, String nombre, String apellido, String direccion, String celular, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.celular = celular;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCelular() {
        return celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
