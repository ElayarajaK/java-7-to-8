public class Manager1 {

    /* and(&&)          or(||)    Not(!)
                &&
            A         B            C        Result
     *     
     *   true       true          false     false
     *   true       false         false     false
     *  false      false          false     false
     *  true      true           true      true
     * 
     * (||)
     * 
     * A       B        C       Result
     * t       t       f         t
     * f       f      t          t 
     * t      t       t          t
     * f       t       t         t
     * f       f       f         f
     */


    public static void main(String[] args) {
        System.out.println( !(10 == 10) &&(20 > 5) && (100 > 200));

        System.out.println((10== 20) || !(20==20));

        System.out.println(((10 < 5) || (20!=20)) || (20 > 5) || ((30 < 10) && (10 < 200)));
    }    
}
