package by.task4;

import java.util.List;

/**
 * Created by Anton_Khmyzov on 2/18/2017.
 */
public class Abiturient {
    private int abiturientid;
    private List<Integer> abiturientMarks;

    public int getAbiturientid() {
        return abiturientid;
    }

    public void setAbiturientid(int abiturientid) {
        this.abiturientid = abiturientid;
    }

    public List<Integer> getAbiturientMarks() {
        return abiturientMarks;
    }

    public void setAbiturientMarks(List<Integer> abiturientMarks) {
        this.abiturientMarks = abiturientMarks;
    }

    public Abiturient(int abiturientid, List<Integer> abiturientMarks) {
        this.abiturientid = abiturientid;
        this.abiturientMarks = abiturientMarks;
    }
}
