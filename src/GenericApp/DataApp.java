package GenericApp;

import Generic.Data;


/*
ini contoh pengaksesan tanpa Generic

Data datastring = new Data();
datastring.setData("fajar");
String value = (String) datastring.getData();
sout(value);

 */


public class DataApp {
  public static void main(String[] args) {
    Data<String> stringData = new Data<>("fajar");
    Data<Integer> integerData = new Data<>(21);
    Integer age = integerData.getData();
    String value = stringData.getData();
    System.out.println(value);
    System.out.println(age);

  }



}
