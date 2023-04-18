public class Manager1 {
    static void method3(){
        System.out.println("from method 3");
        method4();
    }   
    public static void main(String[] args) {       
        System.out.println("Hello");
        method1();
        System.out.println("Main End");        
    }
    //declarationmethod
    static  void method1() {
        System.out.println("From method 1");
        method2();        
    }
    static void method2(){
        method3();
        System.out.println("from method 2");
    }

    static void method4(){
        System.out.println("ffrom method 4");
    }
}
