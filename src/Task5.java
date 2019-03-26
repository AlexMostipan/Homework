public class Task5 {
    public static void main(String[] args) {
        int a = 10;
        int pos = 2;
        int mask = 1;
        System.out.println("Number after change: " + Integer.toBinaryString(a));
        for (int i = 0; i < pos; i++) {
            mask <<= 1;
        }
        a = a ^ mask;
        System.out.println("Number after change: " + Integer.toBinaryString(a));
    }
}
