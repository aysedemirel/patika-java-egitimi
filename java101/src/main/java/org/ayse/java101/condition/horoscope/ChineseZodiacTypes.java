package org.ayse.java101.condition.horoscope;

/**
 * * Doğum Tarihi %12 = 0 ➜ Maymun * <p> * Doğum Tarihi %12 = 1 ➜ Horoz * <p> * Doğum Tarihi %12 = 2
 * ➜ Köpek * <p> * Doğum Tarihi %12 = 3 ➜ Domuz * <p> * Doğum Tarihi %12 = 4 ➜ Fare * <p> * Doğum
 * Tarihi %12 = 5 ➜ Öküz * <p> * Doğum Tarihi %12 = 6 ➜ Kaplan * <p> * Doğum Tarihi %12 = 7 ➜ Tavşan
 * * <p> * Doğum Tarihi %12 = 8 ➜ Ejderha * <p> * Doğum Tarihi %12 = 9 ➜ Yılan * <p> * Doğum Tarihi
 * %12 = 10 ➜ At * <p> * Doğum Tarihi %12 = 11 ➜ Koyun
 */
public enum ChineseZodiacTypes {
  MONKEY(0),
  COCKEREL(1),
  DOG(2),
  PIG(3),
  MOUSE(4),
  OX(5),
  TIGER(6),
  RABBIT(7),
  DRAGON(8),
  SNAKE(9),
  HORSE(10),
  SHEEP(11),
  UNKNOWN(12);

  int id;

  ChineseZodiacTypes(int id) {
    this.id = id;
  }

  public static ChineseZodiacTypes getType(int id) {
    for (ChineseZodiacTypes type : values()
    ) {
      if (type.getId() == id) {
        return type;
      }
    }
    return UNKNOWN;
  }

  public int getId() {
    return id;
  }
}
