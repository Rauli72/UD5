package Actividad_5;

public class Ej1_5 {
    public static void main(String[] args) {
        Subclase sb = new Subclase();

        sb.abstract_method();
        sb.metodo_normal();
    }
}

abstract class Clase_abstracta {
    public Clase_abstracta() {
        System.out.println("Este es un constructor de la clase abstracta");
    }

    public abstract void abstract_method();

    public void metodo_normal() {
        System.out.println("Este es un método normal de clase abstracta");
    }
}

class Subclase extends Clase_abstracta {

    @Override
    public void abstract_method() {
        System.out.println("Este es un método abstracto implementado en una clase no abstracta");
    }
}

/* Se puede observar como imprime tanto ambas frases de los métodos normal y abstracto. */