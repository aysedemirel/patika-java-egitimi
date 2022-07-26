package org.ayse.java101.condition;

import java.util.Scanner;

/**
 * Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı
 * yazın. Alan Formülü : π * r * r; Çevre Formülü : 2 * π * r; Yarıçapı r, merkez açısının ölçüsü 𝛼
 * olan daire diliminin alanı bulan programı yazınız. Formül : (𝜋 * (r*r) * 𝛼) / 360
 */
public class Circle {

  private final double radius;
  private final double centerAngle;

  public Circle() {
    System.out.println("Please enter radius and center angle of the circle");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Radius: ");
    radius = scanner.nextDouble();
    System.out.print("Center angle: ");
    centerAngle = scanner.nextDouble();
  }

  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.calculateArea();
    circle.calculatePerimeter();
    circle.calculateSliceArea();
  }

  public void calculateArea() {
    double area = Math.PI * radius * radius;
    System.out.println("Area: " + area);
  }

  public void calculatePerimeter() {
    double perimeter = 2 * Math.PI * radius;
    System.out.println("Perimeter: " + perimeter);
  }

  public void calculateSliceArea() {
    double sliceArea = (Math.PI * (radius * radius) * centerAngle) / 360;
    System.out.println("Slice area: " + sliceArea);
  }
}
