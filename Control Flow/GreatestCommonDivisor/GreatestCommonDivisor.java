public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first>=10 && second>=10){
            int divisor=1;
            int greatest=0;
            while(divisor<=first || divisor<=second){
                if(first%divisor==0 && second%divisor==0){
                    greatest=divisor;
                }
                divisor++;
            }
            return greatest;
        }
        else {
            return -1;
        }
    }
}
