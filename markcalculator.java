import java.io.*;
import java.util.*;

//main class
public class markcalculator{
    public static void main(String args[]){
        int sub, tot=0, avg;
        String name=null;
        Scanner s=new Scanner(System.in);
        
        //get input name and marks
        System.out.print("Enter Name: ");
        name=s.next();
        System.out.println("\nEnter Marks");
        for(int i=0;i<5;i++){
           System.out.print("Subject "+(i+1)+": ");
           sub=s.nextInt();
           tot+=sub;
        }
        average_grade ag=new average_grade();
        ag.avg_grade(tot, name);
    }
}

//average and grade calculation class
class average_grade{
   public void avg_grade(int tot, String name){
      int avg=tot/5;
      char grade;
      
      //garde calculation
      if(avg<=100 && avg>80)
         grade='O';
      else if(avg<=80 && avg>60)
         grade='A';
      else if(avg<=60 && avg>40)
         grade='B';
      else if(avg<=40 && avg>30)
         grade='C';
      else
         grade='D';
         
      display dis=new display();
      dis.marksheet(name, tot, avg, grade);
   }
}

//display class
class display{
   public void marksheet(String name, int tot, int avg, char grade){
      System.out.println("==== MARKSHEET ====");
      System.out.println("Name : "+name);
      System.out.println("Total : "+tot);
      System.out.println("Average : "+avg);
      System.out.println("Grade : "+grade);
   }
}








