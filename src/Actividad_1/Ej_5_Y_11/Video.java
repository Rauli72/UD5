package Actividad_1.Ej_5_Y_11;

public class Video {

    public String titulo;
    public int minutos;

    public float precio;

    public Video(String titulo, int minutos, float precio) {
        this.titulo = titulo;
        this.minutos = minutos;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", minutos=" + minutos +
                ", precio=" + precio +
                '}';
    }
}
