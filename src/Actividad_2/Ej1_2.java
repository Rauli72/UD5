package Actividad_2;

public class Ej1_2 {
    public static void main(String[] args) {
        // Crear los objetos
        Pared pared1 = new Pared("Norte");
        Pared pared2 = new Pared("Sur");
        Pared pared3 = new Pared("Este");
        Pared pared4 = new Pared("Oeste");

        Techo techo = new Techo(250, 123);
        Cama cama = new Cama("Moderna", 2, 50, 1, 1);
        Lampara lampara = new Lampara("Candelabro", false, 9);

        Habitacion habitacion = new Habitacion("Dormitorio",
                pared1, pared2, pared3, pared4,
                techo, cama, lampara);

        // Probar métodos
        habitacion.hacerLaCama();
        habitacion.getLampara().encender();
    }
}

/* LÁMPARA */
class Lampara {
    private String estilo;
    private boolean bateria;
    private int calificacion;

    public Lampara(String estilo, boolean bateria, int calificacion) {
        this.estilo = estilo;
        this.bateria = bateria;
        this.calificacion = calificacion;
    }

    public void encender() {
        System.out.println("La lámpara se ha encendido...");
    }

    public String getEstilo() {
        return estilo;
    }

    public boolean hayBateria() {
        return bateria;
    }

    public int getCalificacion() {
        return calificacion;
    }
}

/* CAMA */
class Cama {

    private String estilo;
    private int almohadas;
    private int altura;
    private int sabanas;
    private int colcha;

    public Cama(String estilo, int almohadas, int altura, int sabanas, int colcha) {
        this.estilo = estilo;
        this.almohadas = almohadas;
        this.altura = altura;
        this.sabanas = sabanas;
        this.colcha = colcha;
    }

    public void hacer() {
        System.out.println("La cama se ha hecho");
    }

    public String getEstilo() {
        return estilo;
    }

    public int getAlmohadas() {
        return almohadas;
    }

    public int getAltura() {
        return altura;
    }

    public int getSabanas() {
        return sabanas;
    }

    public int getColcha() {
        return colcha;
    }
}

/* TECHO */
class Techo {
    private int altura;
    private int color;

    public Techo(int altura, int color) {
        this.altura = altura;
        this.color = color;
    }

    public int getAltura() {
        return altura;
    }

    public int getColor() {
        return color;
    }
}

/* PARED */
class Pared {

    private String direccion;

    public Pared(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
}

/* HABITACIÓN */
class Habitacion {
    private String nombre;
    private Pared pared1;
    private Pared pared2;
    private Pared pared3;
    private Pared pared4;
    private Techo techo;
    private Cama cama;
    private Lampara lampara;

    public Habitacion(String nombre, Pared pared1, Pared pared2, Pared pared3,
                      Pared pared4, Techo techo, Cama cama, Lampara lampara) {
        this.nombre = nombre;
        this.pared1 = pared1;
        this.pared2 = pared2;
        this.pared3 = pared3;
        this.pared4 = pared4;
        this.techo = techo;
        this.cama = cama;
        this.lampara = lampara;
    }

    public Lampara getLampara() {
        return lampara;
    }

    public void hacerLaCama() {
        System.out.println("Se está haciendo la cama");
        cama.hacer();
    }
}