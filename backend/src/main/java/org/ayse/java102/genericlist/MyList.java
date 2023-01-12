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

  public Object removeObject(T element) {
    for (int i = 0; i < nextIndex; i++) {
      if (arr[i] == element) {
        return remove(i);
      }
    }
    return null;
  }

  public Object remove(int index) {
    if (index < 0 || index > nextIndex) {
      return null;
    }
    Object[] temp = arr;
    Object result = arr[index];
    if (nextIndex - 1 - index >= 0) {
      System.arraycopy(arr, index + 1, temp, index, nextIndex - 1 - index);
      nextIndex--;
      arr = temp;
    }
    return result;
  }

  public Object get(int index) {
    if (index > nextIndex || index < 0) {
      return null;
    }
    return arr[index];
  }

  public Object set(int index, T data) {
    if (index > nextIndex || index < 0) {
      return null;
    }
    arr[index] = data;
    return data;
  }

  public String toString() {
    StringBuilder st = new StringBuilder();
    st.append("[");
    for (int i = 0; i < nextIndex; i++) {
      st.append(arr[i]).append(",");
    }
    st.deleteCharAt(st.length() - 1);
    st.append("]");
    return st.toString();
  }
}
