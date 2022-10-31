package assignment12;

import java.util.ArrayList;

public class Question6 {

    public void question6(ArrayList<Student> students) {

        System.out.println("Highest percentage student details: ");

        double highestPercentage = students.stream().mapToDouble(i -> i.getPerTillDate()).max().orElse(0);

        students.stream().filter(s -> s.getPerTillDate() == highestPercentage).forEach(System.out::println);
    }
}
