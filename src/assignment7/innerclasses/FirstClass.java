package assignment7.innerclasses;

public class FirstClass {

    public FirstClass() {
        System.out.println("In First Class");
    }

    public class FirstInnerClass {

        public FirstInnerClass(String studentName) {
            System.out.println("In First Inner Class Student Name: "+studentName);
        }
    }
}
