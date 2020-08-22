package previous;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class main {
    public static void main(String[] args) {
        //reference other classes for specific tasks
        Scanner scan = new Scanner(System.in);
        String[] locations = new String[]{"stem", "quad", "gym"};

        System.out.println("What location are you in? ");
        String userLocation = scan.nextLine();

        while (!(userLocation.equalsIgnoreCase(locations[0]) || userLocation.equalsIgnoreCase(locations[1]) || userLocation.equalsIgnoreCase(locations[2]))) {
            System.out.println("Please enter a valid location.");
            userLocation = scan.nextLine();
        }


    }
}
