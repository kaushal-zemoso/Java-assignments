package assignment12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question7 {

    public void question7(ArrayList<Student> students) {

        Map<String, List<Student>> deptGroup = students.stream().collect(Collectors.groupingBy(s -> s.getDept()));

        for(String s : deptGroup.keySet()) {
            System.out.println(s + " : " + deptGroup.get(s).stream().count());
        }
    }
}
