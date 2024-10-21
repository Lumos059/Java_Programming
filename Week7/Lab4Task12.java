import java.util.Scanner;

public class Lab4Task12 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter full year (e.g., 2012): ");
            int year = input.nextInt();
            System.out.print("Enter month as number between 1 and 12: ");
            int month = input.nextInt();

            printMonth(year, month);
        }

        public static void printMonth(int year, int month) {

            System.out.println("          " + getMonthName(month) + " " + year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");


            int startDay = getStartDay(year, month);
            int numberOfDays = getNumberOfDaysInMonth(year, month);


            for (int i = 0; i < startDay; i++) {
                System.out.print("    ");
            }


            for (int day = 1; day <= numberOfDays; day++) {
                System.out.printf("%3d ", day);
                if ((day + startDay) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }

        public static String getMonthName(int month) {
            String[] months = {
                    "January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December"
            };
            return months[month - 1];
        }

        public static int getStartDay(int year, int month) {

            return 0; //
        }

        public static int getNumberOfDaysInMonth(int year, int month) {

            return 30;
        }
}
