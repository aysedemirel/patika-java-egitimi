package org.ayse.java102.patikastore;

import org.ayse.java102.patikastore.product.Computer;
import org.ayse.java102.patikastore.product.Phone;
import org.ayse.java102.patikastore.product.Product;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Kullanıcı sistem üzerinden ilgili kategorideki (Notebook, Cep Telefonları vb.) ürünleri listeyebilmeli
 * Ürünler listelenirken tablo şeklinde konsol ekranında gösterilmeli (System.out.format() kullanılabilir).
 * Kullanıcı ürün ekleyebilmeli ve ürünün grubunu (Cep Telefonu, Notebook vb.) seçebilmeli.
 * Kullanıcı ürünleri benzersiz numaralarına göre silebilmeli.
 * Kullanıcı ürünlerin benzersiz numaralarına ve markalarına göre filtreleyip listeleyebilmeli.
 * <p>
 * Sanal Mağazanın adı "PatikaStore" olacaktır.
 * Markalar listelenirken her zaman alfabe sırasıyla listelenmelidir.
 * Markalar statik olarak kod blokları içerisinden aşağıdaki sıra ile eklenmelidir.
 * Markalar : Samsung, Lenovo, Apple, Huawei, Casper, Asus, HP, Xiaomi, Monster
 * Mağazada şuan için 2 tür ürün grubu satılması planlanmaktadır : Cep Telefonları, Notebook
 * Daha sonrasında farklı ürün gruplarını eklenebilir olmalıdır.
 */
public class PatikaStore {

    private static final List<Brand> brandList;

    static {
        brandList = new LinkedList<>();
        brandList.add(new Brand(1, "Samsung"));
        brandList.add(new Brand(2, "Lenovo"));
        brandList.add(new Brand(3, "Apple"));
        brandList.add(new Brand(4, "Huawei"));
        brandList.add(new Brand(5, "Casper"));
        brandList.add(new Brand(6, "Asus"));
        brandList.add(new Brand(1, "HP"));
        brandList.add(new Brand(1, "Xiaomi"));
        brandList.add(new Brand(1, "Monster"));
    }

    private final List<Product> productList;
    private final String storeName;
    private final Scanner scanner;
    private boolean isStoreOpen = true;

    public PatikaStore() {
        scanner = new Scanner(System.in);
        storeName = "PatikaStore";
        productList = new ArrayList<>();
        addProductToStore(new Phone());
        addProductToStore(new Computer());
    }

    public static void main(String[] args) {
        new PatikaStore();
    }

    public void addProductToStore(Product product) {
        productList.add(product);
    }

    private void enterStore() {
        new Thread(
                () -> {
                    while (isStoreOpen) {
                        printMenu();
                        int ch = scanner.nextInt();
                        switch (ch) {
                            case 1 -> {
                                // TODO: notebook list, delete
                                break;
                            }
                            case 2 -> {
                                // TODO: cellphone
                                break;
                            }
                            case 3 -> {
                                // TODO: list brands
                                break;
                            }
                            default -> {
                                isStoreOpen = false;
                            }
                        }

                    }
                }
        ).start();
    }

    private void printMenu() {
        String menuStr = """
                PatikaStore Ürün Yönetim Paneli !
                1 - Notebook İşlemleri
                2 - Cep Telefonu İşlemleri
                3 - Marka Listele
                0 - Çıkış Yap
                """;
        System.out.println(menuStr);
    }
}
