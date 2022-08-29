package org.ayse.java101.classes.studentnote;

/**
 * Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
 * <p>
 * Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
 */
public class Student {

  private static final double MATH_EXTRA = 0.2;
  private static final double PHYSIC_EXTRA = 0.2;
  private static final double CHEMISTRY_EXTRA = 0.2;
  private final String name;
  private final int stuNo;
  private final String classes;
  private final Course math;
  private final Course physic;
  private final Course chemistry;
  private boolean isPass;
  private int average;

  public Student(String name, int stuNo, String classes, Course math, Course physic,
      Course chemistry) {
    this.name = name;
    this.stuNo = stuNo;
    this.classes = classes;
    this.math = math;
    this.physic = physic;
    this.chemistry = chemistry;
    this.isPass = false;
  }

  public void addBulkExamNote(int math, int physic, int chemistry) {
    if (math >= 0 && math <= 100) {
      this.math.setNote(math);
    }
    if (physic >= 0 && physic <= 100) {
      this.physic.setNote(physic);
    }
    if (chemistry >= 0 && chemistry <= 100) {
      this.chemistry.setNote(chemistry);
    }
  }

  public void addBulkExtraNote(int math, int physic, int chemistry) {
    if (math >= 0 && math <= 100) {
      this.math.setExtraNote(math);
    }
    if (physic >= 0 && physic <= 100) {
      this.physic.setExtraNote(physic);
    }
    if (chemistry >= 0 && chemistry <= 100) {
      this.chemistry.setExtraNote(chemistry);
    }
  }

  public void isPass() {
    if (math.getNote() == 0 || physic.getNote() == 0 || chemistry.getNote() == 0) {
      System.out.println("No code is completed");
    } else {
      isPass = isCheckPass();
      printNote();
      System.out.println("Average : " + average);
      if (isPass) {
        System.out.println("Pass... ");
      } else {
        System.out.println("Failed...");
      }
    }
  }

  public boolean isCheckPass() {
    calcAverage();
    return average > 55;
  }

  public void calcAverage() {
    System.out.println("PH::" + physic.getAverage(PHYSIC_EXTRA));
    average = (math.getAverage(MATH_EXTRA) + physic.getAverage(PHYSIC_EXTRA) + chemistry.getAverage(
        CHEMISTRY_EXTRA)) / 3;
  }

  public void printNote() {
    System.out.println("=========================");
    System.out.println("Student : " + this.name);
    System.out.println("Math Note : " + this.math.getNote());
    System.out.println("Physic Note : " + this.physic.getNote());
    System.out.println("Chemistry Note : " + this.chemistry.getNote());
  }
}
