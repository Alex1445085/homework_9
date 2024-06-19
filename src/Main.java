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

 // 2.
        System.out.println("\n2.");
        int contentMin = consumption[0], contentMax = consumption[0];
        for (int i = 1; i < consumption.length; i++) {
            if (contentMin > consumption[i]) {
                contentMin = consumption[i];
            }
            if (contentMax < consumption[i]) {
                contentMax = consumption[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + contentMin);
        System.out.println("Максимальная сумма трат за неделю составила " + contentMax);

 // 3.
        System.out.println("\n3.");
        float average = 0.0f;
        for (int content : consumption) {
            average += content;
        }
        average /= consumption.length;
        System.out.printf("Средняя сумма недельных трат за месяц составила %.2f рублей\n", average);

 // 4.
        System.out.println("\n4.");
        char [] reverseName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseName.length - 1; i >= 0; i--) {
            System.out.print(reverseName[i]);
        }
        System.out.println();
        char temporary;
        for (int i = 0; i < reverseName.length / 2; i++) {
            temporary = reverseName[i];
            reverseName[i] = reverseName[reverseName.length - i - 1];
            reverseName[reverseName.length - i - 1] = temporary;
        }
        for (char content : reverseName) {
            System.out.print(content);
        }
    }
}