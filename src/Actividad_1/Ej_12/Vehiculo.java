package Actividad_1.Ej_12;

public class Vehiculo {
    protected String nombre;
    protected int velocidad;

    public Vehiculo(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public void mover() {
        System.out.println(nombre + " se está moviendo a " + velocidad + " km/h");
    }

    public void acelerar(int incremento) {
        velocidad += incremento;
    }

    public void frenar(int decremento) {
        velocidad -= decremento;
        if (velocidad < 0) {
            velocidad = 0;
        }
    }
}
