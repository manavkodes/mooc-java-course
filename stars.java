
public class stars {
    public static void main(String[] args) {
        System.out.println("Rectangle:");
        printRectangle(17,3);
        System.out.println("Square:");
        printSquare(4);
        System.out.println("Triangle:");
        printTriangle(4);

    }

    public static void printStars(int num) {
        int i = 0;
        while (i<num) {
            System.out.print("*");
            i++;
        }
    }

    public static void printSquare(int mun){
        int j = 0;
        while (j<mun) {
            printStars(mun);
            System.out.println(" ");
            j++;
        }
    }

    public static void printRectangle(int wid , int hei) {
        int k = 0;
        while (k<hei) {
            printStars(wid);
            System.out.println(" ");
            k++;
        }
    }

    public static void printTriangle(int tri){
        for (int k = 1 ; k<=tri;k++) {
            printStars(k);
            System.out.println(" ");
        }
    }


}