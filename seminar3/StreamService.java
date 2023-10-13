package seminar3;

import java.util.*;

public class StreamService {
    private List<Flow> FlowList;

    public StreamService(List<Flow> FlowList) {
        this.FlowList = new ArrayList<>(FlowList);
    }



    public List<Flow> getFlowList() {
        return FlowList;
    }

    public List<Flow> getSortedBySizeFlow(){
        List<Flow> FlowList = new ArrayList<Flow>(getFlowList());
        FlowList.sort(new StreamComparator());
        return FlowList;
    }
}