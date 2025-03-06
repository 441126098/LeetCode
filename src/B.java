import java.sql.SQLSyntaxErrorException;

public class B extends C{

    private A a = new A();
    private int b =1;
    B(){
        System.out.println("B 初始化");
    }

    {
        int bage = 9;
    }

    int test(){
        try{
            System.out.println("tyr方法");
            return 100;
        }
        catch (Exception e){

        }
        finally {
            System.out.println("finally方法");
        }
        return 0;
    }

    public static void main(String[] args) {
        B b = new B();

        System.out.println(new B().test());
    }

}
