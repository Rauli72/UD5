package Extra.Interface;

public class TelefonoMovil implements Impuesto{

    private int miNumero;
    private boolean estaSonando;

    public TelefonoMovil(int miNumero) {
        this.miNumero = miNumero;
    }

    @Override
    public double calcular() {
        return TASA_DE_IMPUESTO * 12;
    }

    @Override
    public double calcularImpuestoAnual() {
        return 0;
    }

    @Override
    public void imprimirImpuesto() {
        System.out.println("El impuesto anual del teléfono es " + calcular());
    }

}

class MainTelefono {

    public static void main(String[] args) {
        //Variable creada de tipo móvil
        TelefonoMovil iphone5=new TelefonoMovil(555456789);
        iphone5.imprimirImpuesto();

        //Variable de tipo Impuesto que contiene objeto Movil. Usa el polimorfismo
        Impuesto impuestoMovil = new TelefonoMovil(123456789);
        impuestoMovil.imprimirImpuesto();
    }
}