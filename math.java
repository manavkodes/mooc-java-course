import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scn = new Scanner(System.in);
        int num = 0;
        while (true) {
            int val = Integer.parseInt(scn.nextLine());
            System.out.println(Math.abs(val));
            num += 1;
            if (num==5) {
                break;
            }


        }

    }
}