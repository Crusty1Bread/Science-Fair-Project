import java.util.*;
import java.lang.*;

public class comm {
    static Scanner scan = new Scanner(System.in);
    private String userName;
    private ArrayList<String> loc = new ArrayList<>();
    private ArrayList<String> eventInfo = new ArrayList<>();

    public comm() {
        loc.add("gym");
        loc.add("stem");
        loc.add("office");

        System.out.println("What is your name? ");
        userName = scan.nextLine();
    }

    public void request() {
        System.out.println("Please tell me what is happening? ");
        eventInfo.add(scan.nextLine());

        System.out.println("Please tell me the location of the event. ");
        eventInfo.add(scan.nextLine());
    }

    public void present() {
        System.out.println("-------------------\nUsername: " + userName);

        System.out.print("Saved Locations: ");
        for (int i = 0; i < loc.size(); i++) {
            if (i == loc.size() - 1) {
                System.out.println(loc.get(i));
            } else {
                System.out.print(loc.get(i) + ", ");
            }
        }

        System.out.println("Event Description: " + eventInfo.get(0));
        System.out.println("Event Location: " + eventInfo.get(1));
    }
}
