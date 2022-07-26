package org.ayse.java101.condition;

import java.util.Scanner;

/**
 * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre
 * kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
 * <p>
 * Kilo (kg) / Boy(m) * Boy(m)
 */
public class BodyMass {

  private final double height;
  private final double weight;

  public BodyMass() {
    System.out.println("Please enter your body measurements");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Height(m):");
    height = scanner.nextDouble();
    System.out.print("Weight(kg):");
    weight = scanner.nextDouble();
  }

  public static void main(String[] args) {
    BodyMass bodyMass = new BodyMass();
    bodyMass.calculateBodyMassIndex();
  }

  public void calculateBodyMassIndex() {
    double bodyMass = weight / (height * height);
    System.out.println("Body mass: " + bodyMass);
  }
}
