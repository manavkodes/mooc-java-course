import java.util.Scanner;
public class gradesnpoints {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        String fg = sv.nextLine();
        int nu = Integer.parseInt(fg);
        if (nu<0) {
            System.out.println("impossible");
        } else if (nu>=0 && nu<=49) {
            System.out.println("failed");
        } else if (nu>=50 && nu<=59) {
            System.out.println("1");
        } else if (nu>=60 && nu<=69) {
            System.out.println("2");
        } else {
            System.out.println("excellent grades");
        }


    }
}