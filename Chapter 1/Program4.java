public class Program4 {
    public static void main(String[] args) {
        System.out.println("a       a^2     a^3");
        for(int i = 1;i <= 4;i++){
            if(i <= 3){
                System.out.println(i + "       " + i * i + "       " + i * i * i);
            }
            else{
                System.out.println(i + "       " + i * i + "      " + i * i * i);
            }
        }
    }
}
