package seminar3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Flow> {
    @Override
    public int compare(Flow o1, Flow o2) {
        if(o1.getStudentGroupList().size() > o2.getStudentGroupList().size()){
            return -1;
        } else if (o1.getStudentGroupList().size() == o2.getStudentGroupList().size()) {
            return 0;
        } else {
            return 1;
        }
    }
}