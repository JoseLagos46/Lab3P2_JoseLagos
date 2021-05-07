package lab3p2_joselagos;

public class Personas {
    private String user;
    private String clave;
    private String nombre;
    private String apellido;
    private double salario;
    private String nacionalidad;
    

    public Personas() {
    }

    public Personas( String user, String clave, String nombre, String apellido, double salario, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.user = user;
        this.clave = clave;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Empleado: " + "Nombre = " + nombre + ", Apellido = " + apellido + ", Salario = " + salario + ", Nacionalidad = " + nacionalidad;
    }
    
}
