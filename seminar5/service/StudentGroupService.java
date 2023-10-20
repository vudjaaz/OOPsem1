package seminar5.service;

import seminar5.model.Student;
import seminar5.model.StudentGroup;
import seminar5.model.Teacher;

import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;
    public void createStudentGroup(List<Student> studentList, Teacher teacher){
        this.studentGroup = new StudentGroup(studentList, teacher);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

}