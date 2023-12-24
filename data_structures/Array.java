package data_structures;

public class Array<T> {
  private T[] array;
  private int capacity = 0;

  public Array(int capacity) {
    if(capacity < 0) throw new IllegalArgumentException("Illegal capacity " + capacity);
    this.capacity = capacity;
    array = (T[]) new Object[capacity];
  }

  public T get(int idx) {
    return this.array[idx];
  }
  public static void main(String[] args) {
    Array array = new Array(4);

    System.out.println(array.get(3));
  }
}
