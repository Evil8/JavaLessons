package by.task3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<StudentMark> marks = new ArrayList<>();
    private int studentId;

    public Student(List<StudentMark> studentMarks,int studentId){
        this.marks = studentMarks;
        this.studentId = studentId;
    }
    public void setMarks(List<StudentMark> studentMarks){
        this.marks = studentMarks;

    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public List<StudentMark> getMarks() {
        return marks;
    }
    public boolean hasBadMark(){
        boolean hasBadMark = false;
        for(StudentMark mark : getMarks()){
            if(mark.getMark() < 3)
            {
                hasBadMark = true;
                break;
            }
        }
        return hasBadMark;
    }

    public boolean isExcellent(){
        boolean isExcellent = true;
        for(StudentMark mark : getMarks()){
            if (mark.getMark() < 5){
                isExcellent = false;
                break;
            }
        }
        return  isExcellent;
    }
    public double studentAverage(){
        int sum = 0;
        int c = 0;

        for(StudentMark mark : getMarks()){
            sum = sum + mark.getMark();
            c++;
        }
        return (sum/c);
    }
}