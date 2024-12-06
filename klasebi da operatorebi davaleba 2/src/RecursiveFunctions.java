public class RecursiveFunctions {

    public static int sumMultiples(int a, int b, int k) {
        if (a > b) return 0;
        if (a % k == 0)
            return a + sumMultiples(a + 1, b, k);
        return sumMultiples(a + 1, b, k);
    }

    public static int sumNaturalNumbers(int n) {
        if (n == 1) return 1;
        return n + sumNaturalNumbers(n - 1);
    }

    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    public static int countZeros(int num) {
        if (num == 0) return 1;
        if (num < 10) return 0;
        return (num % 10 == 0 ? 1 : 0) + countZeros(num / 10);
    }

    public static void checkZeros(int num) {
        int zeroCount = countZeros(num);
        if (zeroCount % 2 == 0) {
            System.out.println("The number of zeros is even.");
        } else {
            System.out.println("The number of zeros is odd.");
        }
    }
}
