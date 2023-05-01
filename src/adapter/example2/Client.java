package adapter.example2;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        CollegeStudent collegeStudent = new CollegeStudent("Isa", "Musty");

        SchoolStudent schoolStudent = new SchoolStudent("Sani", "Wale");

        list.add(collegeStudent);
        list.add(new StudentAdapter(schoolStudent));

        list.stream().forEach(u -> System.out.printf("%s %s%n", u.getFirstName(), u.getSurname()));
    }
}
