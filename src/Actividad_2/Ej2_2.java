package Actividad_2;

public class Ej2_2 {
    public static void main(String[] args) {
        Procesador procesador = new Procesador("Intel I7 13700H");
        Memoria memoriaDD = new Memoria(1024, "SSD");

        Ordenador ordenador = new Ordenador(procesador, memoriaDD);

        ordenador.encender();
    }
}

class Procesador {
    private String modelo;

    public Procesador(String modelo) {
        this.modelo = modelo;
    }

    private String getModelo() {
        return modelo;
    }

    public void ejecutar() {
        System.out.println("El procesador " + getModelo() + " está ejecutando instrucciones...");
    }
}

class Memoria {
    private int capacidad;
    private String tipo;

    public Memoria(int capacidad, String tipo) {
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    private String getTipo() {
        return tipo;
    }

    private int getCapacidad() {
        return capacidad;
    }

    public void cargar() {
        System.out.println("Memoria "+ getTipo() + " tiene una capacidad de " + getCapacidad() + " GB");
    }
}

class Ordenador {
    private Procesador procesador;
    private Memoria memoria;

    public Ordenador(Procesador procesador, Memoria memoria) {
        this.procesador = procesador;
        this.memoria = memoria;
    }

    private Memoria getMemoria() {
        return memoria;
    }

    private Procesador getProcesador() {
        return procesador;
    }

    public void encender(){
        System.out.println("Procesador encendiéndose...");
        getProcesador().ejecutar();
        getMemoria().cargar();
    }
}