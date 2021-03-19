package square;

public class Square {

 // create a method
  public static int square(int num) {

    // return statement
    return num * num;
  }
  public static double squareroot(double num){
      System.out.println("Square root value of 100 is:"+" "+Math.sqrt(num));
      return 0;
  }
  
  public static void main(String[] args) {
    int result;

    // call the method
    // store returned value to result
    result = square(100);
    squareroot(100);

    System.out.println("Squared value of 100 is: " + result);
  }
}
