
public class Manager1 {
    static int id;
    String name;


      
    //static int i;
    /*1. 3 type of variable
     *   1. local variable(inSide menthod or conditions or loops )
     *            local variable value sould have been initi
     *             you cant able to any other blocks
     *            local variable  stack memmory 
      *   2. Globel variable (static variable)
            jvm will provide default values
            int 0,string null ,bool false
            globel variable data utilize heap area
     *   3. Instance variable(non-static variable)
     *       ns - memmory allocate heap area
     *       ns -  default values jvm will provide
             ns- can't access into static area directly
                 to access in static area we need creat the object
             
                 new keywords we can vcreate the object for particular class

     */
    public static void main(String[] args) {        
      int i=100;  
        System.out.println(id);

        if(true){
            int value=200;

           Manager1 obj =  new Manager1();//proceture to creating the object
            System.out.println(obj.name);
        }

       
       
    }
}
