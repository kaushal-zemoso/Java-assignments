package assignment12;

import java.util.ArrayList;

public class Question1 {

    public void question1(ArrayList<Student> students) {

        System.out.println("All Departments: ");
        students.stream().map(i -> i.getDept()).distinct().forEach(System.out::println);
    }
}
