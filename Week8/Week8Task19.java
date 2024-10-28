public class Week8Task19 {
    public static void main(String[] args) {
        // 调用 `printMax` 方法并传递多个整数参数
        printMax(1, 3, 5, 7);
        // 调用 `printMax` 方法并传递一个 `double` 类型的数组
        printMax(new double[]{1, 3, 5, 7});
    }

    // 定义 `printMax` 方法，接收可变数量的 `double` 类型参数
    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument is passed");
            return;
        }
        double max = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The max value is " + max);

    }
}
