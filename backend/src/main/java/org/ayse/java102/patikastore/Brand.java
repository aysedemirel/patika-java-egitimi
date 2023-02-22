package org.ayse.java102.patikastore;

/**
 * Mağazada Markalar oluşturulacak ve ürünler bu markalar ile eşleşecektir.
 * id : Markanın sistemde kayıtlı benzersiz numarası
 * name : Markanın adı
 */
public class Brand {
    private int id;
    private String name;

    public Brand(int id, String name) {
        // FIXME: random unique id
        this.id = id;
        this.name = name;
    }

    public Brand() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
