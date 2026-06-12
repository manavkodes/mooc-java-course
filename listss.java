import java.util.Scanner;
import java.util.ArrayList;


public class listss {

    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("enter values");
            String x = scn.nextLine();
            if (x.equals("")) {
                break;
            }
            word.add(x);


        }
        for (int i = word.size()-1;i>=0;i--) {
            System.out.println(word.get(i));
        }






    }
}