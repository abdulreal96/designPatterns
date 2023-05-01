package adapter.example2;

public class StudentAdapter implements Student{

    private SchoolStudent schoolStudent;

    public StudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String getFirstName() {
        return schoolStudent.getFirstName();
    }

    @Override
    public String getSurname() {
        return schoolStudent.getSurname();
    }
}
