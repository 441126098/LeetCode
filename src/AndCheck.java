import java.util.HashMap;
import java.util.Scanner;

public class AndCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), p = in.nextInt();
        HashMap map = new HashMap();
        int group = 0;
        for (int i = 0; i < m; i++) {
            int x = in.nextInt(), y = in.nextInt();
            if (!map.containsKey(x) && !map.containsKey(y)) {
                map.put(x, group);
                map.put(y, group);
                group++;
            } else {
                if (map.containsKey(x) && map.containsKey(y)) {

                } else if (map.containsKey(x))
                    map.put(y, map.get(x));
                else {
                    map.put(x, map.get(y));
                }
            }
        }

        for (int j = 0; j < p; j++) {
            int x = in.nextInt(), y = in.nextInt();
            if (map.containsKey(x) == map.containsKey(y)) {
                System.out.print("yes");
            } else {
                System.out.print("no");
            }
        }
    }
}
