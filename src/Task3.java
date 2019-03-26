public class Task3 {
    public static void main(String[] args) {
        sumBitsInt();
        sumBitsShort();
        sumBitsByte();
        sumBitsLong();
    }

    public static void sumBitsInt() {
        int a = Integer.MAX_VALUE;
        int counter = 1;
        while (a != 0) {
            a = a >>> 1;
            counter++;
        }
        System.out.println("Sum bits in int: " + counter);
    }

    public static void sumBitsShort() {
        short a = Short.MAX_VALUE;
        int counter = 1;
        while (a != 0) {
            a = (short) (a >>> 1);
            counter++;
        }
        System.out.println("Sum bits in short: " + counter);
    }

    public static void sumBitsByte() {
        byte a = Byte.MAX_VALUE;
        int counter = 1;
        while (a != 0) {
            a = (byte) (a >>> 1);
            counter++;
        }
        System.out.println("Sum bits in byte: " + counter);
    }

    public static void sumBitsLong() {
        long a = Long.MAX_VALUE;
        int counter = 1;
        while (a != 0) {
            a = a >>> 1;
            counter++;
        }
        System.out.println("Sum bits in long: " + counter);
    }
}
