import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        System.out.print("შეიყვანეთ n: ");
        int n = scanner.nextInt();
        int sum = n * (n + 1) / 2;
        double average = (double) sum / n;
        System.out.println("საშუალო არითმეტიკული: " + average);

        // 2
        System.out.print("შეიყვანეთ რიცხვი: ");
        n = scanner.nextInt();
        System.out.print("შედეგი: ");
        for (int i = 31; i >= 0; i--) {
            int power = 1 << i; // 2^i
            if (n >= power) {
                System.out.print(power + " ");
                n -= power;
            }
        }
        System.out.println();

        // 3
        System.out.println("კენტი რიცხვები 5-ის, 7-ის და 11-ის გამოკლებით:");
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0 && i != 5 && i != 7 && i != 11) {
                System.out.println(i);
            }
        }

        // 4
        // ?

        // 5
        // ?

        // 6
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        int guess = 0;

        System.out.println("გამოიცანით რიცხვი 1-დან 100-მდე!");
        while (guess != targetNumber) {
            System.out.print("შეიყვანეთ თქვენი რიცხვი: ");
            guess = scanner.nextInt();

            if (guess < targetNumber) {
                System.out.println("თქვენი რიცხვი ნაკლებია!");
            } else if (guess > targetNumber) {
                System.out.println("თქვენი რიცხვი მეტია!");
            } else {
                System.out.println("გილოცავთ! თქვენ გამოიცანით რიცხვი.");
            }
        }
    }
}
