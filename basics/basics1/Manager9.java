import java.util.Scanner;
public class Manager9 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("Enter the no of days");
        int day=input.nextInt();
        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("The");
            break;
            case 3:
            System.out.println("Wen");
            break;
            case 4:
            System.out.println("Thu");
            break;
            case 5:
            System.out.println("Fri");
            break;
            case 6:
            System.out.println("Sat");
            break;
            case 7:
            System.out.println("Sun");
            break;
            default:
            System.out.println("Invalid days");
        }        
    }
}
