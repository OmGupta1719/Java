public class BarkingDog {

  //Solution method
     public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(hourOfDay>=0 && hourOfDay<=23){
            if(barking && hourOfDay<8 || hourOfDay>22){      //barking==true can be simply written as barking
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
  
}
