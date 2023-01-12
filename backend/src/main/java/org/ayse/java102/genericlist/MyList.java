package org.ayse.java102.genericlist;

public class MyList<T> {

  private static final int DEFAULT_CAPACITY = 10;
  private int capacity;
  private Object[] arr;
  private int nextIndex = 0;

  public MyList() {
    capacity = DEFAULT_CAPACITY;
    arr = new Object[capacity];
  }

  public MyList(int capacity) {
    this.capacity = capacity;
    arr = new Object[capacity];
  }

  private void grow() {
    Object[] temp = new Object[capacity * 2];
    if (capacity >= 0) {
      System.arraycopy(arr, 0, temp, 0, capacity);
    }
    arr = temp;
    capacity = capacity * 2;
  }

  public int size() {
    return nextIndex;
  }

  public int getCapacity() {
    return capacity;
  }

  public void add(T element) {
    if (nextIndex == capacity) {
      grow();
    }
    arr[nextIndex++] = element;
  }

 
}
