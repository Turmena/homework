public class Main {
    public static void main(String[] args) {

        // 1
        int sum = 0;
        for (int i = 10; i <= 100; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("1. 10-დან 100-მდე 5-ის ჯერადი რიცხვების ჯამია: " + sum);

        // 2
        int number = 12345;
        int digitCount = String.valueOf(Math.abs(number)).length();
        System.out.println("2. რიცხვი " + number + " არის " + digitCount + "ნიშნა.");

        // 3
        int primeCheck = 29;
        boolean isPrime = isPrime(primeCheck);
        System.out.println("3. რიცხვი " + primeCheck + (isPrime ? " არის" : " არ არის") + " მარტივი.");

        // 4
        int a = 36, b = 60;
        int gcd = gcd(a, b);
        System.out.println("4. რიცხვების " + a + " და " + b + " უდიდესი საერთო გამყოფი: " + gcd);

        // 5
        System.out.print("5. სამნიშნა რიცხვები, რომლებიც იყოფა ციფრთა ჯამზე: ");
        for (int i = 100; i <= 999; i++) {
            if (i % digitSum(i) == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 6
        System.out.print("6. ფიბონაჩის მიმდევრობის პირველი 10 წევრი: ");
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i < 10; i++) {
            int next = n1 + n2;
            System.out.print(next + " ");
            n1 = n2;
            n2 = next;
        }
        System.out.println();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
