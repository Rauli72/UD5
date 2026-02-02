package Actividad_3;

public class Ej3_3 {
    public static void main(String[] args) {

        Coche ford = new Ford("Ranger", 6, true, 1200);
        Coche audi = new Audi("A6", 4, true, "Premium");
        Coche bmw = new BMW("M3", 6, true, true);
        Coche citroen = new Coche("C4", 4);

        System.out.println("===== FORD =====");
        ford.arrancar();
        ford.acelerar();
        ford.frenar();
        System.out.println();

        System.out.println("===== AUDI =====");
        audi.arrancar();
        audi.acelerar();
        audi.frenar();
        System.out.println();

        System.out.println("===== BMW =====");
        bmw.arrancar();
        bmw.acelerar();
        bmw.frenar();
        System.out.println();

        System.out.println("===== CITROEN =====");
        citroen.arrancar();
        citroen.acelerar();
        citroen.frenar();
        System.out.println();
    }
}


class Coche {
    private String modelo;
    private Boolean motor;
    private int ruedas;
    private int cilindros;

    public Coche(String modelo, int cilindros) {
        this.modelo = modelo;
        this.motor = true;
        this.ruedas = 4;
        this.cilindros = cilindros;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void arrancar() {
        System.out.println("Arrancando el coche "+ getModelo());
    }

    public void acelerar() {
        System.out.println("Acelerando el coche "+ getModelo() +
                " con motor de "+ getCilindros() + " cilindros");
    }

    public void frenar() {
        System.out.println("Frenando el coche "+ getModelo());
    }
}

class Ford extends Coche {
    private boolean traccion4x4;
    private int capacidadCargaKg;

    public Ford(String modelo, int cilindros, boolean traccion4x4, int capacidadCargaKg) {
        super(modelo, cilindros);
        this.traccion4x4 = traccion4x4;
        this.capacidadCargaKg = capacidadCargaKg;
    }
    public int getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public boolean isTraccion4x4() {
        return traccion4x4;
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando el coche "+ getModelo() + " con una capacidad de "
                + getCapacidadCargaKg() + "kg");
    }

    public void acelerar() {
        if (isTraccion4x4()) {
            System.out.println("Acelerando el coche "+ getModelo() +
                    " con motor de "+ getCilindros() + " cilindros y una traccion 4x4");
        } else  {
            System.out.println("Acelerando el coche "+ getModelo() +
                    " con motor de "+ getCilindros() + " cilindros sin traccion 4x4");
        }
    }

    public void frenar() {
        if (isTraccion4x4()) {
            System.out.println("Frenando el coche "
                    + getModelo() + " con traccion 4x4");
        } else {
            System.out.println("Frenando el coche "
                    + getModelo() + "sin traccion 4x4");
        }
    }
}


class Audi extends Coche {
    private boolean asistentesConduccion;
    private String nivelAcabado;

    public Audi(String modelo, int cilindros, boolean asistentesConduccion, String nivelAcabado) {
        super(modelo, cilindros);
        this.asistentesConduccion = asistentesConduccion;
        this.nivelAcabado = nivelAcabado;
    }

    public boolean hasAsistentesConduccion() {
        return asistentesConduccion;
    }

    public String getNivelAcabado() {
        return nivelAcabado;
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando el Audi " + getModelo() +
                " con acabado " + nivelAcabado);
    }

    public void acelerar() {
        if (asistentesConduccion) {
            System.out.println("Acelerando el Audi " + getModelo() +
                    " con motor de " + getCilindros() +
                    " cilindros y asistentes de conducción activados");
        } else {
            System.out.println("Acelerando el Audi " + getModelo() +
                    " con motor de " + getCilindros() +
                    " cilindros sin asistentes de conducción");
        }
    }

    public void frenar() {
        if (asistentesConduccion) {
            System.out.println("Frenando el Audi " + getModelo() +
                    " con asistencia electrónica");
        } else {
            System.out.println("Frenando el Audi " + getModelo() +
                    " de forma manual");
        }
    }
}


class BMW extends Coche {
    private boolean modoDeportivo;
    private boolean suspensionAdaptativa;

    public BMW(String modelo, int cilindros, boolean modoDeportivo, boolean suspensionAdaptativa) {
        super(modelo, cilindros);
        this.modoDeportivo = modoDeportivo;
        this.suspensionAdaptativa = suspensionAdaptativa;
    }

    public boolean isModoDeportivo() {
        return modoDeportivo;
    }

    public boolean hasSuspensionAdaptativa() {
        return suspensionAdaptativa;
    }

    @Override
    public void arrancar() {
        if (modoDeportivo) {
            System.out.println("Arrancando el BMW " + getModelo() +
                    " en modo deportivo");
        } else {
            System.out.println("Arrancando el BMW " + getModelo() +
                    " en modo normal");
        }
    }

    public void acelerar() {
        if (modoDeportivo) {
            System.out.println("Acelerando el BMW " + getModelo() +
                    " con motor de " + getCilindros() +
                    " cilindros a máxima potencia");
        } else {
            System.out.println("Acelerando el BMW " + getModelo() +
                    " con motor de " + getCilindros() +
                    " cilindros de forma eficiente");
        }
    }

    public void frenar() {
        if (suspensionAdaptativa) {
            System.out.println("Frenando el BMW " + getModelo() +
                    " con suspensión adaptativa");
        } else {
            System.out.println("Frenando el BMW " + getModelo() +
                    " con suspensión estándar");
        }
    }
}
