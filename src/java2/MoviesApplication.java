package java2;

import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.println("What would you like to do?");
        System.out.println("\n"+"Hello..What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                " \n" + " Make your choice:");

        int userChoice = input.nextInt();

//
    while(true) {

        switch (input.nextInt()) {
            case 0:
                System.out.println("Exiting Now");
                System.exit(0);
                break;
            case 1:
                for(Movie m : listOfMovies){
                    System.out.println(m.getName)+"-"+m.getCategory() );
                break;
                }
                System.out.println("Case 1");

                for(Movie m : listOfMovies) {
                    if (m.getCategory().equalsIgnoreCase("animated")) {
                        System.out.println(m.getName() + "-" + m.getCategory());
                        break;
                    }
                }
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            case 4:
                System.out.println("Case 4");
                break;
            case 5:
                System.out.println("Case 5");
                break;
            default:
                System.out.println("Default case");
                break;
        } // end case

    }//end while

    }//end psvm Str args

}// end class

/*

 */