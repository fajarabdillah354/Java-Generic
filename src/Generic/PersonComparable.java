package Generic;

public class PersonComparable implements Comparable<PersonComparable> {
  private String name;
  private String address;


  public PersonComparable(String name, String address) {
    this.name = name;
    this.address = address;

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }



  @Override
  public String toString() {
    return "PersonComparable{" +
            "name='" + name + '\'' +
            '}';
  }

  @Override
  public int compareTo(PersonComparable o) {
    return name.compareTo(o.name);
  }
}
