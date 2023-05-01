package adapter.example2;

public class CollegeStudent implements Student{

    private String firstName;
    private String surName;

    public CollegeStudent(String firstName, String surName){
        this.firstName = firstName;
        this.surName = surName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getSurname() {
        return surName;
    }
}
