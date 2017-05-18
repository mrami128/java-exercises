package java2;



public class ArrayIteration {                   //arrays donot have methods - only length but in JAVA
                                                // Arrays class is a helper class for manipulation
    public static void main(String[] args) {


    int [] numbers= {2,12,23,40,78,100};  // this is our array

        int sum =0;   //going to add all numbers together .cycle back thru array til .length

//        for(int i=0;i< numbers.length; i++){
//            sum=sum + numbers[i];
//        } //end for loop cycle back thru

     // enhanced for loop on numbers example above

        sum=0;
        for(int number : numbers) {
            sum += number;
        } // end for loop cycle back thru
        System.out.println("the sum of all numbers is:" +sum);

            int[] threeNumbers = {1, 2, 3};  // memory ex 6f45
            int[] sameThreeNumber = {1,2,3};  // memory ex 667d

    String[] languages ={"html","java","css","javaScript"};

     // enhanced for loop
        for( String language : languages) { //for each language in languages do
            System.out.println(language);

        } //end for



    }  //end psvm
}  // end class block
