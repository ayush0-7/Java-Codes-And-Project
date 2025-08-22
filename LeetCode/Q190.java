public class Q190 {
    public static void main(String[] args) {
        int n = 43261596;
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }
        System.out.println(result);

    }
}
