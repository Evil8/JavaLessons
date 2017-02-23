package by.task3;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Main {

    public static void main(String[] args) throws ParseException {
        List<Student> studentList = new ArrayList<Student>();


        Random rndId = new Random();
        Random rndMark = new Random();
        int k = 5;

        for (int i = 0; i < k; i++) {
            List<StudentMark> studentMarks = new ArrayList<StudentMark>();
            for (int j = 0; j < Subject.getSize(); j++) {

                int mark = rndMark.nextInt(9);
                if (mark == 0 || mark == 1){
                    mark = 2;
                }

                StudentMark studentMark =
                        new StudentMark(mark, Subject.randomSubject());
                studentMarks.add(studentMark);

            }
            studentList.add(i,new Student(studentMarks,rndId.nextInt(100)));
        }

        Group studentGroup = new Group(studentList);

        for (Student student : studentGroup.getStudentList()) {
            System.out.println("Student Id: " + student.getStudentId() + " Avg. mark: " + student.studentAverage());
        }

        System.out.println("Avg. group mark: " + studentGroup.calculateGroupMean());

        System.out.println("Count of excellent students: " + studentGroup.calculateNumOfExecellent());

        System.out.println("Count of bad students (avg. mark < 3): " + studentGroup.calculateNumOfBads());
    }
}
