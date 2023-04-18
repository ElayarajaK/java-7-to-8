public class Manager2 {
    static int i=10;
    boolean b1;
   
    public static void main(String[] args) {
        int i=100;

        System.out.println(i);
        System.out.println(Manager2.i);

        Manager2 obj1 = new Manager2();
        System.out.println(obj1.b1);

        System.out.println(obj1.i);
       
    }
}
