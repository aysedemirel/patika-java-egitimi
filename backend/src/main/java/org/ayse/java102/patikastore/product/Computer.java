package org.ayse.java102.patikastore.product;

import org.ayse.java102.patikastore.Brand;

import java.util.UUID;

/**
 * Notebook ürünlerinin özellikleri :
 * <p>
 * Ürünün sistemde kayıtlı benzersiz numarasi,
 * Ürün adı,
 * Birim fiyatı,
 * İndirim oranı,
 * Stok miktarı,
 * Marka bilgisi (Sistemde ekli olan markalar kullanılacaktır),
 * Ram (8 GB),
 * Depolama (512 SSD),
 * Ekran Boyutu (14 inç)
 */
public class Computer implements Product {
    private UUID id;
    private String name;
    private double price;
    private double discount;
    private int count;
    private Brand brand;
    private int storage;
    private int screenSize;
    private int ram;

    public Computer(String name, double price, double discount,
                    int count, Brand brand, int storage, int screenSize, int ram) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.count = count;
        this.brand = brand;
        this.storage = storage;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public Computer() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String getProductInfo() {
        return getName() + "      |" + getPrice() + "      |" + getBrand().getName()
                + "      |" + getStorage() + "      |" + getScreenSize() + "      |" + getRam() + " |\n";
    }

}
