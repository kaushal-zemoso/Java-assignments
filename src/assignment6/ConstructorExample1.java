package assignment6;

public class ConstructorExample1 {

    ConstructorExample1(String name){
        System.out.println(name);
    }

    void printArrayOfReferences(String reference){
        System.out.println(reference);
    }
    
    public static void main(String args[]){

        //I am creating objects to attach to the array references.
        ConstructorExample1 object1=new ConstructorExample1("First call to Constructor");
        ConstructorExample1 object2=new ConstructorExample1("Second call to Constructor");
        ConstructorExample1 object3=new ConstructorExample1("Third call to Constructor");
        ConstructorExample1 object4=new ConstructorExample1("Fourth call to Constructor");

        //creating an array for references
        ConstructorExample1[] objectConstructorArray=new ConstructorExample1[4];

        //attaching objects to the array references
        objectConstructorArray[0]=object1;
        objectConstructorArray[1]=object2;
        objectConstructorArray[2]=object3;
        objectConstructorArray[3]=object4;

        //calling class's method using array references.
        for(int i = 0;i < objectConstructorArray.length;i++){
            objectConstructorArray[i].printArrayOfReferences((i + 1)+ " call by Object Array");
        }

    }
}
