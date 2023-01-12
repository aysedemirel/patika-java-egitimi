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
//    MyList<Integer> list1 = new MyList<>();
//    printList(list1);
//    list1.add(10);
//    list1.add(20);
//    list1.add(30);
//    list1.add(40);
//    printList(list1);
//    list1.add(50);
//    list1.add(60);
//    list1.add(70);
//    list1.add(80);
//    list1.add(90);
//    list1.add(100);
//    list1.add(110);
//    printList(list1);

    //-----------------------------
    /*
     * 2. index : 30
     * 2. index : 40
     * [100,20,40]
     */
    MyList<Integer> list2 = new MyList<>();
    list2.add(10);
    list2.add(20);
    list2.add(30);
    System.out.println("2. index : " + list2.get(2));
    list2.remove(2);
    list2.add(40);
    list2.set(0, 100);
    System.out.println("2. index : " + list2.get(2));
    System.out.println(list2);
  }
}
