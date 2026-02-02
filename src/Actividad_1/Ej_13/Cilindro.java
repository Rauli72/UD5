package Actividad_1.Ej_13;

public class Cilindro extends Circulo {
    private double altura;

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getVolume() {
        return this.altura * getArea();
    }
}
