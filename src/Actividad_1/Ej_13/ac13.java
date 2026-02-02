package Actividad_1.Ej_13;

public class ac13 {
    public static void main(String[] args) {
        // Prueba círculo y cilindro
        Circulo c = new Circulo(5);
        System.out.printf("Área del círculo: %.2f%n", c.getArea());


        Cilindro cil = new Cilindro(3, 10);
        System.out.printf("Volumen del cilindro: %.2f%n", cil.getVolume());
    }
}
