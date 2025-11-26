import java.util.Scanner; //importing scanner package from java.util
public class mathoperations{
    public static void main(String[]args)
    {
        Scanner ab = new Scanner (System.in); //creating a scanner
    //arithmetic operator
    System.out.println("Enter a number"); // asking for one input
    int a = ab.nextInt();
    System.out.println("Enter another number"); // for another input
    int b = ab.nextInt();
    //printing the use of every operator below
    System.out.println("The sum of two integers is " + (a+b));
    System.out.println("The difference of two integers is " + (a-b));
    System.out.println("The product of two integers is " + (a*b));
    System.out.println("The quotient of two integers is " + (a/b));
    System.out.println("The modulus of two integers is " + (a%b));
    
    //Relational Operators
    System.out.println("Is a>b? " + (a>b));
    System.out.println("Is a<b? " + (a<b));
    System.out.println("Is a==b? " + (a==b));
    System.out.println("Is a!=b? " + (a!=b));
    
    //Logical Operators
    System.out.println("Do you have permit: ? true?orFalse?");
    var haspermit = ab.nextBoolean();
    var canhavegun = (a >= 20 && haspermit);
    System.out.println("Can carry a gun:  " + canhavegun);
    
    System.out.println("Do you have a voterID: ? true or false");
    var hasVoterId = ab.nextBoolean();
    var couldvote = (a >= 18 || hasVoterId);
    System.out.println("Is Eligible: " + couldvote);
    
    //Ternary Operator
    var Moveout = (a >= 18 )? "You're old enough!" : "Still young to live on your own";
    
    System.out.println("Ready to move out?\n age: " + a);

    System.out.println("\n " + Moveout);
    
    
    
    
    
    
    
    
    
    
    //
    }
}