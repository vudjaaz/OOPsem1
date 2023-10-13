package seminar3;

import java.util.Iterator;
import java.util.List;

public class Flow implements Iterable<StudentGroup> {

    private List<StudentGroup> studentGroupList;

    public Flow(List<StudentGroup> studentsGroups) {
        this.studentGroupList = studentsGroups;
    }
    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public String toString() {
        return "Flow{" +
                "studentGroupList=" + studentGroupList +
                '}';
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this.studentGroupList);
    }

}