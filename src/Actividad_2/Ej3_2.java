package Actividad_2;

public class Ej3_2 {
    public static void main(String[] args) {

        Impresora impresora = new Impresora(true, 5, 56);

        System.out.println("Tóner actual: " + impresora.anadirToner(30));
        System.out.println("Páginas impresas: " + impresora.imprimirPaginas(7));
        System.out.println("Total páginas impresas: " + impresora.getPaginasImpresas());
    }
}

class Impresora {
    private int nivelToner;
    private int paginasImpresas;
    private boolean dobleCara;

    public Impresora(boolean dobleCara, int paginasImpresas, int nivelToner) {
        this.nivelToner = nivelToner;
        this.dobleCara = dobleCara;
        this.paginasImpresas = paginasImpresas;
    }

    // GETTERS
    public boolean isDobleCara() {
        return dobleCara;
    }

    public int getPaginasImpresas() {
        return paginasImpresas;
    }

    public int getNivelToner() {
        return nivelToner;
    }

    // SETTER
    public void setNivelToner(int nivelToner) {
        this.nivelToner = nivelToner;
    }

    // MÉTODOS
    public int anadirToner(int nivelToner){
        if (nivelToner <= 0 || nivelToner > 100) {
            return this.nivelToner = -1;
        } else {
            int nuevoNivelToner = this.nivelToner += nivelToner;

            if (nuevoNivelToner > 100) {
                return this.nivelToner = -1;

            }  else {
                setNivelToner(nuevoNivelToner);
                return nuevoNivelToner;
            }
        }
    }

    public int imprimirPaginas(int paginas) {
        int paginasAImprimir = paginas;

        if (isDobleCara()) {
            paginasAImprimir = (paginas / 2) + (paginas % 2);
        }

        this.paginasImpresas += paginasAImprimir;
        return paginasAImprimir;
    }
}