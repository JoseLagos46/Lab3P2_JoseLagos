package lab3p2_joselagos;

public class Articulos {
    private int serie;
    private double precio;
    private String color;
    private String info;

    public Articulos() {
    }

    public Articulos(int serie, double precio, String color, String info) {
        this.serie = serie;
        this.precio = precio;
        this.color = color;
        this.info = info;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Numero de serie = " + serie + ", Precio = " + precio + ", Color = " + color + ", Informacion de la garantia = " + info;
    }
    
    
}
