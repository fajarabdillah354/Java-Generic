package Generic;

/*
dibawwah ini adalah jenis Generic Class untuk multiple Type parameter,kita dapat memberi beberapa Parameter Type sekaligus dengan syarat harus berbeda,jika ingin menambahkan constructor kita juga harus membuat param yang berbeda
 */
public class MultipleGen<T,V> {
  private T firstName;
  private V lastName;

  public MultipleGen(T firstName, V lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public T getFirstName() {
    return firstName;
  }

  public void setFirstName(T firstName) {
    this.firstName = firstName;
  }

  public V getLastName() {
    return lastName;
  }

  public void setLastName(V lastName) {
    this.lastName = lastName;
  }
}
