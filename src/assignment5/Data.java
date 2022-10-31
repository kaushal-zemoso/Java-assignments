package assignment5;

public class Data {

    int number1;  // Member variable 1
    char character1;  // Member variable 2

    public void printMemberVariablesInData() {
        System.out.println("Member Variable 1: "+number1);
        System.out.println("Member Variable 2: "+character1);
    }

    /*
     As we can see in the above method we are trying to print the member variables and the member variable will be
     initialized because member variables which are declared at class level. In the below, we can see that the method
     is trying to print local variables which are not initialized at it results in compile time error because local
     variables needs to be initialized at method level.

        public void printLocalVariables() {

            int number2;  // Local variable 1
            char character2;  // Local variable 2

            System.out.println("Local Variable 1: "+number2);
            System.out.println("Local Variable 2: "+character2);
        }
    */
}
