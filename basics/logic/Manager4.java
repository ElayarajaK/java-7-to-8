package logic;
import java.util.Scanner;
public class Manager4{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int marks = sc.nextInt();
        String result=null;
        if(marks < 40){
            if(marks < 10)
            {
                result="you are Genious";
            }
            else if(marks >=10 && marks <=20){
                result="Give Lots of hardWor1k";
            }
            else if(marks >20 && marks <=30){
                result="Studey hardly";
            }
            else{
               result = "Request with staff";
            }
        }
        else if(marks > 40 && marks<50){
            if(false){

            }
            else{
                if(false){

                }
                else{
                    result="Nestef else if";
                }
                

            }
        }
        else{
            if(true)
            {
                if(false)
                {

                }
                else if(false){

                }
                else if(true){
                    result="from nested else if";
                }
                else{

                }
            }
        }

        System.out.println(result);
    }
}