import java.io.*;
import java.util.*;
public class courseregistration{
   public static void main(String args[]){
      int coursecode[] = {1,2,3,4};
      String courses[] = {"java","HTML","Python", "CSS3"};
      int capacity[] = {1, 6, 2, 5};
      String description[] = {"Programming", "Designing", "Programming", "Designing"};
      String schedule[] = {"Monday", "Wednesday", "Thursday", "Saturday"};
      
      //display
      System.out.println("================== COURSES OFFERED ==================");
      System.out.println("-----------------------------------------------------");
      System.out.println("Code\tName\tCapacity\tDescription\t\tSchedule");
      System.out.println("-----------------------------------------------------");
      for(int i=0;i<4;i++){
         System.out.println(""+coursecode[i]+"\t\t"+courses[i]+"\t\t"+capacity[i]+"\t\t"+description[i]+"\t\t"+schedule[i]);
      }
      System.out.print("-----------------------------------------------------");
      System.out.println("\n\n");
      
      Scanner s=new Scanner(System.in);
      int choice;
      String ch;
      register reg=new register();
      System.out.print("============== STUDENT COURSES PORTAL ==============");
      do{
      System.out.println("\n\n1. Register course\n2. Drop course\n3. Exit");
      System.out.print("Enter option: ");
      choice=s.nextInt();
      System.out.println("\n\n");
      switch(choice){
         case 1:
            reg.regcourses(courses);
            break;
         case 2:
            reg.dropcourses(courses);
            break;
         case 3:
            System.out.println("===================== THANKYOU =====================");
            System.exit(0);
         default:
            System.out.println("Enter valid choice");
      }
      System.out.println("Do ypu want to register/drop more courses?\n['y' for Yes / 'n' for No]");
      ch=s.next();
   }while(ch!="n");
   }
}

class register{
   
   //Registration
   void regcourses(String courses[]){
      
      Scanner s=new Scanner(System.in);
      System.out.println("-----------------------------------------------------");
      System.out.println("------------------- REGISTRATION --------------------");
      
      System.out.print("Enter ID: ");
      int id=s.nextInt();
      System.out.print("Enter Name: ");
      String sname=s.next();
      System.out.print("Enter course code to register: ");
      int reg=s.nextInt();
      System.out.println("Registered Course "+courses[reg-1]+" successfully\n");
   }
   
   //Drop courses
   void dropcourses(String courses[]){
      
      Scanner s=new Scanner(System.in);
      System.out.println("-----------------------------------------------------");
      System.out.println("------------------- DROP COURSES --------------------");
      System.out.print("Enter ID: ");
      int id=s.nextInt();
      System.out.print("Enter Name: ");
      String sname=s.next();
      System.out.print("Enter course code to drop: ");
      int reg=s.nextInt();
      System.out.println("Dropped Course "+courses[reg-1]+" successfully\n");
   }
}
