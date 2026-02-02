package Actividad_3;

public class Ej2_3 {
    /*
    rod = new Rat();        -> OK, debido a que Rat es hija de Rod
    mou = new Rat();        -> NOT, debido a que Rat y Mou no tienen nada que ver entre sí
    rat = new Rodent();     -> NOT, debido a que Rat es la hija de Rod, siendo este su padre
    rat = new FieldMouse(); -> NOT, debido a que Rat y FieldMouse no tienen nada que ver entre sí
    rod = new FieldMouse(); -> OK, debido a que Rod es el padre de todos, y por lo tanto, padre de FieldMouse
    mou = new Rodent();     -> NOT, debido a que Mou es la hija de Rod, siendo este su padre
    rat = new LabRat();     -> OK, debido a que LabRat es hija de Rat
    rat = new Mouse();      -> NOT, debido a que Rat y Mou no tienen nada que ver entre sí
    */
}
