import java.util.Scanner;
public class positiavg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int av = 0;
        int gb = 0;
        while (true) {
            System.out.println("enter numbers");
            int num = Integer.parseInt(sc.nextLine());
            if (num > 0) {
                av += num;
                gb += 1;

            } else if (num < 0) {
                System.out.println("enter positive numbers only");
            } else {
                break;
            }


        }

        if (av == 0) {
            System.out.println("cant calc avg");
        } else {
            System.out.println("avg is "+(double)(av/gb));
        }
    }
}