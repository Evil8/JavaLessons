package task1;

/**
 * Created by Anton_Khmyzov on 3/23/2017.
 */
public class NewThread implements Runnable {
    private Matrix m;
    private int rowId;

    NewThread(Matrix m, int rowId) {
        this.m = m;
        this.rowId = rowId;

    }

    public void run() {
        System.out.println("New thread: " + rowId + " started calculation");
            Double[] row;
            row = m.getRow(rowId);
            m.add(rowId, row);
        System.out.println("New thread: " + rowId + " finished calculation");
    }
}
