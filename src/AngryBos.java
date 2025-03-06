//1052. 爱生气的书店老板
//

public class AngryBos {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int ans = 0, currentBonus = 0, maxBonus;
        for (int i = 0; i < X; i++) {
            if (grumpy[i] == 0)
                ans += customers[i];
            if (grumpy[i] == 1)
                currentBonus += customers[i];
        }
        maxBonus = currentBonus;
        for (int i = X; i < customers.length; i++) {
            if (grumpy[i - X] == 1)
                currentBonus -= customers[i - X];
            if (grumpy[i] == 1)
                currentBonus += customers[i];
            if (currentBonus > maxBonus)
                maxBonus = currentBonus;
            if (grumpy[i] == 0)
                ans += customers[i];
        }
        return ans + maxBonus;
    }

    public static void main(String[] args) {
        int customers[] = {1, 0, 1, 2, 1, 1, 7, 5};
        int grumpy[] = {0, 1, 0, 1, 0, 1, 0, 1};
        System.out.print(new AngryBos().maxSatisfied(customers, grumpy, 3));
    }
}
