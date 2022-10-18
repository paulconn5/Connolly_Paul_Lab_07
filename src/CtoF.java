import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        double temp = 0;
        double fTemp;
        boolean done=false;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temp in celsius:");
        do {
            if (in.hasNextDouble()) {
                temp = in.nextDouble();
                done = true;
            } else {
                System.out.println("Invalid entry try again.");
                in.nextLine();
            }
        } while(!done);

        fTemp = (temp * 9/5) + 32;

        System.out.println("Temperature in fahrenheit: " + fTemp);
    }
}