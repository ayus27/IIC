import java.util.Scanner;
public class GradeEvaluator{
    public static void main (String[]args){
        Scanner gd = new Scanner (System.in);
        
        System.out.println("Enter a grade: ");
        
        double grade = gd.nextDouble();
        String result = (40<=grade)? "Pass":"Fail";
        System.out.println ("The student is "+ result);
        
        
    }
}