import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner pb = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = pb.nextInt();
        if (num % 2 == 0) {
            System.out.println("number is even:");
        } else {
            System.out.println("number is odd:");
        }
    }
}