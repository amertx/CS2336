
import java.util.*;

public class Q11_2 {

    public static void main(String[] args) {
        //local variables
        //instance creation of date objects
        MyDate date = new MyDate();
        MyDate date2 = new MyDate();
        MyDate date3 = new MyDate();
        MyDate date4 = new MyDate();
        MyDate date5 = new MyDate();

        //class object creations
        Person person = new Person("John Doe", "1234 Rainbow Lane", "123-456-7891", "johndoe@gmail.com");
        Student student = new Student("Sarah John", "1600 Washington Ave", "469-393-2322", "sarah@yahoo.com", 3);
        Employee employee = new Employee("Andrew Carter", "789 River Blvd", "512-832-2221","andrew@hotmail.com", "Palo Alto Office",  100000, date);
        Faculty faculty = new Faculty("Bob Ross", "812 San Jacinto Ln", "921-232-2334", "bob@gmail.com", "New York", 9000000, date4, 1, "10am-5pm");
        Staff staff = new Staff("Zach Tan", "900 jereme blvd", "214-323-2323", "zach@aol.com", "Chicago", 500000, date5, "Executive Director");
        //outputs
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

    }
}

class Person{
    String name;
    String address;
    String phoneNumber;
    String emailAddress;



    public Person(){
        this("", "", "","");
    }

    public Person(String newName, String newAddress, String newPhoneNumber, String newEmailAddress){
        name = newName;
        address = newAddress;
        phoneNumber = newPhoneNumber;
        emailAddress = newEmailAddress;
    }

    //getters and setters
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }

    public void setAddress(String newAddress){
        name = newAddress;
    }
    public String getAddress(){
        return address;
    }

    public void setPhoneNumber(String newPhoneNumber){
        name = newPhoneNumber;
    }
    public String getPhoneNumbere(){
        return phoneNumber;
    }

    public void setEmailAddresse(String newEmailAddress){
        name = newEmailAddress;
    }
    public String getEmailAddress(){
        return emailAddress;
    }

    @Override
    public String toString(){
        return this.name + " is a " + this.getClass().getName() + " (type). ";
    }
}


class Student extends Person{
    public int status;
    public final int freshman = 1;
    public final int sophomore = 2;
    public final int junior = 3;
    public final int senior = 4;

    Student(){

    }

    Student(String newName, String newAddress, String newPhoneNumber, String newEmailAddress, int newStatus){
        super(newName, newAddress, newPhoneNumber, newEmailAddress);
        status = newStatus;
    }

    public void setStatus(int newStatus){
        status = newStatus;
    }

    public String getStatus(){
        if(status == 1){
            return "freshman";
        }else if(status == 2){
            return "sophomore";
        }else if(status == 3){
            return "junior";
        }else if(status == 4){
            return "senior";
        }

        return "";

    }

    @Override
    public String toString(){
        return this.name + " is a " + this.getClass().getName() + " (type). ";
    }
}

class Employee extends Person{
    String office;
    double salaray;
    MyDate dateHired;



    Employee(String newName, String newAddress, String newPhoneNumber, String newEmailAddress, String newOffice, double newSalary, MyDate dateHired){
        super(newName, newAddress, newPhoneNumber, newEmailAddress);
        office = newOffice;
        salaray = newSalary;
        dateHired = new MyDate();
    }

    //getters and setters

    public void setOffice(String office) {
        this.office = office;
    }

    public String getOffice() {
        return office;
    }

    public void setSalaray(double salaray) {
        this.salaray = salaray;
    }

    public double getSalaray() {
        return salaray;
    }

    public MyDate getDate() {
        return dateHired;
    }


    @Override
    public String toString(){
        return this.name + " is a " + this.getClass().getName() + " (type). ";
    }

}

class Faculty extends Employee{
    int rank;
    String officeHours;

    public Faculty(String newName, String newAddress, String newPhoneNumber, String newEmailAddress, String newOffice, double newSalary, MyDate dateHired, int rank, String officeHours){
        //invoke super
        super(newName, newAddress, newPhoneNumber, newEmailAddress, newOffice, newSalary, dateHired);
        this.rank = rank;
        this.officeHours = officeHours;
    }
    //getters and setters
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }



    @Override
    public String toString(){
        return this.name + " is a " + this.getClass().getName() + " (type). ";
    }
}

class Staff extends Employee{
    String title;

    public Staff(String newName, String newAddress, String newPhoneNumber, String newEmailAddress, String newOffice, double newSalary, MyDate dateHired, String newTitle){
        super(newName, newAddress, newPhoneNumber, newEmailAddress, newOffice, newSalary, dateHired);
        title = newTitle;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return this.name + " is a " + this.getClass().getName() + " (type). ";
    }

}

//imported from textbook word for word
class MyDate {
    private int year;
    private int month;
    private int day;

    MyDate() {
        GregorianCalendar date = new GregorianCalendar();
        // Find year, month, and day from date. You write your own code to replace the out-dated get methods
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);
    }

    MyDate(long elapsedTime) {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        // Find year, month, and day from date. You write your own code to replace the out-dated get methods
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);
    }

    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
}