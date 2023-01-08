package org.ayse.java101.condition.travel;

import java.util.Scanner;

/**
 * Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe
 * başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında
 * ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
 * <p>
 * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1
 * veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı
 * verilmelidir.
 * <p>
 * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır. Kişi 12-24 yaşları
 * arasında ise bilet fiyatı üzerinden %10 indirim uygulanır. Kişi 65 yaşından büyük ise bilet
 * fiyatı üzerinden %30 indirim uygulanır.
 * <p>
 * Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */
public class TicketPrice {

  private static final double KM_PRICE = 0.10;
  private static final double AGE_YOUNGER_THAN_12 = 0.5;
  private static final double AGE_BETWEEN_12_AND_24 = 0.1;
  private static final double AGE_OLDER_THAN_65 = 0.3;
  private static final double ROUND_TRIP_DISCOUNT = 0.2;

  private final double distance;
  private final int age;
  private final TravelType travelType;

  public TicketPrice() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Distance (KM): ");
    distance = scanner.nextDouble();
    System.out.print("Age: ");
    age = scanner.nextInt();
    System.out.print("Travel type (1-one way, 2-round trip): ");
    travelType = TravelType.getType(scanner.nextInt());
  }


  public static void main(String[] args) {
    TicketPrice ticketPrice = new TicketPrice();
    boolean isValid = ticketPrice.controlInputs();
    if (isValid) {
      double normalPrice = ticketPrice.calculateNormalPrice();
      double ageDiscountedAmount = ticketPrice.ageDiscount(normalPrice);
      double tripTypeDiscountedAmount = ticketPrice.travelTypeDiscount(ageDiscountedAmount);
      System.out.println("Result: " + tripTypeDiscountedAmount + " TL");
    }
  }

  public boolean controlInputs() {
    boolean isValid = true;
    if (distance < 0 || distance > Double.MAX_VALUE) {
      System.out.println("Unvalid input--Distance: " + distance);
      isValid = false;
    }
    if (age < 0 || age > Integer.MAX_VALUE) {
      System.out.println("Unvalid input--Age: " + age);
      isValid = false;
    }
    if (travelType == TravelType.UNKNOWN) {
      System.out.println("Unvalid input--TravelType: " + travelType.getId());
      isValid = false;
    }
    return isValid;
  }

  public double calculateNormalPrice() {
    double totalPrice = distance * KM_PRICE;
    System.out.println("Normal price: " + totalPrice);
    return totalPrice;
  }

  public double ageDiscount(double totalPrice) {
    double discountPrice = 0;
    if (age < 12) {
      discountPrice = totalPrice * AGE_YOUNGER_THAN_12;
    } else if (age >= 12 && age <= 24) {
      discountPrice = totalPrice * AGE_BETWEEN_12_AND_24;
    } else if (age >= 65) {
      discountPrice = totalPrice * AGE_OLDER_THAN_65;
    }
    double discountedAmount = totalPrice - discountPrice;
    System.out.println("Age discount: " + discountPrice);
    System.out.println("Discounted amount: " + discountedAmount);
    return discountedAmount;
  }

  public double travelTypeDiscount(double discountedPrice) {
    double discount = 0;
    double result = discountedPrice;
    if (travelType.equals(TravelType.ROUND_TRIP)) {
      discount = discountedPrice * ROUND_TRIP_DISCOUNT;
      result = (discountedPrice - discount) * 2;
    }
    System.out.println("Travel type discount: " + discount);
    return result;
  }
}
