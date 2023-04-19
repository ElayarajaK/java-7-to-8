public class Manager1 {
    public static void main(String[] args) {
      short s1=(short)100;
      int  s2 =s1;
      long l1 = s2;
     int i1 =(int) l1;
        System.out.println(s1); 
        System.out.println(s2);
        int result = method1(10,10);
        System.out.println(result);
    }    

    public static int method1(int i,int j){
        System.out.println("from method");
        return i+j;
    }




}
