package org.ayse.java101.notortalamasi;

import java.util.Scanner;

/**
 * Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin
 * sınav puanlarını kullanıcıdan alan
 * ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
 *
 * Aynı program içerisinde koşullu ifadeler kullanılarak,
 * eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" ,
 * küçük ise "Sınıfta Kaldı" yazsın.
 *
 * Not : If ve Else kullanılmayacak...*/
public class GradeAverage {
  private final int math;
  private final int physic;
  private final int chemistry;
  private final int turkish;
  private final  int history;
  private final int music;
  private static final double NUMBER_OF_CLASSES =6.0;

  public GradeAverage(){
    Scanner scanner = new Scanner(System.in);
    math = scanner.nextInt();
    physic =scanner.nextInt();
    chemistry =scanner.nextInt();
    turkish =scanner.nextInt();
    history =scanner.nextInt();
    music =scanner.nextInt();
  }

  public void printResult()
  {
    double average = (math + physic + chemistry + turkish + history + music) / NUMBER_OF_CLASSES;
    System.out.println("average: "+average);
    System.out.println((average>60)?"Passed class":"Failed class");
  }

  public static void main(String[] args) {
    GradeAverage gradeAverage = new GradeAverage();
    gradeAverage.printResult();
  }
}
