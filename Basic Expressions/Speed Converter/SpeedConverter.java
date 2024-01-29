public class SpeedConverter{
    
    //Solution methods
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        double miles = kilometersPerHour / 1.609;
        return Math.round(miles);
    }

    public static void printConversion(double kilometersPerHour){
        long miles = toMilesPerHour(kilometersPerHour);
        if(miles==-1){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kilometersPerHour + " km/h = " + miles +" mi/h");
        }
    }
}
