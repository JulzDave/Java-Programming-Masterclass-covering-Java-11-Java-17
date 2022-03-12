public class Hello {
    public static void main(String[] args) {

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE ;
        System.out.println("Short maximum value = " + myMaxShortValue);
        System.out.println("Short minimum value = " + myMinShortValue);
        
        // A Short automatically gets converted to an int by the compiler if its out of range.
        System.out.println("Busted max value = " + (myMaxShortValue + 1111)); // overflow;
        System.out.println("Busted min value = " + (myMinShortValue - Integer.MIN_VALUE - 124)); // underflow;

    }
}
