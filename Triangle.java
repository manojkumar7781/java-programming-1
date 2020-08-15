import java.util.*;

public class Triangle{
     
    public static void main(String[] args) {
         
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter length of first side of triangle:");
        double a = sn.nextDouble();
         
        System.out.println("Enter length of second side of triangle:");
        double b = sn.nextDouble();
         
        System.out.println("Enter length of third side of triangle:");
        double c = sn.nextDouble();
         
        Triangle at   = new Triangle();
            double area = at.calculateArea(a,b,c);        
            System.out.println("Area = "+area);
    }
    public double calculateArea(double a, double b, double c) {
        double p = (a+b+c)/2;       
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
 
    