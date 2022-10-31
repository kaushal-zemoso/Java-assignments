package assignment12;

import java.util.ArrayList;

public class Question3 {

    public void question3(ArrayList<Student> students) {

        System.out.println("Male Students in Computer Science Department");
        students.stream().filter(s -> s.getGender().equalsIgnoreCase("Male"))
                .filter(s -> s.getDept().equalsIgnoreCase("computer science"))
                //.map(m -> m.getName())
                .forEach(System.out::println);
    }
}
