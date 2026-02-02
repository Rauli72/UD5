package Actividad_3;

public class Ej4_3 {
    public static void main(String[] args) {
        Pintura pintura = new Pintura(250);

        Forma rectangulo = new Rectangulo("Rectángulo",20, 35);
        Forma esfera = new Esfera("Esfera",15);
        Forma cilindro = new Cilindro("Cilindro",10, 30);

        System.out.println("Pintura necesaria para: "
                + pintura.calcularPintura(rectangulo));

        System.out.println("Pintura necesaria para: "
                + pintura.calcularPintura(esfera));

        System.out.println("Pintura necesaria para: "
                + pintura.calcularPintura(cilindro));
    }
}
class Forma {

    protected String nombre;

    public Forma(String nombre) {
        this.nombre = nombre;
    }

    public double area() {
        return 0;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}


class Esfera extends Forma{
    private float radio;

    public Esfera(String nombre, float radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double area() {
        return 4 * Math.pow(radio, 2) * Math.PI;
    }
    @Override
    public String toString() {
        return "Esfera{" + "nombre=" + nombre + ", radio=" + radio + '}';
    }
}


class Rectangulo extends Forma{
    private float longitud;
    private float ancho;

    public Rectangulo(String nombre, float longitud, float ancho) {
        super(nombre);
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double area() {
        return longitud * ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "longitud=" + longitud + ", ancho=" + ancho + '}';
    }
}


class Cilindro extends Forma{
    private float radio;
    private float altura;

    public Cilindro(String nombre, float radio, float altura) {
        super(nombre);
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                ", radio=" + radio +
                '}';
    }
}

class Pintura {

    private double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    /*
    Recibe un objeto de tipo Forma, pero en realidad se le pasan objetos de las clases hijas
    (Rectangulo, Esfera, Cilindro).

    Y en tiempo de ejecución,
    Java invoca el métod0 area() correspondiente a la clase real del objeto, no al tipo de la referencia.
     */
    public double calcularPintura(Forma forma) {
        return forma.area() / cobertura;
    }
}
