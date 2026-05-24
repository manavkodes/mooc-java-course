import java.util.Scanner;
public class speedcheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("give speed:");
        String sped = scn.nextLine();
        int speed = Integer.parseInt(sped);
        while (true) {
            if (speed>120) {
                System.out.println("slow down gng");

                }else {
                System.out.println("all good");
            }
            System.out.println("wanna add more? Y/N");
            String hh = scn.nextLine();
            if (hh.equals("N")) {
                break;
            }
        }
    }
}