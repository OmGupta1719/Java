public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number>=0) {
            int firstNum = number % 10;
            int lastNum = 0;
            while (number != 0) {
                lastNum = number % 10;
                number = number / 10;
            }
            return (firstNum + lastNum);
        }
        else{
            return -1;
        }
    }
}
