package Generic;

/*
dibawah ini adalah type parameter(Generic) untuk Class,kita bisa menuliskan <TYPENYA> setelah menuliskan nama classnya,lalu kita bisa menggunakan typenya sebagai tipedata
 */
public class Data<T> {
  private T data;

  public Data(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}

/*
ini adalah contoh class yang tidak menggunakan Generic

public class Data{
  private string data;     //langsung menuliskan tipe datanya
  //constructor

  //Getter dan Setter
}
 */
