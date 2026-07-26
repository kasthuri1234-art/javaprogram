import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if (num % 400 == 0)// (num % 4==0 && num % 100!==0)
        {
            System.out.println("Leap year:");
        } else

        {
            System.out.println("not Leap year:");
        }
    }
}
