package org.ayse.java101.java8features;

public class DefaultStaticExample implements DefaultStaticFeatures {

  static {
    System.out.println("Object static");
  }

  public DefaultStaticExample() {
    System.out.println("Java8Features");
  }

  public static void main(String[] args) {
    DefaultStaticExample java8Features = new DefaultStaticExample();
    java8Features.print("print");
    java8Features.method1("");
    java8Features.log("log");
  }

  @Override
  public void method1(String str) {
    System.out.println("method 1: " + str);
  }
}
