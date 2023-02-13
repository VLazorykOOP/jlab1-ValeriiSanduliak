import java.util.Scanner;
public class Task1 {  
    public static void main(String[] args) {
    //1 
    //float->float\
    System.out.println("1. input double out res double ");
    System.out.print("Input x= ");
    Scanner in = new Scanner(System.in);
    double x = in.nextDouble();
    System.out.print("Input y= ");
    double y = in.nextDouble();
    double res;
    res = (1/(x*y))+(1/(Math.pow(x,2)+Math.pow(y,2)))*(x-y);
    System.out.println("res " + res); 

   //2 
   System.out.println("2. input integer out res double ");
   System.out.print("Input x1 = ");
   int x1 = in.nextInt();
   System.out.print("Input y1 = ");
   int y1 = in.nextInt();
   double res1;
   res1= (1/(x1*y1))+(1/(Math.pow(x1,2)+Math.pow(y1,2)))*(x1-y1);
   System.out.println("res1 " + res1); 

   System.out.println("3. input double out res integer ");
    System.out.print("Input x= ");
    double x2 = in.nextDouble();
    System.out.print("Input y= ");
    double y2 = in.nextDouble();
    
    int res2 = (int)Math.round((1/(x2*y2))+(1/(Math.pow(x2,2)+Math.pow(y2,2)))*(x2-y2));
    System.out.println("res2 " + res2); 
     in.close();
    }


    

}