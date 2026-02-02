package Actividad_1.Ej_12;

public class Coche extends Vehiculo {
    protected int ruedas;

    public Coche(String nombre, int velocidad, int ruedas) {
        super(nombre, velocidad);
        this.ruedas = ruedas;
    }
}
