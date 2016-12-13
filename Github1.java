
package github.pkg1;
import java.util.Scanner;
class calculation{
    double a,b,sum;
 public  void add(double a,double b)
    {
       sum=a+b;
       System.out.println("sum is:"+ sum);
    }
 
   calculation(double no1,double no2)
   {
       no1=a;
       no2=b;
   }
}
public class Github1 {

    
    public static void main(String[] args) {
    System.out.println("take two numbers for operation:" );   
    Scanner scan=new Scanner(System.in);
     double a=scan.nextDouble();
       System.out.println("first number :" + a);   
       double b=scan.nextDouble();
       System.out.println("second number :" + b);
       calculation addsubtract=new calculation(a,b);
       System.out.println("");
       addsubtract.add(a,b);    
    }
    
}
