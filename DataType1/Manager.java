public class Manager{
    public static void main(String[] args) {
        

        /*
            primitive data types
            -128 to 127          
            auto upcating     
            byte  -> short  -> int -> long -> float ->double
            0          1        2      4       4         8  
            expilicit downcasting
            byte  <- short  <- int <- long <- float <- double
                 boolean
                 char

            non primitive data type
         * 
         */

         byte b1 = -128;
         System.out.println(b1);

        System.out.println("byte : "+Byte.MAX_VALUE +"," +Byte.MIN_VALUE); 
        System.out.println("short : "+Short.MAX_VALUE +"," +Short.MIN_VALUE); 
        System.out.println("int : "+Integer.MAX_VALUE +"," +Integer.MIN_VALUE); 
        System.out.println("long : "+Long.MAX_VALUE +"," +Long.MIN_VALUE); 
        System.out.println("float : "+Float.MAX_VALUE +"," +Float.MIN_VALUE); 
        
             
    }
}