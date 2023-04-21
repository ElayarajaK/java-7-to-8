class A1{
    int i;

    {
        System.out.println("From insta");
    }
    {
        System.out.println("From insta 1");
    }

    A1(){
        System.out.println("Const");
    }
}

public class Manager1 {

    {
        System.out.println("i am fro instance 1");
    }
    public static void main(String[] args) {
      new A1();
      new A1();
      new A1();
      new A1();
      
    }

    static{
        System.out.println("i am from static block");

        
    }
    
}
