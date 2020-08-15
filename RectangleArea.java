import java.util.*;
import java.io.*;
class Rectangle{

public void display(int width,int height){
	System.out.println(width+" "+height);
}	
}

class RectangleArea extends Rectangle{
static int width;
static int height;
public void read_input(){
 	Scanner sc=new Scanner(System.in);
 	width=sc.nextInt();
 	height=sc.nextInt();
}
public void display(){
	System.out.println(width*height);
}
public static void main(String[] args) {
RectangleArea o=new RectangleArea();
o.read_input();
o.display(width,height);
o.display();

}



}