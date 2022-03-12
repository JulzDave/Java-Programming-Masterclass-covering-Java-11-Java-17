public class Hello {
    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer maximum value = " + myMaxIntValue);
        System.out.println("Integer minimum value = " + myMinIntValue);
        System.out.println("Busted max value = " + (myMaxIntValue + 1)); // overflow;
        System.out.println("Busted min value = " + (myMinIntValue - 1)); // underflow;

    }
}
