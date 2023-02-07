import java.util.Scanner;
public class Task1 {

   public static void Task1_1(){
      System.out.print("Input x= ");
      Scanner in = new Scanner(System.in);
      Double x = in.nextDouble();
      System.out.print("Input y= ");
      Double y = in.nextDouble();
      System.out.print("x=" +x + " y=" +y);

      Double r1 = 1/(x*y);
      Double r2 = 1/Math.sqrt(x)+Math.sqrt(y);
      Double r3 = (x-y);
      Double result = r1+r2*r3;
      System.out.print("Res=" +result);
       in.close();
    }
    
  
    public static void main(String[] args) {
    //1 
    //float->float
    System.out.println("Task_1_1");
    Task1_1();
   
    }


    

}