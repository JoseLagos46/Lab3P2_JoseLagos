package lab3p2_joselagos;

public class Cajero extends Personas {

    private int años;
    private String horario;
    private String lunch;
    private double meta;
    private int atendidos;

    public Cajero() {
        super();
    }

    public Cajero(int años, String horario, String lunch, double meta, int atendidos, String user, String clave, String nombre, String apellido, double salario, String nacionalidad) {
        super(user, clave, nombre, apellido, salario, nacionalidad);
        this.años = años;
        this.horario = horario;
        this.lunch = lunch;
        this.meta = meta;
        this.atendidos = atendidos;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public double getMeta() {
        return meta;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }

    public int getAtendidos() {
        return atendidos;
    }

    public void setAtendidos(int atendidos) {
        this.atendidos = atendidos;
    }

    @Override
    public String toString() {
        return "Cajero: " + ", Años trabajando en Diunsa = " + años + ", Horario de trabajo = " + horario + ", Hora de almuerzo = " + lunch + ", Meta por vender mensualmente = " + meta + ", Empleados atendidos = " + atendidos;
    }

}
