package by.task1;

import java.sql.Time;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

/**
 * Created by Anton_Khmyzov on 2/17/2017.
 */
public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String midName;
    private LocalDate dateOfBirth;
    private String address;
    private String phone;
    private String faculty;
    private String course;

    public void setId(int _id) {
        this.id = _id;
    }

    public void setLastName(String _lastName) {
        this.lastName = _lastName;
    }

    public void setFirstName(String _firstName) {
        this.firstName = _firstName;
    }

    public void setMidName(String _midName) {
        this.midName = _midName;
    }

    public void setDateOfBirth(LocalDate _dateOfBirth) {
        this.dateOfBirth = _dateOfBirth;
    }

    public void setAddress(String _address) {
        this.address = _address;
    }

    public void setPhone(String _phone) {
        this.phone = _phone;
    }

    public void setFaculty(String _faculty) {
        this.faculty = _faculty;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMidName() {
        return midName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student(int id, String lastName, String firstName, String midName,
                   LocalDate dateOfBirth, String address, String phone, String faculty, String course)
    {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.midName = midName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
    }

    public void show() {
        System.out.println("ID: " + getId());
        System.out.println("FirstName: " + getFirstName());
        System.out.println("MiddleName: " + getMidName());
        System.out.println("LastName: " + getLastName());
        System.out.println("BirthDate: " + getDateOfBirth());
        System.out.println("Address: " + getAddress());
        System.out.println("phone: " + getPhone());
        System.out.println("faculty: " + getFaculty());
        System.out.println("course: " + getCourse());
    }

    public void showDaysToBirthday(){

        LocalDate now = LocalDate.now();
        LocalDate dateOfBirth = getDateOfBirth();
        LocalDate nextBirthday = dateOfBirth.withYear(now.getYear());

        if (nextBirthday.isBefore(now) || nextBirthday.isEqual(now)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        Period p = Period.between(now, nextBirthday);
        System.out.println(p.getMonths() + " months, " +
                p.getDays() + " days until next birthday" );

    }

}
