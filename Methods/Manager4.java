class A{
    public void method(boolean a1,String name){
        System.out.println(a1+","+name);
    }
}

class B{
    public int[] methid2(int marks[]){

        for(int temp : marks){
            System.out.println(temp);
        }

        return marks;
    }

    public B method4(){

       B obj=new B();

        return obj;

    }
}

public class Manager4 {

    public static void main(String[] args) {
        
        boolean isAdmin=true;
        String name="Raja";
        int marks[]={100,200,150,50,30};

        A obj = new A();
        B obj1 = new B();

        obj.method(isAdmin, name);
        obj1.methid2(marks);

        //obj1.method4(obj1);

        B obj5= obj1.method4();

        obj5.methid2(marks);
    }



    
}
