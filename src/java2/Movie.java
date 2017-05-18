package java2;
class Movie {

    private String name;
    private String category;

    public Movie(String name, String category) {   //constructr  gets its data from the movie folder list --or user request from Pvsm side
        this.name = name;
        this.category = category;
    }

    public String getName() {   // getter gets value from top of screen//also can provide info to PSVM requests ex: getNAm
        return name;
    }

    public void setName(String name) {   //then variable is set  by the setter at top of screen variable
        this.name = name;
    }

    public String getCategory() {               //
        return category;
    }

    public void setCategory(String category) {    //
        this.category = category;
    }
}//end movie
