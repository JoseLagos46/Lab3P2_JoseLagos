package lab3p2_joselagos;

public class Sonido extends Articulos{
    private int altavoces;
    private int potencia;
    private int auxiliares;
    private int discos;
    private int USB;

    public Sonido() {
        super();
    }

    public Sonido(int altavoces, int potencia, int auxiliares, int discos, int USB, int serie, double precio, String color, String info) {
        super(serie, precio, color, info);
        this.altavoces = altavoces;
        this.potencia = potencia;
        this.auxiliares = auxiliares;
        this.discos = discos;
        this.USB = USB;
    }

    public int getAltavoces() {
        return altavoces;
    }

    public void setAltavoces(int altavoces) {
        this.altavoces = altavoces;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAuxiliares() {
        return auxiliares;
    }

    public void setAuxiliares(int auxiliares) {
        this.auxiliares = auxiliares;
    }

    public int getDiscos() {
        return discos;
    }

    public void setDiscos(int discos) {
        this.discos = discos;
    }

    public int getUSB() {
        return USB;
    }

    public void setUSB(int USB) {
        this.USB = USB;
    }

    @Override
    public String toString() {
        return "Equipos de sonido: " + "Cantidad de altavoces = " + altavoces + ", Potencia maxima = " + potencia + "kHz, Cantidad de puertos auxiliares = " + auxiliares + ", Cantidad de discos soportados = " + discos + ", Cantidad de entradas USB = " + USB;
    }
    
}
