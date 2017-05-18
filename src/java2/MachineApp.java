package java2;
class Machine {    //-------------- OBJ  blueprint
    private String name;

    public Machine(){           // constructors are active but not running when program starts
                                    // they can be called throu new obj instance in psvm
        System.out.println("1st constructor running");
        name ="Arnie";
        System.out.println(name);
    }
    public Machine( String name ){
        System.out.println("2nd constructor running");
        this.name = name;
        System.out.println(name);
    }
} // end class obj

public class MachineApp {   //--------------------------PSVM Stargs
  public static void main(String[] args) {

//        Machine machine1= new Machine();

//        Machine machine2 = new Machine("bertie");

          Machine machine3 = new Machine();

  } //end psvm
} //end class
