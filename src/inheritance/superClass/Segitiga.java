package inheritance.superClass;

import inheritance.service.BangunDatarService;

public class Segitiga implements BangunDatarService {
  // Atribut
  private int sisi;
  private int tinggi;

  // Constructor
  public Segitiga() {
  }

  public Segitiga(int sisi, int tinggi) {
    this.sisi = sisi;
    this.tinggi = tinggi;
  }

  // Method getter
  public int getSisi() {
    return sisi;
  }

  public int getTinggi() {
    return tinggi;
  }

  public int getKeliling() {
    return this.sisi + this.sisi + this.sisi;
  }

  public int getLuas() {
    return this.sisi * this.tinggi / 2;
  }

  public void getTitle(String namaBangun) {
    System.out.println("=== " + namaBangun + " ===");
  }

}
