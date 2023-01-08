package org.ayse.java101.classes.studentnote;

/**
 * Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı
 * belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.
 * <p>
 * Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
 * <p>
 * Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde
 * hesaplanır :
 * <p>
 * Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
 */
public class Main {

  public static void main(String[] args) {

    Course mat = new Course("Matematik", "MAT101", "MAT");
    Course fizik = new Course("Fizik", "FZK101", "FZK");
    Course kimya = new Course("Kimya", "KMY101", "KMY");

    Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
    Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
    Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

    mat.addTeacher(t1);
    fizik.addTeacher(t2);
    kimya.addTeacher(t3);

    Student s1 = new Student("inek saban", 4, "140144015", mat, fizik, kimya);
    s1.addBulkExamNote(50, 90, 40);
    s1.addBulkExtraNote(60, 60, 40);
    s1.isPass();

    Student s2 = new Student("guduk necmi", 4, "2211133", mat, fizik, kimya);
    s2.addBulkExamNote(100, 50, 40);
    s2.addBulkExtraNote(60, 30, 40);
    s2.isPass();

    Student s3 = new Student("hayta ismail", 4, "221121312", mat, fizik, kimya);
    s3.addBulkExamNote(50, 20, 40);
    s3.addBulkExtraNote(60, 30, 40);
    s3.isPass();
  }
}
