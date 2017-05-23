package java2;

public class Person {

    private String name;    //protected String will allow visib for children but not
    private int age;
    private char gender;


    public Person(String name, int age, char gender) {     // This is constructor bec of private variables
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String description() {

        return String.format("This is %s and he/she is %d years old ", name, age);
    }

} // end Person class

class Student extends Person {

    private String cohort;                      // we are overloading the object? adding variables
    private String backendLanguage;


    public Student(String name, int age, char gender, String cohort, String backendLanguage) {
        super(name, age, gender); // super - call the parent constructor
    }

    public String description() {
        return super.description() + " Cohort: " + cohort + " Language: " + backendLanguage;
    }

} // end of inheritance class

