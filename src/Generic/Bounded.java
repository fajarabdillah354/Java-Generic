package Generic;
/*
type parameter disini adalah turunan dari Class Number,maka semua class yang turunan dari Number bisa digunakan disini.Bounded type parameter sendiri adalah sebuah feature yang bisa kita gunakan jika ingin menggunakan type parameter tertentu dengan data yang kita butuhkan.pada contoh disini kita hanya ingin menggunakan yang turunan dari Number
 */
public class Bounded<T extends Number> {

  private T data;

  public Bounded(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
