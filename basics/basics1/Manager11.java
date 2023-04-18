import java.util.Scanner;
public class Manager11 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("Enter the no of days");
        int day=input.nextInt();
        String name=null;
        int values = switch(day){
            case 1,2,3->1234;
           case 8->10002;
            case 9->10003;
            case 4->10005;
            case 5,11,12,13->1006;
            case 6->{
                yield 100;
            }
          case 7->10045;
           default->10007;
        };        

        System.out.println(values);
    }

}
