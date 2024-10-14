public class Lab6Task14 {
    public static void main(String[] args) {
        int tuition1 = 10000;
        double increase = 0.07;
        double tuition = tuition1;
        int year = 0;
        while( tuition < tuition1 * 2){
            year++;
            tuition = tuition * (1 + 0.07);
        }
        System.out.println("Tuition will be doubled in " + year + " years");
        System.out.println("Tuition will be $" + tuition + " in "+ year + " years");
    }
}
