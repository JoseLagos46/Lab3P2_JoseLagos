package lab3p2_joselagos;

public class Televisores extends Articulos{
    private int tamaño;
    private boolean smart;
    private String marca;
    private int conexiones;
    private double grosor;

    public Televisores() {
        super();
    }

    public Televisores(int tamaño, boolean smart, String marca, int conexiones, double grosor, int serie, double precio, String color, String info) {
        super(serie, precio, color, info);
        this.tamaño = tamaño;
        this.smart = smart;
        this.marca = marca;
        this.conexiones = conexiones;
        this.grosor = grosor;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getConexiones() {
        return conexiones;
    }

    public void setConexiones(int conexiones) {
        this.conexiones = conexiones;
    }

    public double getGrosor() {
        return grosor;
    }

    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return "Televisor: " + "Tamaño = " + tamaño + "in, Smart TV = " + smart + ", Marca = " + marca + ", Numero de conexiones = " + conexiones + ", Grosor = " + grosor;
    }
    
}
