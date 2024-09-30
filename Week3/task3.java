import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in seconds");
        int time = sc.nextInt();
        int minutes = time / 60;
        int remainning_seconds = time % 60;
        System.out.println(minutes + ":" + remainning_seconds);
    }
}
