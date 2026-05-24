import java.util.Scanner;
public class simpleadd {
    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);

        System.out.println("give first number");
        String fr = snc.nextLine();
        int numbero = Integer.valueOf(fr);
        System.out.println(numbero);
        System.out.println("give second number");
        String rf = scn.nextLine();
        int num = Integer.valueOf(rf);
        int sum = numbero + num;
        System.out.println(fr+"+"+rf+"="+sum);






    }
}