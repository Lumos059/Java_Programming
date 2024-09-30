import java.util.Scanner;

public class Lab2Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        final double KILLOGRAMS_PER_POUND = 0.45359237;
        final double METER_PER_INCH = 0.0254;

        double weight_Killograms = weight * KILLOGRAMS_PER_POUND;
        double height_Meter = height * METER_PER_INCH;
        double bmi = weight_Killograms / height_Meter / height_Meter;

        System.out.println("BMI is " + bmi);
    }
}


