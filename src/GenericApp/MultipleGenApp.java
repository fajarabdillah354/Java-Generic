package GenericApp;

import Generic.MultipleGen;

public class MultipleGenApp {
  public static void main(String[] args) {
    MultipleGen<String,Integer> stringIntegerMultipleGen = new MultipleGen<>("fajar",21);
    String name = stringIntegerMultipleGen.getFirstName();
    int umur = stringIntegerMultipleGen.getLastName();
    System.out.println("My name is "+name+" ,saya "+umur+" tahun");
  }
}
