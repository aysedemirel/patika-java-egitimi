package org.ayse.java101.condition.activitysuggestor;

import java.util.Scanner;

/**
 * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
 * <p>
 * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
 * <p>
 * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
 * <p>
 * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 * <p>
 */
public class ActivitySuggestor {

  private final int heat;

  public ActivitySuggestor() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter degree of heat: ");
    heat = scanner.nextInt();
  }

  public static void main(String[] args) {
    ActivitySuggestor activitySuggestor = new ActivitySuggestor();
    activitySuggestor.suggestActivity();
  }

  public void suggestActivity() {
    if (heat < 5) {
      System.out.println("Skiing is a good option");
    } else if (heat >= 5 && heat < 15) {
      System.out.println("Watching a movie is the best. Go to the cinema.");
    } else if (heat >= 15 && heat < 25) {
      System.out.println("Wow, nice weather. Let's have a picnic.");
    } else if (heat >= 25) {
      System.out.println("The weather is burning. Swimming is the best option.");
    }
  }
}
