import java.util.*;
public class genericAns{
  public static <T> void result(T n)
  {
    try
    {
      if(n.getClass().getName()=="String")
      {
        throw new Exception();
      }
      else {
        int a=Integer.parseInt(String.valueOf(n));
        System.out.println("2/3 of "+n+" is : " +(((int)a*2)/3));
      }
    } 
    catch(Exception e) 
    { 
      System.out.println("ERROR! String found");
    } 
  }
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    result(a);
  }
}