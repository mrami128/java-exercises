package java2;

public class createPerson {         //  PSVM   IS  BELOW

    public static void main(String[] args) {

        Person person1 = new Person("Marc");         // create new person obj instance

            System.out.println("name1 is:" + person1.getName());    // print the first name


        person1.setName ( "Luis");                  // input the new name to the obj


        String name1 = person1.getName();

            System.out.println("name1 is:" + name1);



    } //end main psvm
} //end class

