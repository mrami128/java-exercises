package java2;

public class createPerson {         // ----- PSVM   IS  BELOW ----------

public static void main(String[] args) {


//        Person person1 = new Person("Marc");         // create new person obj instance
//
//            System.out.println("name1 is:" + person1.getName());    // print the first name
//               person1.setName ( "Luis");                  // input the new name to the obj
//
//               String name1 = person1.getName();
//            System.out.println("name1 is:" + name1);
//
//            person1.sayHello();        // another way of calling out the person1 name
//
////  -------------------
//    Person person1 = new Person("John");
//    Person person2 = new Person("John");
//
//    System.out.println("----true person1 = 2 by value ---- but they are not same String");
//    System.out.println(person1.getName().equals(person2.getName()));
//    System.out.println(person1 == person2);
// //-----------------------
//    Person person1 = new Person("John");
//    Person person2 = person1;
//    System.out.println(person1 == person2);
//    //-----------------

    Person person1 = new Person("John");

    Person person2 = person1;
    System.out.println(person1.getName());    // =john
    System.out.println(person2.getName());    // =john

    person2.setName("Jane");
    System.out.println(person1.getName());   // =jane
    System.out.println(person2.getName());   // =jane

} //end main psvm
} //end class

