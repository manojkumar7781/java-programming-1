interface Add{  
    int add(int a,int b);
}
    interface Sub{
    int difference(int a,int b);
    }
    interface Dif{
    int product(int a,int b);
    }
	
    interface Div{
    	int safeDivision(int a,int b);
    } 
public class Calculator{    
    public static void main(String[] args) {  
          
          
        Add a1=(a,b)->(a+b);  
        System.out.println(a1.add(20,10));

        Sub a2=(a,b)->(a-b);  
        System.out.println(a2.difference(20,10)); 

        Dif a3=(a,b)->(a*b);  
        System.out.println(a3.product(20,10));

        Div a4=(a,b)->(a/b);  
        System.out.println(a4.safeDivision(20,10));
    }  
}