package java2;


public class InheritenceApplication {

    public static void main(String[] args) {
        Person person = new Person("Everardo", 45, 'M');
        System.out.println(person.description());

        Student student = new Student("Marc", 46, 'M', "Pinnacles", "Java");
        System.out.println(student.description());


    } //end main
} // end class
