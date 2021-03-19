
public class NameAge {
//age method
	static void myMethod(String fname, int age) {
	System.out.println(fname + " is " + age);
}
//color method
	static void newMethod(String fname, String color) {
	System.out.println(fname + " Favorite color is " + color);
}
//main method
  public static void main(String[] args) 
{
    myMethod("Gon", 12);
    myMethod("Killua", 11);
    myMethod("Kurapika", 19);
	System.out.println();
	newMethod("Gon","Green");
	newMethod("Killua","White");
	newMethod("Kurapika","Red");
  }
}

