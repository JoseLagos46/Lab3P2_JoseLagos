package lab3p2_joselagos;

public class Consolas extends Articulos {
    private String marca;
    private int almacenamiento;
    private int controles;
    private int accesorios;
    private String tarjetaInfo;

    public Consolas() {
        super();
    }

    public Consolas(String marca, int almacenamiento, int controles, int accesorios, String tarjetaInfo, int serie, double precio, String color, String info) {
        super(serie, precio, color, info);
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.controles = controles;
        this.accesorios = accesorios;
        this.tarjetaInfo = tarjetaInfo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getControles() {
        return controles;
    }

    public void setControles(int controles) {
        this.controles = controles;
    }

    public int getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(int accesorios) {
        this.accesorios = accesorios;
    }

    public String getTarjetaInfo() {
        return tarjetaInfo;
    }

    public void setTarjetaInfo(String tarjetaInfo) {
        this.tarjetaInfo = tarjetaInfo;
    }

    @Override
    public String toString() {
        return "Consolas: " + "Marca = " + marca + ", Almacenamiento = " + almacenamiento + "GB, Numero de controles = " + controles + ", Cantidad de accesorios = " + accesorios + ", Informacion de la tarjeta de video = " + tarjetaInfo;
    }


    
}
