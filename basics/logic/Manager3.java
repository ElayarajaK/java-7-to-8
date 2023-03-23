package logic;
import java.util.*;
public class Manager3 {

 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Student marks");
    int marks=input.nextInt();

    if(marks <  40){
        System.out.println("Need More Effort");
    }
    else if((marks > 40)&&(marks < 55)){
        System.out.println("D Grade Marks");
    }
    else if((marks>=55)&&(marks<=70)){
        System.out.println("C Grade Marks");
    }
    else if((marks > 70)&&(marks<90)){
        System.out.println("B Grade");
    }
    else{
        System.out.println("A grade");
    }
 }   
    
}