package assignment6;

public class OverloadedConstructorExample {

    int number1, number2;

    public OverloadedConstructorExample(int number1) {
        this(number1, 10);
    }

    public OverloadedConstructorExample(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public static void main(String[] args) {

        OverloadedConstructorExample overloadedConstructorExample = new OverloadedConstructorExample(20);

        System.out.println("Number 1: "+overloadedConstructorExample.number1);
        System.out.println("Number 2: "+overloadedConstructorExample.number2);
    }
}
