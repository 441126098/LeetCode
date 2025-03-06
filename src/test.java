import java.io.IOException;
import java.util.*;

public class test {
    public static void main(String[] args) {
        //List<String> te = new List<String>();             //abstract 无法实例化
        double i = 1;
        double rate = 0.05;
        for (int j = 0; j < 30; j++) {
            i = i * (1 + rate);
            System.out.println(i);
        }
    }
}
