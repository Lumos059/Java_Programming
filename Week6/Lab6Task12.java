public class Lab6Task12 {
    public static void main(String[] args) {
        int count = 0;
        int lineCount = 0;
        System.out.println("The first 50 prime numbers are");

        for (int i = 2; count < 50; i++) {
            if (isPrime(i)) {
                lineCount++;
                count++;
                if (lineCount < 10) {
                    System.out.print(i+"  ");
                }
                if (lineCount == 10) {
                    System.out.println(i);
                    lineCount = 0;
                }
            }
        }
    }

    public static boolean isPrime(int num){
        for(int i = 2;i < num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}