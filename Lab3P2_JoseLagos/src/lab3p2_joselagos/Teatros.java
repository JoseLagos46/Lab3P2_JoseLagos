package lab3p2_joselagos;

public class Teatros extends Articulos{
    private int altavoces;
    private int bluray;
    private String limpieza;
    private String lector;

    public Teatros() {
        super();
    }

    public Teatros(int altavoces, int bluray, String limpieza, String lector, int serie, double precio, String color, String info) {
        super(serie, precio, color, info);
        this.altavoces = altavoces;
        this.bluray = bluray;
        this.limpieza = limpieza;
        this.lector = lector;
    }

    public int getAltavoces() {
        return altavoces;
    }

    public void setAltavoces(int altavoces) {
        this.altavoces = altavoces;
    }

    public int getBluray() {
        return bluray;
    }

    public void setBluray(int bluray) {
        this.bluray = bluray;
    }

    public String getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(String limpieza) {
        this.limpieza = limpieza;
    }

    public String getLector() {
        return lector;
    }

    public void setLector(String lector) {
        this.lector = lector;
    }

    @Override
    public String toString() {
        return "Teatros en casa: " + "Cantidad de altavoces = " + altavoces + ", Cantidad de discos Blu-Ray soportados = " + bluray + ", Informacion de limpieza = " + limpieza + ", Informacion sobre el lector de discos = " + lector;
    }
    
}
