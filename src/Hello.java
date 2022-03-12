public class Hello {
    public static void main(String[] args) {
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long maximum value = " + myMaxLongValue);
        System.out.println("Long minimum value = " + myMinLongValue);
        System.out.println("Busted max value = " + (myMaxLongValue + 1)); // overflow;
        System.out.println("Busted min value = " + (myMinLongValue - 1)); // underflow;
        // long number literals should contain the suffix 'L' 
    }
}
