package GenericApp;

import Generic.Data;

public class CovariantApp {

  public static void main(String[] args) {
    Data<String> objectData = new Data<>("fajar");
    Data<?extends Object> stringvalue = objectData;
    System.out.println(stringvalue); //ini tidak error karna String adalah Turunan dari Object
    proces(objectData);

  }

  public static void proces(Data<?extends Object> data){
    System.out.println("sukses");
    /*
    pada Covariant kita tidak boleh mengubah data(Mensetter) karna bisa mengubah dan merusak data sehingga tidak valid lagi
     */
    // data.setData("bermain");
  }
}
