package Actividad_1.Ej_5_Y_11;

public class Pelicula extends Video{
    private String director;
    private double valoracion;

    public Pelicula(String titulo, int minutos, float precio, String director, double valoracion) {
        super(titulo, minutos, precio);
        this.director = director;
        this.valoracion = valoracion;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "director='" + director + '\'' +
                ", valoracion=" + valoracion +
                ", titulo='" + titulo + '\'' +
                ", minutos=" + minutos +
                ", precio=" + precio +
                '}';
    }
}
