package seminar4.data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User{
    private Long teacherId;

    public Teacher(String firstName, String secondName, String lastName, LocalDate dateOfBirth, Long teacherId) {
        super(firstName, secondName, lastName, dateOfBirth);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
    public static class TeacherComparator implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}