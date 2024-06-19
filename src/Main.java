import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
 // 1.
        System.out.println("\n1.");
        int [] consumption = new int[5];
        for (int i = 0; i < consumption.length; i++) {
            double randomDouble = Math.random() * 40000 + 10000;
            consumption[i] = (int) randomDouble;
        }
        System.out.println(Arrays.toString(consumption));
        int totalConsumption = 0;
        for (int content : consumption) {
            totalConsumption += content;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей.\n", totalConsumption);
    }
}