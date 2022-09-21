package GenericApp;

import Generic.Data;

public class InvariantApp {
  /*
  dalam invariant kita dilarang mensubstitusi type dari Parent ke Child atau dari Child ke Parent,posisi di bawah ini CLass Object adalah Parent dari Class String,maka dilarang untuk mensubstitusi
   */
  public static void main(String[] args) {
    Data<Object> stringData = new Data<>("FAJAR ABDILLAH AHMAD");
    Data<String> objectData = stringData;    // ini akan error karna kita mensubstitusi dari Parent(Object) ke dalam Child(String)

    sayHello(stringData);//ini akan error karna method sayHello mempunyai parameter type Integer sedangkan kita substitusikan String ke dalam Integer maka Error
  }

  public static void sayHello(Data<Integer> integerData){
    System.out.println(100);

  }

}
