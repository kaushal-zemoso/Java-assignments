package assignment12;

import java.util.ArrayList;

public class Question2 {

    public void question2(ArrayList<Student> students) {

        System.out.println("Students enrolled after 2018");
        students.stream().filter(i -> i.getYearOfEnroll() > 2018).map(m -> m.getName()).forEach(System.out::println);
    }
}
