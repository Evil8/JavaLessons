package by.task3;

import java.util.List;

public class Group {
    private List<Student> studentList;

    public Group(List<Student> students){
        this.studentList = students;
    }

    public void setStudentList(List<Student> students) {
        this.studentList = students;
    }
    public List<Student> getStudentList(){
        return this.studentList;
    }

    public double calculateGroupMean(){
        int c = 0;
        double sum = 0;
        for(Student student : getStudentList())
        {
            c++;
            sum = sum + student.studentAverage();
        }
        double groupMean = sum/c;
        return groupMean;
    }

    public int calculateNumOfExecellent(){
        int c = 0;
        for(Student student : getStudentList())
        {
            if(student.isExcellent()){
                c++;
            }
        }
        return c;
    }

    public int calculateNumOfBads(){
        int c = 0;
        for(Student student : getStudentList())
        {
            if(student.hasBadMark()){
                c++;
            }
        }
        return c;
    }
}

