package Actividad_3.Upcasting_Downcasting;

public class Upcasting_Downcasting {
    public static void main(String[] args) {
        // DOWNCASTING
        Circulo c = new Cilindro(5,4);
        Cilindro c2 = (Cilindro)c;

        // UPCASTING
        Cilindro d = (Cilindro) new Circulo(5);
    }
}

class Circulo{
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

class Cilindro extends Circulo {
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