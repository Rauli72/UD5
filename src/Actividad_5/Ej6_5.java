package Actividad_5;

import java.util.Arrays;

public class Ej6_5 {
    public static void main(String[] args) {
        Rectangulo[] rectangulos = new Rectangulo[10];

        rectangulos[0] = new Rectangulo(4, 2, 3);
        rectangulos[1] = new Rectangulo(4, 5, 1);
        rectangulos[2] = new Rectangulo(4, 4, 4);
        rectangulos[3] = new Rectangulo(4, 1, 2);
        rectangulos[4] = new Rectangulo(4, 6, 2);
        rectangulos[5] = new Rectangulo(4, 3, 3);
        rectangulos[6] = new Rectangulo(4, 7, 1);
        rectangulos[7] = new Rectangulo(4, 2, 8);
        rectangulos[8] = new Rectangulo(4, 5, 5);
        rectangulos[9] = new Rectangulo(4, 1, 1);

        // Ordenación por área
        Arrays.sort(rectangulos);

        // Mostrar resultados
        for (Rectangulo r : rectangulos) {
            System.out.println(r.toString());
        }
    }
}

