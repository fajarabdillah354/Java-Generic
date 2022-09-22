package GenericApp;


import Generic.PersonComparable;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {

  public static void main(String[] args) {
    /*
    anggap saja Class PersonComparable adalah class yang tidak diketahui pemiliknya
     */
    PersonComparable[] people = {
            new PersonComparable("fajar","jakarta"),
            new PersonComparable("sandi","karawang"),
            new PersonComparable("ryan","jogya")

    };
    /*
    kita dapat melakukan pengurutan dengan Comparator dimana class yang akan di Comparasinya tidak bisa diubah lagi
     */

    Comparator<PersonComparable> comparator = new Comparator<PersonComparable>() {
      @Override
      public int compare(PersonComparable o1, PersonComparable o2) {
        return o1.getAddress().compareTo(o2.getAddress());
      }
    };

    Arrays.sort(people,comparator);
    System.out.println(Arrays.toString(people));
  }
}
