public class Lab6Task9 {
    public static void main(String[] args) {
        for (int j = 1; j <= 4; j++){
            System.out.print("   " + j);}
        System.out.println("\n------------------------------------------------------");
        for (int i = 1; i <= 4; i++){
            System.out.print(i + "| ");
            for(int j = 1;j <= 4; j++){
               if(j > i) System.out.printf(" ", i*j);
               else System.out.printf("*   ");
            }
            System.out.println();
        }
    }
}
