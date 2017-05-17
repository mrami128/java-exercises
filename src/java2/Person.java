package java2;

class Person {                  //------this is OBJECT / BLUEPRINT --- no PSVM String args


    private String name;           //  the variable - obj states
                                      //  this var is private requiring the

   // ---- Methods ---------

    public Person (String name){          // this is constructor
        setName(name);
    }

    void setName (String name){          //this is setter
        this.name = name;
    }

    String getName(){                   // this is getter
        return name;
    }

} //end of class

