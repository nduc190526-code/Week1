public class bai17 {
    public int reverse(int n) {
        int result = 0;
        int x = n;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (result < Integer.MIN_VALUE / 10 ||
                    (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            result = result * 10 + digit;
        }

        return result;
    }

    public static void main(String[] args) {
        bai17 s = new bai17();

        int[] tests = {123, -123, 120, 0, 1534236469,
                -2147483412, 100, -100};

        for (int n : tests) {
            System.out.println("reverse(" + n + ") = " + s.reverse(n));
        }
    }
}

