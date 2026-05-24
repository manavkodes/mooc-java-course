import java.util.Scanner;
public class leapyr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = Integer.parseInt(sc.nextLine());
        int rem1 = f % 4;
        int rem2 = f % 400;
        int rem3 = f % 100;

        if (rem2==0) {
            System.out.println("Leap year");
        } else if (rem3==0) {
            System.out.println("not a Leap year");
        } else if (rem1==0) {
            System.out.println("Leap year");

        } else {
            System.out.println("not a Leap year");
        }

    }
}