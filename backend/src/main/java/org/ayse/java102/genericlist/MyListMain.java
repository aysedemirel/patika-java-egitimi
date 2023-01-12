package org.ayse.java102.genericlist;

public class MyListMain {

  public static void printList(MyList<Integer> list) {
    System.out.println("Capacity : " + list.getCapacity());
    System.out.println("Size : " + list.size());
  }

  public static void main(String[] args) {
    /* OUTPUT--->
     * Capacity : 10
     * Size : 0
     * Capacity : 10
     * Size : 4
     * Capacity : 20
     * Size : 11
     * */
    MyList<Integer> list = new MyList<>();
    printList(list);
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    printList(list);
    list.add(50);
    list.add(60);
    list.add(70);
    list.add(80);
    list.add(90);
    list.add(100);
    list.add(110);
    printList(list);
  }
}
