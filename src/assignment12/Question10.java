package assignment12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question10 {

    public void question10(ArrayList<Student> students) {

        Map<String , List<Student>> compSci = students.stream()
                .filter(s -> s.getDept().equalsIgnoreCase("computer science"))
                .collect(Collectors.groupingBy(s -> s.getGender()));

        for(String s : compSci.keySet()){
            if(s.equalsIgnoreCase("male"))
                System.out.println("Male count: " + compSci.get(s).stream().count());
            else
                System.out.println("Female count: " + compSci.get(s).stream().count());
        }
    }
}
