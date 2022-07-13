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
public class NotOrtalamasi {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int matematik, fizik, kimya, turkce, tarih, muzik;
    final int  DERS_SAYISI=6;
    matematik = scanner.nextInt();
    fizik=scanner.nextInt();
    kimya=scanner.nextInt();
    turkce=scanner.nextInt();
    tarih=scanner.nextInt();
    muzik=scanner.nextInt();

    double ortalama = (matematik+fizik+kimya+turkce+tarih+muzik) / DERS_SAYISI;

    System.out.println("ortalama: "+ortalama);
    System.out.println((ortalama>60)?"Sınıfı Geçti":"Sınıfta Kaldı");
  }
}
