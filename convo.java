import java.util.Scanner;
public class convo {
    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.\n" +
                "What is the main character called?");
        String name = snc.nextLine();
        System.out.println("What is their job?");
        String job = snc.nextLine();
        System.out.println("Here is the story:\n" +
                "Once upon a time there was "+name+", who was a "+job+".\n" +
                "On the way to work, "+name+" reflected on life.\n" +
                "Perhaps "+name+" will not be a "+job+" forever.");


    }
}