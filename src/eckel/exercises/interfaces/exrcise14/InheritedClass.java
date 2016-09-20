package eckel.exercises.interfaces.exrcise14;

/**
 * Created by Andriana on 19.09.2016.
 */
public class InheritedClass extends BaseClass{
    public static void aVoid(Interface1 interface1){

    }
    public static void bVoid(Interface2 interface2){

    }
    public static void cVoid(Interface3 interface3){

    }
    public static void dVoid(InterfaceCommon interfaceCommon){

    }

    public static void main(String[] args) {
        InheritedClass inheritedClass = new InheritedClass();
        aVoid(inheritedClass);
        bVoid(inheritedClass);
        cVoid(inheritedClass);
        dVoid(inheritedClass);
    }
}
