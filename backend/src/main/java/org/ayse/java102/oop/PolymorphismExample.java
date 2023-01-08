package org.ayse.java102.oop;

public class PolymorphismExample {

  public PolymorphismExample() {
    // Temel Gösterim
    Kedi kedi = new Kedi("Nasip");

    if (kedi instanceof Kedi) {
      System.out.println("Bu nesne Kedi sınıfından");
    }

    if (kedi instanceof Hayvan) {
      System.out.println("Bu nesne Hayvan sınıfından");
    }

    //Fonksiyon ile gösterim

    Kedi kedii = new Kedi("Nasip");
    Kopek kopek = new Kopek("Zizu");
    At at = new At("BoldPilot");
    Hayvan hayvan = new Hayvan("Turunç");

    konustur(kedii);
    konustur(kopek);
    konustur(at);
    konustur(hayvan);
  }

  public static void konustur(Object object) {

    if (object instanceof Kopek) {
      Kopek kopekTest = (Kopek) object;
      System.out.println(kopekTest.konus());
    } else if (object instanceof Kedi) {
      Kedi kediTest = (Kedi) object;
      System.out.println(kediTest.konus());
    } else if (object instanceof At) {
      At atTest = (At) object;
      System.out.println(atTest.konus());
    } else if (object instanceof Hayvan) {
      Hayvan hayvanTest = (Hayvan) object;
      System.out.println(hayvanTest.konus());
    }
  }

  public static void main(String[] args) {
    new PolymorphismExample();
  }

  class Hayvan {

    private String isim;

    public Hayvan(String isim) {
      this.isim = isim;
    }

    public String getIsim() {
      return isim;
    }

    public void setIsim(String isim) {
      this.isim = isim;
    }

    public String konus() {
      return "Hayvan Konuşuyor...";
    }
  }

  class Kedi extends Hayvan {

    public Kedi(String isim) {
      super(isim);
    }

    @Override
    public String konus() {
      return this.getIsim() + " Miyavlıyor...";
    }
  }

  class Kopek extends Hayvan {

    public Kopek(String isim) {
      super(isim);
    }

    @Override
    public String konus() {
      return this.getIsim() + " Havlıyor...";
    }
  }

  class At extends Hayvan {

    public At(String isim) {
      super(isim);
    }

    @Override
    public String konus() {
      return this.getIsim() + " Kişniyor...";
    }
  }
}
