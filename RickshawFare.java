import java.util.Scanner;
public class RickshawFare{
    static int basefare = 20;
    static int pk = 10;
    static int pm = 2;
    public static void main (String[]args){
        System.out.println("================RickshawFareCalculator============\n");
        
        Scanner rk = new Scanner(System.in); //Creating a scanner for taking multiple inputs
        System.out.println("-Enter distance travelled:\t\t "); //asking distance
        double km = rk.nextDouble();
        
        System.out.println ("-Enter total time taken to reach destination in minutes:================ "); //asking total travel time
        double m = rk.nextDouble();
        double netfare = (km*pk + m*pm);
        
        System.out.println("Enter time (in hour): =======================");
        double time = rk.nextDouble() ;
        //night surcharge
        var dayornight = (time>=9) ? "-Extra 15rs nightcharge\n" : "-No extra charges\n";
        System.out.println (dayornight);
        var nightcharge = (time>=9)? (15+netfare) : netfare;
        
        System.out.println ("=================================================");
        System.out.println ("-Net Fare : " + nightcharge ); //calculating initial fare
        System.out.println ("=================================================\n");
        
        System.out.println ("-Are you a local? (true/false)\n "); //checking local for discounts
        var checklocal = rk.nextBoolean();
        
        //checkdiscount criteria
        var discountcriteria = (checklocal == true && km >=6);
        var dis= (discountcriteria)? "-You'll get a 20% discount\n" : "-Either not a local or haven't travelled 6km\n ";
        System.out.println ("=================================================\n");
        System.out.println("\n-"+ dis);
        
        
        //discount amount
        
        var discountamount = (discountcriteria)? (netfare-(0.2*netfare)) : netfare;
        System.out.println ("-Final Total: " + discountamount);
        System.out.println ("=================================================");
    }
}