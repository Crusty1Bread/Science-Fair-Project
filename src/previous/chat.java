package previous;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Instant;
import java.util.Scanner;
import java.util.Date;

public class chat {

    private static String location;
    private static Object rrsp;
    private static String CANCEL;

    public chat(String name) {
        this.location = location;
    }

    public static int randomWithRange(int min, int max) {
        int range = Math.abs(max - min) + 1;
        return (int) (Math.random() * range) + (min <= max ? min : max);
    }

    public static void main(String[] arg) throws IOException {
        System.out.println("Hello, My name is Ella! Please state the location of your emergency");

        Scanner in = new Scanner(System.in);

        String locationofEmergency = in.nextLine();

        do {
            if (locationofEmergency.equalsIgnoreCase("field")
                    || locationofEmergency.equalsIgnoreCase("gym")
                    || locationofEmergency.equalsIgnoreCase("pe")
                    || locationofEmergency.equalsIgnoreCase("A-building")
                    || locationofEmergency.equalsIgnoreCase("B-building")
                    || locationofEmergency.equalsIgnoreCase("C-building")
                    || locationofEmergency.equalsIgnoreCase("D-building")
                    || locationofEmergency.equalsIgnoreCase("E-building")
                    || locationofEmergency.equalsIgnoreCase("F-building")
                    || locationofEmergency.equalsIgnoreCase("entrance")
                    || locationofEmergency.equalsIgnoreCase("quad")
                    || locationofEmergency.equalsIgnoreCase("stem building")
                    || locationofEmergency.equalsIgnoreCase("stem")
                    || locationofEmergency.equalsIgnoreCase("back")) {
                System.out.println("Sending Location to designated Adminstrator");
            } else if (!locationofEmergency.equalsIgnoreCase("field")
                    || !locationofEmergency.equalsIgnoreCase("gym")
                    || !locationofEmergency.equalsIgnoreCase("pe")
                    || !locationofEmergency.equalsIgnoreCase("A-building")
                    || !locationofEmergency.equalsIgnoreCase("B-building")
                    || !locationofEmergency.equalsIgnoreCase("C-building")
                    || !locationofEmergency.equalsIgnoreCase("D-building")
                    || !locationofEmergency.equalsIgnoreCase("E-building")
                    || !locationofEmergency.equalsIgnoreCase("F-building")
                    || !locationofEmergency.equalsIgnoreCase("entrance")
                    || !locationofEmergency.equalsIgnoreCase("quad")
                    || !locationofEmergency.equalsIgnoreCase("stem building")
                    || !locationofEmergency.equalsIgnoreCase("stem")
                    || !locationofEmergency.equalsIgnoreCase("back")){
                System.out.println("Sorry, this is not a benchmark location.");

            }
            in.nextLine();
        } while (false);

        Scanner in3 = new Scanner(System.in);

        String name = in.nextLine();
        String answer = null;

        if (locationofEmergency.equalsIgnoreCase("stem")) {
            System.out.println("What is going on in the STEM Building?");
            System.out.println("Please be specific");
            answer = in3.nextLine();
        } else {
            System.out.println("What is going on at the " + locationofEmergency + "?");
            System.out.println("Please be specific");
            answer = in3.nextLine();
        }


        Person ppl = new Person(locationofEmergency, answer, name);

        System.out.println("Thank you. Your report is currently being evaluated by an administrator ");

        System.out.println("Please wait for approval");
        System.out.println("Sending out Location: " + locationofEmergency);
        System.out.println("Sending details: " + answer);
        System.out.println("Please find a safe place as we contact Admin. about a " + answer);

        Date date = new Date();
        Instant instant3 = date.toInstant();

        System.out.println(instant3);

        System.exit(0);

        try {
            FileWriter write = new FileWriter("resp.txt", true);
            PrintWriter prt = new PrintWriter(write);

            prt.printf("%s" + "%n", rrsp);
            prt.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }


        /*
         * try { File file2 = new File("convo.ella"); BufferedReader reader2 = new
         * BufferedReader(new FileReader(file2)); String ln2 = reader2.readLine();
         * List<String> lines2 = new ArrayList<String>(); while (ln2 != null) {
         * lines2.add(ln2); ln2 = reader2.readLine(); } Random r2 = new Random();
         * System.out.println(location + ", " + lines2.get(r2.nextInt(lines2.size())));
         * } catch (IOException e) { e.printStackTrace(); }
         */
        System.exit(0);
    }

    private static void feelings() {
        // TODO Auto-generated method stub

    }
}

