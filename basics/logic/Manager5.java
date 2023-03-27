package logic;
import java.util.Scanner;
public class Manager5{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int marks = sc.nextInt();
        String result=null;

        /*if(marks > 35){
            result="pass";
        }
        else{
            result="Fails";
        }
            (condition true)    "":""
        */
       /*  result = marks > 35 ?  "pass" : "fail";*/

       result = marks < 35 ? marks<10? "your a genious":(marks >=10 && marks<=20)?"give some lot of hard works":"Study day and night" :"pass"; 
       System.out.println(result);
    }
}