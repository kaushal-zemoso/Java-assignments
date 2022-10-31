package assignment12;

import java.util.ArrayList;

public class Question5 {

    public void question5(ArrayList<Student> students) {

        System.out.println("Avg of Male Students age: ");
        students.stream().filter(s -> s.getGender().equalsIgnoreCase("male"))
                .mapToInt(s -> s.getAge())
                .average().orElse(0);

        System.out.println("Avg of Female Students age: ");
        students.stream().filter(i -> i.getGender().equalsIgnoreCase("female"))
                .mapToInt(i -> i.getAge())
                .average().orElse(0);
    }
}
