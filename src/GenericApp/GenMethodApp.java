package GenericApp;

import Generic.GenMethod;

public class GenMethodApp {
  public static void main(String[] args) {
    String[] names = {"fajar", "abdillah", "ahmad"};
    Integer[] data = {4,1,8,7,4,0,5};

    System.out.println(GenMethod.count(names));//mencetak panjang array melalui method count
    System.out.println(GenMethod.count(data));//mencetak panjang array melalui method count
  }
}
