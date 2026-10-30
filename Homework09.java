
public class Homework09 {
    
    public static void main(String[] args) {
        long triangleNumber = 0;
        int nextNumber = 1;

        do {
            triangleNumber += nextNumber;
            nextNumber++;
        } while (countDivisors(triangleNumber) <= 100);

        System.out.println(triangleNumber);
    }

    public static int countDivisors(long number) {
        int count = 0;
        for (long divisor = 1; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                if (divisor * divisor == number) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}
