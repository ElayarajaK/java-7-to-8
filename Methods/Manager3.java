
public class Manager3 {
        static int i=0;    
    public static void main(String[] args) {
       System.out.println("from main");
       method1(null);
        
    }

    public static void method1(String[] args){
        System.out.println("from method1 ");
        i++;
        if(i==1)
        {
         main(null);
        }

        
    }
}
