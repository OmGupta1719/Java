public class SumOddRange {
    public static boolean isOdd(int number){
        if(number>0){
            if(number%2!=0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }


    public static int sumOdd(int start,int end){
        int sum=0;
        if(start>0 && end>0 && end>=start){
            for(;start<=end;start++){
                if(isOdd(start)){
                    sum= sum +start;
                }
            }
            return sum;
        }
        else{
            return -1;
        }
    }
}
