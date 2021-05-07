package lab3p2_joselagos;

import java.util.ArrayList;

public class Clientes extends Personas{
    private double credito;
    private ArrayList<String> articulos;
    private int vecesC;
    private String direccion;

    public Clientes() {
        super();
    }

    public Clientes(double credito, int vecesC, String direccion, String user, String clave, String nombre, String apellido, double salario, String nacionalidad, ArrayList<String> articulos) {
        super(user, clave, nombre, apellido, salario, nacionalidad);
        this.credito = credito;
        this.vecesC = vecesC;
        this.direccion = direccion;
        this.articulos = articulos;
    }

    
    
    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public ArrayList<String> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<String> articulos) {
        this.articulos = articulos;
    }

    public int getVecesC() {
        return vecesC;
    }

    public void setVecesC(int vecesC) {
        this.vecesC = vecesC;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Clientes: " + "Credito accesible = " + credito + ", Articulos comprados recientemente = " + articulos + ", Veces que a comprado en la tienda = " + vecesC + ", Direccion de domicilio = " + direccion;
    }
    
}
