package Actividad_1.Ej_5_Y_11;

public class VideoMusical extends Video{
    private String artista;
    private String categoria;

    public VideoMusical(String titulo, int minutos, float precio, String artista, String categoria) {
        super(titulo, minutos, precio);
        this.artista = artista;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "VideoMusical{" +
                "artista='" + artista + '\'' +
                ", categoria='" + categoria + '\'' +
                ", minutos=" + minutos +
                ", titulo='" + titulo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
