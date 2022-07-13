package org.ayse.java101.traianglearea;

import java.util.Scanner;

/**
 *  Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını
 *  hesaplayan programı yazınız.
 *  Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
 *  𝑢 = (a+b+c) / 2
 *  Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/
public class CalculateTriangleArea {
  private final int edge1;
  private final int edge2;
  private final int edge3;

  public CalculateTriangleArea(){
    System.out.println("Please enter edges of the triangle");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Edge 1: ");
    edge1=scanner.nextInt();
    System.out.print("Edge 2: ");
    edge2=scanner.nextInt();
    System.out.print("Edge 3: ");
    edge3=scanner.nextInt();
  }

  public void calculateArea()
  {
    double perimeter=(edge1+edge2+edge3)/2.0;
    double area = Math.sqrt(perimeter*(perimeter-edge1)*(perimeter-edge2)*(perimeter-edge3));
    System.out.println("Area of the triangle: "+area);
  }

  public static void main(String[] args) {
    CalculateTriangleArea calculateTriangleArea = new CalculateTriangleArea();
    calculateTriangleArea.calculateArea();
  }
}
