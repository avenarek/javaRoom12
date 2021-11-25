package model;

public class Person {
    private String firstName;
    private String lastName;
    private int year;
    private boolean isPhd;
    private char gender;
    private int number;


    //constructor

    public Person(String firstName, String lastName, int year, boolean isPhd, char gender, int number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.isPhd = isPhd;
        this.gender = gender;
        this.number = number;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isPhd() {
        return isPhd;
    }

    public void setPhd(boolean phd) {
        isPhd = phd;
    }

    public char getGender() {
        return gender;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setGender(char gender) {
        this.gender = gender;


    }
}
