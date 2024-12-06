import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        Car car1 = new Car("Toyota", "Camry", 2020, "ABC123");
        Car car2 = new Car("Honda", "Civic", 2018, "XYZ789");

        car1.printInfo();
        System.out.println();
        car2.printInfo();

        Scanner scanner = new Scanner(System.in);

        // 2
        System.out.print("\nEnter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter k: ");
        int k = scanner.nextInt();
        int sumOfMultiples = RecursiveFunctions.sumMultiples(a, b, k);
        System.out.println("Sum of multiples of " + k + " in range [" + a + ", " + b + "] is: " + sumOfMultiples);

        //3
        System.out.print("\nEnter n for sum of natural numbers: ");
        int n = scanner.nextInt();
        int sumNatural = RecursiveFunctions.sumNaturalNumbers(n);
        System.out.println("Sum of natural numbers from 1 to " + n + " is: " + sumNatural);

        //4
        System.out.print("\nEnter base (a): ");
        int base = scanner.nextInt();
        System.out.print("Enter power (n): ");
        int power = scanner.nextInt();
        int result = RecursiveFunctions.power(base, power);
        System.out.println(base + " raised to the power of " + power + " is: " + result);

        //5
        System.out.print("\nEnter a number to count zeros: ");
        int num = scanner.nextInt();
        RecursiveFunctions.checkZeros(num);
    }
}
