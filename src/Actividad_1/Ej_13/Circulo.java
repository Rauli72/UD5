package Actividad_1.Ej_13;

public class Circulo{
    private double radio;

    public Circulo(double radio) {
        if (radio < 0) {
            this.radio = 0;
        } else {
            this.radio = radio;
        }
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return Math.pow(this.radio,2) * Math.PI;
    }
}
