import java.io.*;
import java.util.*;
//main class
public class numbergame{
 public static void main(String args[]){
 int random;
 Random rand=new Random();
 random=rand.nextInt(100);
 numbergame ng=new numbergame();
 ng.numgame(random);
 }
}
//game class
class numbergame{
 
 public void numgame(int random_num){
 int guess,i=1,score=1;
 Scanner s=new Scanner(System.in);
 System.out.println("******* WELCOME TO NUMBER GAME *******");
 System.out.println("You have 5 attempts!");
 
 //loop start
 while(i<=5){
 System.out.println("_______________________________________\n");
 System.out.println("****ATTEMPT "+i+"****");
 System.out.println("Enter your guess");
 guess=s.nextInt();
 
 //guess comparison
 if(random_num==guess){
 System.out.println("Your guess was right!");
 break;
 }
 else if(random_num<guess){
 System.out.println("Guess is greater than the actual number!");
 }
 else{
 System.out.println("Guess is less than the actual number!");
 }
 i++;
 
 //attempt limit exceed
 if(i==6){
 System.out.println("\nYou have crossed the maximum attempt limit!\n\n\t\t****** BETTER LUCK NEXT  TIME ******");
 }
 }
 //loop end
 
 
 //score calculation
 if(i==1){
 score=100;
 System.out.println("Your score is "+score);
 }
 
 if(i>=2 && i<=3){
 score=50;
 System.out.println("Your score is "+score);
 }
 
 if(i>=4 && i<=5){
 score=25;
 System.out.println("Your score is "+score);
 }
 }
}
