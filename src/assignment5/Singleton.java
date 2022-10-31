package assignment5;

public class Singleton {

    String string1;  // Non-static member variable.

/*
    The following method gives a compile-time error
    because a non-static variable memberVariable3 cannot be referenced from a static context(initializeMembers()).
    The reason is static fields and methods are specific to the class and not to a specific instance, and they are
    shared to all the instances of the class. To solve the error,you need to instantiate an object to the class in a
    static method and should access class member variables with that object.
*/

    public static Singleton memberVariablesInitialization(String stringParameter) {

        Singleton singleton = new Singleton();
        singleton.string1 = stringParameter;

        return singleton;
    }

    public void printMemberVariables() {
        System.out.println("Member variable: "+string1);
    }
}
