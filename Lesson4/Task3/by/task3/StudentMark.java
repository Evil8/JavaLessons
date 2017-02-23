package by.task3;

public class StudentMark{
    private int mark;
    private Subject subject;

    public void setMark(int mark){
        this.mark = mark;
    }
    public int getMark(){
        return this.mark;
    }
    public void setSubject(Subject subject){
        this.subject = subject;
    }
    public Subject getSubject() {
        return this.subject;
    }
    public StudentMark(int mark,Subject subject){
        this.mark = mark;
        this.subject = subject;
    }
}
