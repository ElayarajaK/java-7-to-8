public class Manager5 {
    public static void main(String[] args) {
        int i=0;
        int j=10;
        i=i++ + ++i;
        // 0  + 1

        System.out.println(j);
        System.out.println(j--);//10
        System.out.println(j--);//9
        System.out.println(j);//8

        System.out.println(i);
    }
}
