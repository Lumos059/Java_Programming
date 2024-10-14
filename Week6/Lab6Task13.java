import java.util.Scanner;

public class Lab6Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        int gcd = findgcd(number1, number2);
        System.out.println("The greatest common divisor for " + number1 + " and " + number2 + " is " + gcd);
    }
    public static int findgcd(int num1,int num2){
        if (num2 == 0) return num1;
        return findgcd(num2,num1 % num2);
    }
}
