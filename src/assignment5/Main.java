package assignment5;

public class Main {

    public static void main(String[] args) {

        Data dataObject = new Data();
        dataObject.printMemberVariablesInData();

        Singleton singletonObject = Singleton.memberVariablesInitialization("Hello!");
        singletonObject.printMemberVariables();
    }
}
