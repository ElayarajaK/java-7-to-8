
public class Manager3 {
    String Subject;
   static  String  name="Raja";

    public static void main(String[] args) {
       Manager3 obj =  new Manager3();
       obj.Subject="python";
       obj.name="kamal";
       System.out.println(obj.Subject);
       System.out.println(name);
       Manager3 obj1 = new Manager3();
       System.out.println(obj1.name);
       obj1.Subject="java";
       System.out.println(obj1.Subject);
       Manager3 obj2 = new Manager3();
       obj2.Subject="React";
       System.out.println(obj2.Subject);
       System.out.println(obj2.name);
    }
    
}
