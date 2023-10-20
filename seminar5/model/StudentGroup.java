package seminar5.model;
import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> studentList;

    public StudentGroup(List<Student> studentList, Teacher teacher) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }

    public List<Student> getStudentList() {
        return studentList;
    }


}