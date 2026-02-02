package Actividad_1.Ej_12;

public class CocheCombustion extends Coche {
    private int marcha;

    public CocheCombustion(String nombre, int velocidad, int ruedas, int marcha) {
        super(nombre, velocidad, ruedas);
        this.marcha = marcha;
    }

    public void cambiarMarcha(int nuevaMarcha) {
        this.marcha = nuevaMarcha;
        System.out.println("Marcha cambiada a: " + marcha);
    }
}
