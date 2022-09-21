package GenericApp;

import Generic.Bounded;

public class BoundedApp {

  public static void main(String[] args) {
    Bounded<Integer> integerBounded = new Bounded<>(354);//sukses karna Integer turunan dari Class Number
    System.out.println(integerBounded);
    var value = integerBounded.getData();
    System.out.println(value);
    // Bounded<String> stringBounded = new Bounded<String>("fajar"); //error karna kita hanya ingin mengambil yang extends dari Class Number
  }
}
