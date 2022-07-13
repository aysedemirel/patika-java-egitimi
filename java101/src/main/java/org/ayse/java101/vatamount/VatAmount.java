package org.ayse.java101.vatamount;

import java.util.Scanner;

/**
 * Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
 * KDV tutarını hesaplayıp ekrana bastıran programı yazın.
 * (Not : KDV tutarını 18% olarak alın)
 * KDV'siz Fiyat = 10;
 * KDV'li Fiyat = 11.8;
 * KDV tutarı = 1.8;
 *
 * Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
 * tutar 1000 TL'den büyük ise KDV oranını %8 olarak
 * KDV tutarı hesaplayan programı yazınız.
 * */
public class VatAmount {
  private static final double VAT_PERCENTAGE_HIGH=0.18;
  private static final double VAT_PERCENTAGE_LOW=0.08;
  private final double priceWithoutVat;

  public VatAmount(){
    System.out.print("Please enter the price without VAT: ");
    Scanner scanner = new Scanner(System.in);
    priceWithoutVat = scanner.nextDouble();
  }

  public void calculateVat()
  {
    double vat = (priceWithoutVat>0 &&priceWithoutVat<1000)?VAT_PERCENTAGE_HIGH:VAT_PERCENTAGE_LOW;
    double result = priceWithoutVat + (priceWithoutVat*vat);
    System.out.println("Price with VAT (%"+vat*100+") : "+result);
  }

  public static void main(String[] args) {
    VatAmount vatAmount = new VatAmount();
    vatAmount.calculateVat();
  }
}
