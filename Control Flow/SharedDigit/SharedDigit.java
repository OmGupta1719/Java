public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if(num1>9 && num1<100 && num2>9 && num2<100){
            int n1;
            int n2;
            int temp;
            while(num1!=0){
                temp=num2;
                n1=num1%10;
                while(temp!=0){
                    n2=temp%10;
                    if(n1==n2){
                        return true;
                    }
                    temp=temp/10;
                }
                num1=num1/10;
            }
            return false;
        }
        else{
            return false;
        }
    }
}
