package Actividad_5;

import java.lang.Comparable;

public class Ej4y5_5 {
    public static void main(String[] args) {

        // Rectángulo (ancho = 2, altura = 3)
        Rectangulo rectangulo = new Rectangulo(4, 2, 3);

        // Área y perímetro
        System.out.println("Área inicial: " + rectangulo.getArea());
        System.out.println("Perímetro inicial: " + rectangulo.getPerimetro());

        // Cambiar el tamaño por un factor de 2
        rectangulo.redimensionar(2);

        // Volver a imprimir área y perímetro
        System.out.println("Área después de redimensionar: " + rectangulo.getArea());
        System.out.println("Perímetro después de redimensionar: " + rectangulo.getPerimetro());
    }
}


// Ac 4
abstract class Forma implements Redimensionable {
    private int numLados;

    public Forma(int numLados) {
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }

    public abstract int getArea();
    public abstract double getPerimetro();
}

class Rectangulo extends Forma implements Comparable<Rectangulo> {

    private int ancho;
    private int alto;
    private static int contadorRec = 0;

    public Rectangulo(int numLados, int ancho, int alto) {
        super(numLados);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public int getArea() {
        return ancho * alto;
    }

    @Override
    public double getPerimetro() {
        return 2 * ancho + 2 * alto;
    }

    @Override
    public void redimensionar(int x) {
        ancho *= x;
        alto *= x;
    }

    @Override
    public int compareTo(Rectangulo otroRectangulo) {
        return Integer.compare(this.getArea(), otroRectangulo.getArea());
    }

    @Override
    public String toString() {
        contadorRec++;
        return "Rectangulo [" + contadorRec + "] " +
                "ancho=" + ancho + ", alto=" + alto +
                ", area=" + getArea();
    }
}

class Triangulo extends Forma {
    private int ancho;
    private int alto;

    public Triangulo(int numLados, int ancho, int alto) {
        super(numLados);
        this.ancho = ancho;
        this.alto = alto;
    }


    @Override
    public int getArea() {
        return (ancho * alto) / 2;
    }

    @Override
    public double getPerimetro() {
        float x = ancho / 2f;

        return Math.sqrt(Math.pow(x, 2) + Math.pow(alto, 2));
    }

    @Override
    public void redimensionar(int x) {
        ancho *= x;
        alto *= x;
    }
}

// Ac 5
interface Redimensionable {
    void redimensionar(int x);
}