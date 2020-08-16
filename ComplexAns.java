import java.util.*;
class Complex{
  int real;
  int imag;
  public Complex(int r, int i){
    real = r;
    imag = i;
  }

  public static Complex add(Complex a, Complex b){
    return new Complex((a.real+b.real),(a.imag+b.imag));
  }

  public static Complex diff(Complex a, Complex b){
    return new Complex((a.real-b.real),(a.imag-b.imag));
  }

  public static Complex product(Complex a, Complex b){
    return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
  }

  public void printComplex(){
    if(real == 0 && imag!=0){
      System.out.println(imag+"i");
    }
    else if(imag == 0 && real!=0){
      System.out.println(real);
    }
    else{
      System.out.println(real+"+"+imag+"i");
    }
  }

}

class ComplexAns{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int p,q,r,s;
    System.out.println("enter the Real part one");
    p=sc.nextInt();
    System.out.println("enter the Imaginary part one");
    q=sc.nextInt();
    System.out.println("enter the Real part two");
    r=sc.nextInt();
    System.out.println("enter the Imaginary part two");
    s=sc.nextInt();
    Complex c = new Complex(p,q);
    Complex d = new Complex(r,s);

    Complex e = Complex.add(c,d);
    Complex f = Complex.diff(c,d);
    Complex g = Complex.product(c,d);
    e.printComplex();
    f.printComplex();
    g.printComplex();
  }
}