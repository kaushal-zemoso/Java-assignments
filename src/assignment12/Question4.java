package assignment12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question4 {

    public void question4(ArrayList<Student> students) {

        Map<String, List<Student>> genderGroup = students.stream().collect(Collectors.groupingBy(s -> s.getGender()));

        for(String s : genderGroup.keySet()){
            if(s.equalsIgnoreCase("male"))
                System.out.println("Male Students: " + genderGroup.get(s).stream().count());
            else
                System.out.println("Female Students: " + genderGroup.get(s).stream().count());
        }
    }
}
