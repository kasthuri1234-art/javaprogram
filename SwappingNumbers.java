import java.util.Scanner;

public class SwappingNumbers {
    public static void main(String[] args) {
        Scanner pb = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = pb.nextInt();
        System.out.println("Enter the second number:");
        int b = pb.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}