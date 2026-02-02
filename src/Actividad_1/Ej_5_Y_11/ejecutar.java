package Actividad_1.Ej_5_Y_11;

public class ejecutar {
    /*public static void main(String[] args) {
        //Video v = new Video("Blade Runner", 117);
        Pelicula p = new Pelicula("Blade Runner", 117, "Ridley Scott", 8.9);
        //System.out.println(v.toString());
        System.out.println(p.toString());
    }*/

    /* EJ 11 */
    public static void main(String[] args) {
        Video ob1 = new Video("VHS", 90, 9);
        Pelicula ob2 = new Pelicula("ET", 120, 9,"Spielberg", 10);
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());
    }

    /*
    A) Pues que el ob1 tiene como título VHS y una duración de 90 min. Y ob2 que
    tiene como título ET y una duración de 120.

    B) Porque el métod0 toString() que se ejecuta es el de la clase Video, no el de Pelicula.

    C) @Override
    public String toString() {
        return "Pelicula{" +
                "valoracion=" + valoracion +
                ", titulo='" + titulo + '\'' +
                ", minutos=" + minutos +
                ", director='" + director + '\'' +
                '}';
    }
    */
}
