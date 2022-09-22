package Generic;

/*
TypeErasure adalah kondisi dimana kita menghilangkan info Generic pada sebuah Class.hal ini jika dilakukan tidak menimbulkan error saat dicompile namun akan error saat aplikasi di running.ini dikarenakan kadang kita memasukan Type yang tidak sama seperti kita mengkonversi dari String ke integer
 */
public class TypeErasure {
  public static void main(String[] args) {
    /*
    pada class data dibawa ini sebenarnya mempunyai type parameter namun disini kita hilangkan
     */
    Data data = new Data("fajar abdillah ahmad");
    Data<Integer> integerData = (Data<Integer>) data; // proses pengkonversi dari String ke Integer
    var print = integerData.getData();
    System.out.println(print);

  }


  /*
  Nb : jika kita menggunakan Info Generic maka saat Compile akan kelihatan garis merah di bawah source code yang menandakan telah terjadi error
   */
}
