package task1v2;


public class NewThread implements Runnable {
    private Matrix m;
    private int rowId;
    private int columnId;

    NewThread(Matrix m, int rowId, int columnId) {
        this.m = m;
        this.rowId = rowId;
        this.columnId = columnId;
    }

    public void run() {
        System.out.println("New thread: " + rowId + " started calculation");
            m.addCell(rowId,columnId);
        System.out.println("New thread: " + rowId + " finished calculation");
    }
}
