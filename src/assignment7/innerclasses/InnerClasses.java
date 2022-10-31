package assignment7.innerclasses;

public class InnerClasses {

    public static void main(String[] args) {

        SecondClass secondClass = new SecondClass();
        SecondClass.SecondInnerClass secondInnerClass= secondClass.new SecondInnerClass();
    }
}
