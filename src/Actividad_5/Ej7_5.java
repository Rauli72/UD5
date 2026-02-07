package Actividad_5;

import java.util.Arrays;

public class Ej7_5 {
    public static void main(String[] args) {
        Estudiante[] estudiante = new Estudiante[5];

        estudiante[0] = new Estudiante("Patri", 170, 12);
        estudiante[1] = new Estudiante("Manuel", 173, 43);
        estudiante[2] = new Estudiante("Javier", 189, 72);
        estudiante[3] = new Estudiante("Alicia", 168, 52);
        estudiante[4] = new Estudiante("Alberto", 189, 35);

        System.out.println("==== ESTUDIANTES SIN ORDENAR ====");
        for (Estudiante e : estudiante) {
            System.out.println(e.toString());
        }

        // Ordena el array
        Arrays.sort(estudiante);

        System.out.println("\n==== ESTUDIANTES ORDENADOS ====");
        for (Estudiante e : estudiante) {
            System.out.println(e.toString());
        }
    }
}

class Estudiante implements Comparable<Estudiante>{
    private String nombre;
    private int edad;
    private double altura;

    public Estudiante(String nombre, double altura, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + ", altura: " + altura + ", edad: " + edad;
    }

    @Override
    public int compareTo(Estudiante otro) {
        // Primero por altura
        int resultado = Double.compare(otro.altura, this.altura);

        // Si la altura es igual, ordenar por edad
        if (resultado == 0) {
            resultado = Integer.compare(otro.edad, this.edad);
        }

        return resultado;
    }
}