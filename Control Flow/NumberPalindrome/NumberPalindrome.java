public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int palindrome=0;
        int n;
        int temp=number;
        while(temp!=0) {
            n = temp % 10;
            palindrome = (palindrome * 10) + n;
            temp=temp/10;
        }
        if(number==palindrome){
            return true;
        }
        else {
            return false;
        }
    }
}
