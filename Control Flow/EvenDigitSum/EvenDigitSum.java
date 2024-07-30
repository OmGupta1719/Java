public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number >=0) {
            int sum = 0;
            int n;
            while (number != 0) {
                n = number % 10;
                if (n % 2 == 0) {
                    sum = sum + n;
                }
                number = number / 10;
            }
            return sum;
        } else {
            return -1;
        }
    }
}
