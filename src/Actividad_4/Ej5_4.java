package Actividad_4;

public class Ej5_4 {
    public static void main(String[] args) {
        /*
        Comida c = new Comida("Manzana", 2.5, 19);
        Juguete j = new Juguete("Coche", 15, 5);
        Libro l = new Libro("Alas de Hierro", 25.43, "Rebecca Yarros");

        System.out.println("Comidas: " + c + "\n" +
                "Juguetes: " + j + "\n" +
                "Libros: " + l);

        System.out.printf("Impuesto Comida: %.2f%n", c.calcularImpuestos());
        System.out.printf("Impuesto Juguetes: %.2f%n", j.calcularImpuestos());
        System.out.printf("Impuesto Libros: %.2f%n", l.calcularImpuestos());

         */


        Libro[] libros = new Libro[3];
        libros[0] = new Libro("Alas de Hierro", 25.43, "Rebecca Yarros");
        libros[1] = new Libro("El Señor de los Anillos", 29.59, "Tolkien");
        libros[2] = new Libro("Harry Potter", 25.60, "J.K. Rowling");

        System.out.println("Hola los libros que me he comprado son: " + libros[0] + " y " + libros[1]);
        System.out.printf("Y mi tasa de impuestos es de: %.2f y %.2f%n", libros[0].calcularImpuestos(), libros[1].calcularImpuestos());
        System.out.println("Hola los libros que me he comprado nuevamente son: " + libros[0].toString() + " y " + libros[1].toString());
        System.out.println("Y el mejor autor de todos los tiempos es: " + libros[1].getAutor());
    }
}

class Bienes {
    protected String descripcion;
    protected double precio;

    public Bienes(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }
}

class Comida extends Bienes implements Imponible {
    private double calorias;

    public Comida(String descripcion, double precio, double calorias) {
        super(descripcion, precio);
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return descripcion + " - Calorías: " + calorias;
    }

    @Override
    public double calcularImpuestos() {
        return precio * TASA_DE_IMPUESTOS;
    }
}

class Juguete extends Bienes implements Imponible {
    private int edadMinima;

    public Juguete(String descripcion, double precio, int edadMinima) {
        super(descripcion, precio);
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return descripcion + " - Edad Mínima: " + edadMinima;
    }

    @Override
    public double calcularImpuestos() {
        return precio * TASA_DE_IMPUESTOS;
    }
}

class Libro extends Bienes implements Imponible {
    private String autor;

    public Libro(String descripcion, double precio, String autor) {
        super(descripcion, precio);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return descripcion + " - Autor: " + autor;
    }

    @Override
    public double calcularImpuestos() {
        return precio * TASA_DE_IMPUESTOS;
    }
}

interface Imponible {
    double TASA_DE_IMPUESTOS = 0.06;
    double calcularImpuestos();
}