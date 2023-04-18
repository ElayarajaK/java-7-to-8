import java.util.Scanner;
public class Manager10 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("Enter the no of days");
        int day=input.nextInt();
        switch(day){
            case 1,2,3->System.out.println("Mon");
           case 8->System.out.println("The");
            case 9->System.out.println("Wen");
            case 4->System.out.println("Thu");
            case 5,11,12,13->System.out.println("Fri");
            case 6->System.out.println("Sat");
          case 7->System.out.println("Sun");
           default->System.out.println("Invalid days");
        }        
    }
}