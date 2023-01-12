package org.ayse.java102.genericlist;

/**
 * @author aysedemireldeniz
 */
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
    System.out.println("-------------------FIRST OUTPUT-------------------");
    MyList<Integer> list1 = new MyList<>();
    printList(list1);
    list1.add(10);
    list1.add(20);
    list1.add(30);
    list1.add(40);
    printList(list1);
    list1.add(50);
    list1.add(60);
    list1.add(70);
    list1.add(80);
    list1.add(90);
    list1.add(100);
    list1.add(110);
    printList(list1);

    //-----------------------------
    /* OUTPUT--->
     * 2. index : 30
     * 2. index : 40
     * [100,20,40]
     */
    System.out.println("-------------------SECOND OUTPUT-------------------");
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

    //-----------------------------
    /* OUTPUT--->
     * Status : EMPTY
     * Status: FULL
     * Index : 1
     * Index :-1
     * Index : 4
     * First element :10
     * [10,20,30,40]
     * 20 element : true
     * 120 element : false
     * []
     * */
    System.out.println("-------------------THIRD OUTPUT-------------------");
    MyList<Integer> list3 = new MyList<>();
    System.out.println("Status : " + (list3.isEmpty() ? "EMPTY" : "FULL"));
    list3.add(10);
    list3.add(20);
    list3.add(30);
    list3.add(40);
    list3.add(20);
    list3.add(50);
    list3.add(60);
    list3.add(70);

    System.out.println("Status: " + (list3.isEmpty() ? "EMPTY" : "FULL"));
    System.out.println("Index : " + list3.indexOf(20));
    System.out.println("Index :" + list3.indexOf(100));
    System.out.println("Index : " + list3.lastIndexOf(20));

    Object[] dizi = list3.toArray();
    System.out.println("First element :" + dizi[0]);

    MyList<Integer> altListem = list3.subList(0, 3);
    System.out.println(altListem.toString());
    System.out.println("20 element : " + list3.contains(20));
    System.out.println("120 element : " + list3.contains(120));

    list3.clear();
    System.out.println(list3);
  }
}
