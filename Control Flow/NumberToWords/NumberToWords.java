public class NumberToWords {
    public static void numberToWords(int number){
        int digitcount=getDigitCount(number);
        int revnumber=reverse(number);
        if(revnumber>=0){
            while(digitcount!=0){
                int lastnum=revnumber%10;
                String output="";
                switch(lastnum){
                    case 0:
                        output="Zero";
                        break;
                    case 1:
                        output="One";
                        break;
                    case 2:
                        output="Two";
                        break;
                    case 3:
                        output="Three";
                        break;
                    case 4:
                        output="Four";
                        break;
                    case 5:
                        output="Five";
                        break;
                    case 6:
                        output="Six";
                        break;
                    case 7:
                        output="Seven";
                        break;
                    case 8:
                        output="Eight";
                        break;
                    case 9:
                        output="Nine";
                        break;
                }
                digitcount--;
                revnumber=revnumber/10;
                System.out.println(output);
            }
        }
        else{
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int number) {
        int rev = 0;
        while(number!=0) {
            int n = number % 10;
            rev = rev * 10 + n;
            number = number / 10;
        }
        return rev;
    }

    public static int getDigitCount(int number){
        if(number>0){
            int count=0;
            while(number!=0){
                number=number/10;
                count++;
            }
            return count;
        }
        else if(number==0){
            int count=1;
            return count;
        }
        else {
            return -1;
        }
    }
}
