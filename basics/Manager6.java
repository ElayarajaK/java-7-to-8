public class Manager6 {
    public static void main(String[] args) {
        int i=0;
        int j=10;
        int k=0;

        k= i++ + i + j++ + --j + j + i-- + j++ + j+ ++i + i + i++ + j++;
    //      0  + 1 +  10 +  10 + 10 + 1  + 10  + 11+ 1 +  1 +  1  +   11     
           System.out.println(i);
           System.out.println(j);
           System.out.println(k);
        System.out.println(i++);//0
        System.out.println(++i);//2
        System.out.println(i--);//2
        System.out.println(--i);//0
    }
}
