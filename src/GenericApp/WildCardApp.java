package GenericApp;

import Generic.Bounded;
import Generic.Data;

public class WildCardApp {

  public static void main(String[] args) {
    printSome(new Data<>("FAJAR"));
    printSome(new Data<>(100));
    printSome(new Data<MultipleBoundedApp.Manager>(new MultipleBoundedApp.Manager()));//ini bisa karna kita menggunakan WildCard
  }

  public static void printSome(Data<?> data){
    System.out.println(data.getData());
  }
}
