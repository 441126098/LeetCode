public class Son extends Father{

    void fun1(){
        int []a = new int[2];
        a[0] =1;
        a[1] =2;
        fun2(a);
    }
    void fun2(int []a){
        a[1] = 3;
        System.out.println("fun2"+"   "+a[1]);
    }

    public static void main(String[] args) {
        new Son().fun1();
    }
}
