package assignment12;

import java.util.ArrayList;
import java.util.Optional;

public class Question9 {

    public void question8(ArrayList<Student> students) {

        Optional<Student> obj = students.stream()
                .filter(s -> s.getDept().equalsIgnoreCase("electronic"))
                .filter(s -> s.getGender().equalsIgnoreCase("male"))
                .min(((o1, o2) -> o1.getAge()));
        System.out.println(obj.isPresent() ? obj.get() : "Not found");
    }
}
