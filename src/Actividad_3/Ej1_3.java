package Actividad_3;

public class Ej1_3 {
    class Tarjeta {
        protected String destinatario;
        public void saludar() {}
    }
    class Vacaciones extends Tarjeta {
        public Vacaciones( String r ) {
            destinatario = r;
        }
        public void saludar() {
            System.out.println("Querido " + destinatario + ",");
            System.out.println("Saludos veraniegos!\n");
        }
    }
    class Aniversario extends Tarjeta {
        private int edad;
        public Aniversario ( String r, int edad) {
            destinatario = r;
            this.edad = edad;
        }
        public void saludar() {
            System.out.println("Querido " + destinatario + ",");
            System.out.println("Feliz " + this.edad + " Aniversario\n");
        }
    }
    class SanValentin extends Tarjeta {
        private int besos;
        public SanValentin ( String r, int k ) {
            destinatario = r;
            besos = k;
        }
        public void saludar() {
            System.out.println("Querido " + destinatario + ",");
            System.out.println("Con amor y besos,");
            for ( int j=0; j < besos; j++ )
                System.out.print("X");
            System.out.println("\n");
        }
    }
}

/*
    A) 1º Imprimiría: "Querido Amy,"
                      "Saludos veraniegos!

       2º Imprimiría: "Querido Bob,"
                      "Con amor y besos, XXX"

       3º Imprimiría: "Querido Cindy,"
                      "Feliz 17 Aniversario"

    B) Están correctos c (Tarjeta) debido a que es una referencia del padre puede apuntar a un objeto hijo.
       Y v (SanValentin) debido a que es el mismo tipo de referencia y mismo tipo de objeto.
*/