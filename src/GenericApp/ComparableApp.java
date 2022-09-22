package GenericApp;

import Generic.PersonComparable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ComparableApp {
  public static void main(String[] args) {
    PersonComparable[] people = {
            new PersonComparable("fajar","jakarta"),
            new PersonComparable("sandi","karawang"),
            new PersonComparable("ryan","jogya")

    };

    Arrays.sort(people);
    System.out.println(Arrays.toString(people));//saat melakukan print disini nanti akan di urut namanya berdasarkan urutan alfabetnya.ini karna kita menggunakan Interface Comparable yang di dalamnya terdapat method compareTo(Object o)

  }

}
