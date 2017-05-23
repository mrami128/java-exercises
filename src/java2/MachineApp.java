package java2;


import java.util.Random;

class Machine {    //-------------- OBJ  blueprint
    private String name;

    public Machine(){            // constructors are active but not running when program starts

        System.out.println("1st constructor running");  // they can be called throu new obj instance in psvm
        name ="Arnie";
        System.out.println(name);
    }
    public Machine( String name ){                      // can have mult constructors as long as exact same name
        System.out.println("2nd constructor running");
        this.name = name;
        System.out.println(name);
    }
} // end class obj

public class MachineApp {   //--------------------------PSVM String args
  public static void main(String[] args) {

      Random generator = new Random();

        Machine machine1= new Machine();          // this Obj uses 1st constructor

        Machine machine2 = new Machine("bertie");   // this Obj uses 2nd constr..it passes an argument

          Machine machine3 = new Machine();       // this Obj re-uses 1st constr..



  } //end psvm
} //end class
