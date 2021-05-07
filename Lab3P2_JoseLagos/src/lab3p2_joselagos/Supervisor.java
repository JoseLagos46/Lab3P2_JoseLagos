package lab3p2_joselagos;

class Supervisor extends Personas {

    private int cajeros;
    private double salarioP;
    private double metaP;

    public Supervisor() {
        super();
    }

    public Supervisor(int cajeros, double salarioP, double metaP, String user, String clave, String nombre, String apellido, double salario, String nacionalidad) {
        super(user, clave, nombre, apellido, salario, nacionalidad);
        this.cajeros = cajeros;
        this.salarioP = salarioP;
        this.metaP = metaP;
    }

    public int getCajeros() {
        return cajeros;
    }

    public void setCajeros(int cajeros) {
        this.cajeros = cajeros;
    }

    public double getSalarioP() {
        return salarioP;
    }

    public void setSalarioP(double salarioP) {
        this.salarioP = salarioP;
    }

    public double getMetaP() {
        return metaP;
    }

    public void setMetaP(double metaP) {
        this.metaP = metaP;
    }

    @Override
    public String toString() {
        return "Supervisor: " + "Numero de cajeros supervisados = " + cajeros + ", Salario promedio de empleados supervisados = " + salarioP + ", Meta promedio de empleados supervisados = " + metaP;
    }

}
