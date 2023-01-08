package org.ayse.java101.classes.studentnote;

/**
 * Nitelikler : name,code,prefix,note,Teacher
 * <p>
 * Metotlar : Course() , addTeacher() , printTeacher()
 */
public class Course {

  private final String name;
  private final String code;
  private final String prefix;
  private int extraNote;
  private int note;
  private Teacher teacher;

  public Course(String name, String code, String prefix) {
    this.name = name;
    this.code = code;
    this.prefix = prefix;
    this.note = 0;
    this.extraNote = 0;
  }

  public void addTeacher(Teacher teacher) {
    if (prefix.equals(teacher.getBranch())) {
      this.teacher = teacher;
      System.out.println("Success: addTeacher()");
    } else {
      System.out.println(teacher.getName() + " can't give the course");
    }
  }

  public void printTeacher() {
    if (teacher != null) {
      System.out.println(this.name + " : " + teacher.getName());
    } else {
      System.out.println(this.name + " : No teacher");
    }
  }

  public int getAverage(double extraPer) {
    return (int) (extraNote * extraPer + note * (1 - extraPer));
  }

  public int getNote() {
    return note;
  }

  public void setNote(int note) {
    this.note = note;
  }

  public int getExtraNote() {
    return extraNote;
  }

  public void setExtraNote(int extraNote) {
    this.extraNote = extraNote;
  }
}
