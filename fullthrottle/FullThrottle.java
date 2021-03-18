
package fullthrottle;


public class FullThrottle {

    //fullthrottle method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  //Speed Method
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  //Main method
  public static void main(String[] args) {
    FullThrottle myCar = new FullThrottle();   
    myCar.fullThrottle();
    myCar.speed(200);
  }
}

