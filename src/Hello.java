public class Hello {

  public static void main(String[] args) {
    //prettier-ignore
    byte  myByteValue  = 50;
    short myShortValue = 500_0;
    int   myIntValue   = 500_000;
    long  myLongValue  = 50_000 + (10 * (myByteValue + myShortValue + myIntValue));
    
    System.out.println(myLongValue);
  }
}
