import java.util.Scanner;
public class megamath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            System.out.println("enter the numbers");
            int num = Integer.parseInt(scn.nextLine());
            if (num > -1 && num%2 == 0) {
                sum += num;
                even++;
            } else if (num > -1 && num%2 != 0) {
                sum += num;
                odd++;

            } else if (num < -1) {
                System.out.println("invalid number entered");
            }
            if (num == -1) {
                System.out.println("Thx!Bye!");
                break;
            }

        }
        System.out.println("sum = "+sum);
        System.out.println("avg = "+((double)sum/(even+odd)));
        System.out.println("even: "+even);
        System.out.println("odd: "+odd);



    }
}