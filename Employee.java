import java.io.*;
import java.util.ArrayList;
import java.util.stream.*;
public class Employee{  
 int empid;
 String empName;
 String empDesignation; 
 int empSalary;
 String empLocation;    
  
 Employee(int empid, String empName,String empDesignation,int empSalary,String empLocation){  
 this.empid=empid;  
 this.empName=empName;
 this.empDesignation=empDesignation;
 this.empSalary=empSalary;
 this.empLocation=empLocation;
 }  
   
 public String toString(){//overriding the toString() method  
  return empid+" "+empName+" "+empDesignation+" "+empSalary+" "+empLocation; 
 }  
 public static void main(String args[]){  
    
     ArrayList<Employee>employees=new ArrayList();
     employees.add(new Employee(1,"manoj","Engineer",100000,"Guntur"));
     employees.add(new Employee(2,"kumar","Engineer",200000,"Martur"));
     employees.add(new Employee(3,"reddy","Scientist",400000,"Vijaywada"));
     employees.add(new Employee(4,"srikanth","Engineer",10000,"Hydreabad"));
     employees.add(new Employee(5,"sai","Engineer",600000,"Mangalagiri"));
     employees.add(new Employee(6,"ram","Doctor",1000000,"Mumbai"));
     employees.add(new Employee(7,"suroj","Engineer",40000,"Kolkata"));
     employees.add(new Employee(8,"siva","Pilot",60000,"Delhi"));
     employees.add(new Employee(9,"hemanth","Police",40000,"Chennai"));
     employees.add(new Employee(10,"subbu","Lawyer",30000,"Kochi"));

     employees.stream().map(a->a.empName).forEach(a->System.out.println(a));;
     
     employees.stream().map(c->c.empSalary).filter(b->b>50000).forEach(b->System.out.println(b));;
     employees.stream().map(c->c.empLocation).filter(c->c.startsWith("M")).forEach(c->System.out.println(c));;
     employees.stream().map(d->d.empDesignation).filter(d->d.endsWith("e")).forEach(d->System.out.println(d));;
 }  
}  