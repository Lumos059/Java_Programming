import java.util.Scanner;
public class Lab2Task10 {
        public static void main(String[] args) {
            double sum=0;
            System.out.print("Enter the monthly saving amount：");
            Scanner sc =new Scanner(System.in);
            double money = sc.nextDouble();
            for(int i=0;i<=6;i++){
                sum=(sum+money)*(1+0.00417);
            }
            System.out.println("After the sixth month,the account value is $"+sum);
        }
}
