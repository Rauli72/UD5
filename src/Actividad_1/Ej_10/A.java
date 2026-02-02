package Actividad_1.Ej_10;

public class A {
    protected int uno;
    protected int dos;
    protected String tres;


    public A(int uno, int dos) {
        this.uno = uno;
        this.dos = dos;
    }

    public String toString1() {
        return "A{" +
                "uno=" + uno +
                '}';
    }

    public String toString2() {
        return "A{" +
                "dos=" + dos +
                '}';
    }

    public String toString3() {
        return "A{" +
                "tres='" + tres + '\'' +
                '}';
    }
}