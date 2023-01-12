package org.ayse.java102.genericlist;

/**
 * @author aysedemireldeniz
 */
public class MyList<T> {

  private static final int DEFAULT_CAPACITY = 10;
  private int capacity;
  private Object[] arr;
  private int lastIndex = 0;

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
    return lastIndex;
  }

  public int getCapacity() {
    return capacity;
  }

  public void add(T element) {
    if (lastIndex == capacity) {
      grow();
    }
    arr[lastIndex++] = element;
  }

  public Object removeObject(T element) {
    for (int i = 0; i < lastIndex; i++) {
      if (arr[i] == element) {
        return remove(i);
      }
    }
    return null;
  }

  public Object remove(int index) {
    if (index < 0 || index > lastIndex) {
      return null;
    }
    Object[] temp = arr;
    Object result = arr[index];
    if (lastIndex - 1 - index >= 0) {
      System.arraycopy(arr, index + 1, temp, index, lastIndex - 1 - index);
      lastIndex--;
      arr = temp;
    }
    return result;
  }

  public Object get(int index) {
    if (index > lastIndex || index < 0) {
      return null;
    }
    return arr[index];
  }

  public T set(int index, T data) {
    if (index > lastIndex || index < 0) {
      return null;
    }
    arr[index] = data;
    return data;
  }

  public String toString() {
    StringBuilder st = new StringBuilder();
    st.append("[");
    for (int i = 0; i < lastIndex; i++) {
      st.append(arr[i]).append(",");
    }
    if (st.toString().contains(",")) {
      st.deleteCharAt(st.length() - 1);
    }
    st.append("]");
    return st.toString();
  }

  public int indexOf(T data) {
    for (int i = 0; i < lastIndex; i++) {
      if (data.equals(arr[i])) {
        return i;
      }
    }
    return -1;
  }

  public int lastIndexOf(T data) {
    for (int i = lastIndex - 1; i >= 0; i--) {
      if (data.equals(arr[i])) {
        return i;
      }
    }
    return -1;
  }

  public boolean isEmpty() {
    return lastIndex == 0;
  }

  public T[] toArray() {
    return (T[]) arr;
  }

  public void clear() {
    arr = new Object[DEFAULT_CAPACITY];
    capacity = DEFAULT_CAPACITY;
    lastIndex = 0;
  }

  public MyList<T> subList(int start, int finish) {
    MyList<T> result = new MyList<>();
    for (int i = start; i <= finish; i++) {
      result.add((T) arr[i]);
    }
    return result;
  }

  public boolean contains(T data) {
    for (int i = 0; i < lastIndex; i++) {
      if (arr[i] == data) {
        return true;
      }
    }
    return false;
  }

}
