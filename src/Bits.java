//338. 比特位计数

public class Bits {
    public int[] countBits(int num) {
        int[] bits = new int[num];
        bits[0] = 0;
        int highbits = 0;
        for (int i = 1; i <= num; i++) {
            if ((i & (i - 1)) == 0)
                highbits = i;
            bits[i] = bits[i - highbits] + 1;
        }
        return bits;
    }
}
