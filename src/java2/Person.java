package java2;

class Person {                  //----- OBJECT / BLUEPRINT --- no PSVM


    private String name;           //  the variable - obj states
                                      //  this var is private requiring the

   // ---- Methods ---------


    String getName(){                   // this is getter
        return name;
    }

    void setName (String name){          //this is setter
        this.name = name;
    }

    public Person (String name){          // this is constructor
        setName(name);
    }

    public void sayHello(){             // this just another way to call a function
        System.out.println("\nhello " +name+ " !");
    }

} //end of class

