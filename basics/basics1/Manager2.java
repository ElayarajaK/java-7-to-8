package basics1;

public class Manager2 {

    public static void main(String[] args) {
        for(int i=0;i<=5;i++){

            for(int j=0;j <5;j++){
                System.out.print("inner room "+j+",");
            }
            System.out.println();
            System.out.print("Outer room"+i);
            System.out.println();
        }
    }
}
