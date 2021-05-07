package lab3p2_joselagos;

public class Tiendas {
    private String identificador;
    private String ubicacion;
    private int MaxEmp;
    private int cajas;
    private String mVendido;
    private int MaxProd;

    public Tiendas() {
    }

    public Tiendas(String identificador, String ubicacion, int MaxEmp, int cajas, String mVendido, int MaxProd) {
        this.identificador = identificador;
        this.ubicacion = ubicacion;
        this.MaxEmp = MaxEmp;
        this.cajas = cajas;
        this.mVendido = mVendido;
        this.MaxProd = MaxProd;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getMaxEmp() {
        return MaxEmp;
    }

    public void setMaxEmp(int MaxEmp) {
        this.MaxEmp = MaxEmp;
    }

    public int getCajas() {
        return cajas;
    }

    public void setCajas(int cajas) {
        this.cajas = cajas;
    }

    public String getmVendido() {
        return mVendido;
    }

    public void setmVendido(String mVendido) {
        this.mVendido = mVendido;
    }

    public int getMaxProd() {
        return MaxProd;
    }

    public void setMaxProd(int MaxProd) {
        this.MaxProd = MaxProd;
    }

    @Override
    public String toString() {
        return "Tienda: " + "Identificador = " + identificador + ", Ubicacion = " + ubicacion + ", Maximo de Empleados = " + MaxEmp + ", Numero de cajas de pago = " + cajas + ", Articulo mas vendido = " + mVendido + ", Cantidad maxima de productos = " + MaxProd ;
    }
    
}
