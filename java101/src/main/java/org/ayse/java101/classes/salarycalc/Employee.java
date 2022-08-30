package org.ayse.java101.classes.salarycalc;

/**
 * Sınıfın Nitelikleri
 * <p>
 * name : Çalışanın adı ve soyadı, salary : Çalışanın maaşı, workHours : Haftalık çalışma saati,
 * hireYear : İşe başlangıç yılı,
 * <p>
 * Sınıfın Metotları
 * <p>
 * Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.// tax() :
 * Maaşa uygulanan vergiyi hesaplayacaktır.// Çalışanın maaşı 1000 TL'den az ise vergi
 * uygulanmayacaktır. // Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi
 * uygulanacaktır. // bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan
 * çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
 * <p>
 * raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı
 * 2021 olarak alın.
 * <p>
 * Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
 * <p>
 * Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
 * <p>
 * Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
 * <p>
 * toString() : Çalışana ait bilgileri ekrana bastıracaktır.
 */
public class Employee {

  private final String name;
  private final double salary;
  private final int workHours;
  private final int hireYear;

  public Employee(String name, double salary, int workHours, int hireYear) {
    this.name = name;
    this.salary = salary;
    this.workHours = workHours;
    this.hireYear = hireYear;
  }

  public double tax() {
    return (salary < 1000) ? 0 : (salary * 3 / 100);
  }

  public double bonus() {
    return (workHours < 40) ? 0 : ((workHours - 40) * 30.0);
  }

  public double raiseSalary() {
    int year = 2021 - hireYear;
    if (year < 10) {
      return (salary * 0.05);
    } else if (year < 20) {
      // year >= 9 && year < 20
      return (salary * 0.1);
    } else {
      // year >=20
      return (salary * 0.15);
    }
  }

  @Override
  public String toString() {
    return "Name: " + name + "\n"
        + "Salary: " + salary + "\n"
        + "Work hours: " + workHours + "\n"
        + "Hire year: " + hireYear + "\n"
        + "Tax: " + tax() + "\n"
        + "Bonus: " + bonus() + "\n"
        + "Raise salary : " + raiseSalary() + "\n"
        + "Salary with Taxes and Bonuses: " + (salary - tax() + bonus()) + "\n"
        + "Total salary: " + (salary + raiseSalary());
  }

}
