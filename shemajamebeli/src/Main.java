import java.util.Scanner;

//1. b)-3
//2. c) int[] array = new int[5][5];
//3. d) 4
//4. c) String
//5. a) A
//6. c) byte,short,int,long
//7. a) hello
//8. a) break
//9. a) აცხადებს 10 ინტიან მასივს და ყველას ანიჭებს მნიშვნელობა 0
//10. e) არცერთი
//11. c) მასივს აქვს ფიქსირებული ზომა
//12. c) git log
//13. a) remote რეპოზიტორის ასლს ქმინს ლოკალურად
//14. a) 0
//15. b) მასივი არის ერთი ცვლადი, რომელსაც შეუძლია შეინახოს რამდენიმე ერთი და იმავე ტიპის მნიშვნელობა
//16.
public class Main{
    public static void main(String[] args){
        int [] prices = {1,5,9,2,10,7};
        int minPrice = prices[0];
        int maxPrice = prices[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i=1; i<prices.length; i++){
            if (prices[i] < minPrice){
                minPrice = prices[i];
                minIndex = i;
            }
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                maxIndex = i;
            }
        }
        System.out.println(minIndex + " მაღაზიაში ყველაზე იაფია და ღირს " + minPrice + "ლარი");
        System.out.println(maxIndex + " მაღაზიაში ყველაზე ძვირია და ღირს " + maxPrice + "ლარი");

        //17.
        System.out.println("17. რიცხვების დაბეჭდვა 5-ის და 7-ის მულტიპლიკაცია: ");
        for (int i = 0; i <= 100; i++) {
            if (i % 5==0 && i%7==0) {
                System.out.println("HEYHOW");
            } else if (i % 5==0){
                System.out.println("HEY");
            }else if (i % 7==0) {
                System.out.println("HOW");
            } else {
                System.out.println(i);
            }
        }
        System.out.println();

        //18.
        System.out.println("18. 2 განზომილებიანი მასივი:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ სიგრძე: ");
        int rows = scanner.nextInt();
        System.out.print("შეიყვანეთ სიგანე: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        System.out.println("მასივი: ");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int min = matrix[0][0], max = matrix[0][0];
        int minRow = 0, mincol = 0, maxRow = 0, maxCol = 0;

        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<cols; j++) {
                if (matrix[j][j] < min) {
                    min =matrix[i][j];
                    minRow = i;
                    mincol = j;
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("მინიმალური ელემენტი: " + min + " (" + minRow + ", " + mincol + ")");
        System.out.println("მაქსიმალური ელემენტი: " + max + " (" + maxRow + ", " + maxCol + ")");
        System.out.println();
    }
}