public class Manager4 {
    
    /*
     * post inc(i++)  next usage one value will increase
     * pre inc(++i)  at a time one will increase
     * post dec(i--)
     * pre dec(--i)
     */
    public static void main(String[] args) {
    int i=0;
    //int number=0xabcd123;
    
    System.out.println(i);  //0    
    System.out.println(++i);//1
    System.out.println(i);//1
    System.out.println(i);//1
    }
    
}
