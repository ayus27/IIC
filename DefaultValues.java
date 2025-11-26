public class DefaultValues{
    
    boolean b;
    byte a;
    short c;
    int i;
    long l;
    float f;
    double d;
    char ch;
    
    public static void main (String [] args){
        DefaultValues obj = new DefaultValues(); //creating a obj
        System.out.println ("value of int "+ obj.i);
        System.out.println ("Default value of all data types:\n "+ obj.i + obj.a + obj.c + obj.l + obj.ch + obj.b + obj.d +obj.f);
        
        // This wont work for local variables because local variables 
        //need a literal to work or else it will give compile time error
    }
}