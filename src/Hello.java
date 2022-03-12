public class Hello {
    public static void main(String[] args) {

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE ;
        System.out.println("Byte maximum value = " + myMaxByteValue);
        System.out.println("Byte minimum value = " + myMinByteValue);
        
        // A Byte automatically gets converted to an int by the compiler if its out of range.
        System.out.println("Busted max value = " + (myMaxByteValue + 1111)); // overflow;
        System.out.println("Busted min value = " + (myMinByteValue - Integer.MIN_VALUE - 124)); // underflow;

    }
}
