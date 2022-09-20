package Generic;

/*
ini adalah contoh Generic Method,kita dapat menambahkan kata kunci Static atau tidak menggunakannya,Untuk Type parameternya ditulis setelah static(jika memakainya)..dan jika kita ini memberi parameter pada method kita harus menggunakan typenya
 */
public class GenMethod {
  public static  <T> int count(T[] array){
    return array.length;
  }

}
