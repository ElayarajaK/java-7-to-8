package logic;

public class Manager2 {
    public static void main(String[] args) {
        int i =300;
        int j =2000;
        int k=1000;
       

        if((i > j)&&(i > k)){
            System.out.println("Max val i : "+i);
        }
        else if((j > i)&&(j > k)){
            System.out.println("Max val j : "+j);
        }
        else{
            System.out.println("Max val is : k "+k);
        }
    }
    
}
