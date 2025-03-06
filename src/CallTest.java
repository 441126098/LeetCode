import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallTest implements Callable {
    @Override
    public Object call() throws Exception {
        return "hello world";
    }

    public static void main(String[] args){
        FutureTask<String> futureTask = new FutureTask<String>(new CallTest());
        new Thread(futureTask).start();
        try {
            String result = futureTask.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}