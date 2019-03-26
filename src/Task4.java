public class Task4 {
    public static int subtraction(int a, int b) {
        while (b != 0) {
            int borrow = (~a) & b;
            a = a ^ b;
            b = borrow << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        int m = 48;
        int n = 16;

        while (m != n) {
            if (m > n) {
                m = subtraction(m, n);
            } else {
                n = subtraction(n, m);
            }

        }
        System.out.println(m);
    }
}
