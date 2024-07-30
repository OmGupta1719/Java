public class FactorPrinter {
    public static void printFactors(int number){
        int temp;
        if(number>=1){
            for(int i=1;i<=number;i++){
                temp=number%i;
                if(temp==0){
                    System.out.println(i);
                }
            }
        }
        else{
            System.out.println("Invalid Value");
        }
    }
}
