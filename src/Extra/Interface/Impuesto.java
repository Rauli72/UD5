package Extra.Interface;

public interface Impuesto {

    //constantes
    double TASA_DE_IMPUESTO = 0.06;

    double calcular();

    //métodos abstractos
    double calcularImpuestoAnual();

    void imprimirImpuesto();

}
