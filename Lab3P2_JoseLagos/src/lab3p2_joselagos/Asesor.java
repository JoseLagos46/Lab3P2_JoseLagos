package lab3p2_joselagos;

public class Asesor extends Personas {

    private int atendidos;
    private int productosC;
    private int creditos;

    public Asesor() {
        super();
    }

    public Asesor(int atendidos, int productosC, int creditos, String user, String clave, String nombre, String apellido, double salario, String nacionalidad) {
        super(user, clave, nombre, apellido, salario, nacionalidad);
        this.atendidos = atendidos;
        this.productosC = productosC;
        this.creditos = creditos;
    }

    public int getAtendidos() {
        return atendidos;
    }

    public void setAtendidos(int atendidos) {
        this.atendidos = atendidos;
    }

    public int getProductosC() {
        return productosC;
    }

    public void setProductosC(int productosC) {
        this.productosC = productosC;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Asesor: " + "Numero de clientes atendidos = " + atendidos + ", Numero de productos comprados por clientes = " + productosC + ", Numero de creditos concedidos = " + creditos;
    }

}
