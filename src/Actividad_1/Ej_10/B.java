package Actividad_1.Ej_10;

public class B extends A {
    public B(int uno, int dos) {
        super(uno, dos);
    }

    @Override
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
}
