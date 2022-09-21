package GenericApp;

public class MultipleBoundedApp {

  public static void main(String[] args) {
    // var manajer = new Date<>(new Manager());// error karena untuk Class Manager tidak implement ke Class interface

    /*
    dibawah ini tidak error karena Class vicePresident implement ke interfacenya
     */
    var vp = new Date<>(new vicePresident());

  }

  public static interface sayHello{
    void hello(String name);
  }

  public abstract static class Employee{


  }

  public static class Manager extends Employee{


  }

  public static class vicePresident extends Employee implements sayHello{


    @Override
    public void hello(String name) {

    }
  }

  /*
  * kita hanya bisa menambahkan type parameter berjenis child,tidak boleh memakai object parent lagi.karena di  java hanya boleh memiliki 1 parent,sedangkan untuk child boleh banyak.
  * yang dimaksud child disini adalah class interface

   */
  public static class Date<T extends Employee & sayHello>{
    private T data;

    public Date(T data) {
      this.data = data;
    }

    public T getData() {
      return data;
    }

    public void setData(T data) {
      this.data = data;
    }
  }

}
