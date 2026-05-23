import java.util.Scanner;

public class messageforuser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write a message");
        String msg = scanner.nextLine();
        System.out.println(msg);

    }
}