package org.ayse.java101.gradeaverage;

import java.util.Scanner;

/**
 * Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
 * <p>
 * Geçme Notu : 55
 * <p>
 * Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */
public class PassFailClass {

  private static final double NUMBER_OF_CLASSES = 5.0;
  private int math;
  private int physic;
  private int turkish;
  private int chemistry;
  private int music;

  public PassFailClass() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Math: ");
    math = scanner.nextInt();
    System.out.print("Physic: ");
    physic = scanner.nextInt();
    System.out.print("Turkish: ");
    turkish = scanner.nextInt();
    System.out.print("Chemistry: ");
    chemistry = scanner.nextInt();
    System.out.print("Music: ");
    music = scanner.nextInt();
  }

  public static void main(String[] args) {
    PassFailClass passFailClass = new PassFailClass();
    passFailClass.controlAverage();
  }

  public void controlAverage() {
    double numberOfClasses = getNumberOfClasses();
    if (numberOfClasses <= 0) {
      System.out.println("There is no proper class. Failed...");
      return;
    }
    System.out.println("Number of classes: " + numberOfClasses);
    double average = (math + physic + turkish + chemistry + music) / numberOfClasses;
    if (average >= 55) {
      System.out.println("Average: " + average + " --> Passed...");
    } else {
      System.out.println("Average: " + average + " --> Failed...");
    }
  }

  private double getNumberOfClasses() {
    boolean isMathProper = (math >= 0 && math <= 100);
    boolean isPhysicProper = (physic >= 0 && physic <= 100);
    boolean isTurkishProper = (turkish >= 0 && turkish <= 100);
    boolean isChemistryProper = (chemistry >= 0 && chemistry <= 100);
    boolean isMusicProper = (music >= 0 && music <= 100);
    math = isMathProper ? math : 0;
    physic = isPhysicProper ? physic : 0;
    turkish = isTurkishProper ? turkish : 0;
    chemistry = isChemistryProper ? chemistry : 0;
    music = isMusicProper ? music : 0;
    double numberOfClasses = NUMBER_OF_CLASSES;
    numberOfClasses = isMathProper ? numberOfClasses : (numberOfClasses - 1);
    numberOfClasses = isPhysicProper ? numberOfClasses : (numberOfClasses - 1);
    numberOfClasses = isTurkishProper ? numberOfClasses : (numberOfClasses - 1);
    numberOfClasses = isChemistryProper ? numberOfClasses : (numberOfClasses - 1);
    numberOfClasses = isMusicProper ? numberOfClasses : (numberOfClasses - 1);
    return numberOfClasses;
  }
}
