import java.util.Scanner;

/**
 * Created by KPS on 7/7/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int number1 = scanner.nextInt();
        System.out.println("please enter a number");
        int number2 = scanner.nextInt();
        if (number1 > number2) System.out.println("number one is biger than number 2");
        else if(number1==number2) System.out.println("number one is equal number two");
        else System.out.println("number one is smaller than number two");
    }
}
