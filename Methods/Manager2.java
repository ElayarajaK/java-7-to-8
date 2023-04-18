
public class Manager2 {

    public static void main(String[] args) {
        Manager2  obj =  new Manager2();//object creation
        method(100);
        method1(20112, "Raja");  
        obj.method3(100);      
    }

    static void method(int i){
        System.out.println("1 arg method : "+i);
    }

    static void method1(int id,String name){
        System.out.println(" id : "+id+", name : "+name);
    }

    void method3(int args1){
        System.out.println(args1);
    }
    
}
