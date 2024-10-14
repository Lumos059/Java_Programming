import java.util.Scanner;

public class Lab6Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        System.out.print("What is " + number1 + " + " + number2 + " ?");
        int answer = input.nextInt();
        while(answer != (number1 + number2)){
            System.out.print("Wrong ansert. Try again. What is " + number1 + " + " + number2 + " ? ");
            answer = input.nextInt();
        }
        System.out.println("You got it!");
    }
}
