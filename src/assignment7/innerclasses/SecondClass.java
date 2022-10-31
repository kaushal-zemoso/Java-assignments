package assignment7.innerclasses;

public class SecondClass {

    public SecondClass() {
        System.out.println("In Second Class");
    }

    public class SecondInnerClass extends FirstClass.FirstInnerClass {

        public SecondInnerClass() {
            new FirstClass().super("Kaushal Sunkanapalli");
            System.out.println("In Second Inner Class");
        }
    }
}
