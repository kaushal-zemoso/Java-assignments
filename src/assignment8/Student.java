package assignment8;

import java.util.ArrayList;

public class Student {

    // The below ArrayList initialization is to store the Student Details.
    ArrayList<String> studentIds = new ArrayList<>();
    ArrayList<String> studentNames = new ArrayList<>();
    ArrayList<String> studentAddresses = new ArrayList<>();

    public void studentDetails() {

        // Storing Student details.
        studentIds.add("34");
        studentIds.add("50");
        studentIds.add("44");

        studentNames.add("Josh");
        studentNames.add("Max");
        studentNames.add("Nick");

        studentAddresses.add("USA");
        studentAddresses.add("UK");
        studentAddresses.add("Canada");
    }

    public void searchStudent(String id, String name, String address) throws StudentIdNotFoundException, StudentNameNotFoundException, StudentAddressNotFoundException {

        if (studentIds.contains(id)) {
            System.out.println("Student Id found: "+id);
        } else {
            throw new StudentIdNotFoundException("Student Id not found: "+id);
        }

        if (studentNames.contains(name)) {
            System.out.println("Student Name found: "+name);
        } else {
            throw new StudentNameNotFoundException("Student Name not found: "+name);
        }

        if (studentAddresses.contains(address)) {
            System.out.println("Student Address found: "+address);
        } else {
            throw new StudentAddressNotFoundException("Student Address not found: "+address);
        }
    }

    public static void main(String[] args) {

        Student student = new Student();

        try {
            student.studentDetails();
            student.searchStudent("34", "Kaushal", "USA");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally method executed");
        }
    }
}
