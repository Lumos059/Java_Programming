import java.util.Scanner;

public class Lab6Task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println(s + " is not a palindrome");
                break;
            }
            left++;
            right--;
        }
        if(left == right){
            System.out.println(s + " is a palindrome");
        }

    }
    }

