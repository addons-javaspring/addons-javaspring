package inheritance.superClass;

import inheritance.service.BangunDatarService;

// Class Persegi
public class Persegi implements BangunDatarService {
  // atribut
  private int sisi;

  // constructor
  public Persegi(int sisi) {
    this.sisi = sisi;
  }

  public Persegi() {

  }

  // method
  public void setSisi(int sisi) {
    this.sisi = sisi;
  }

  public int getSisi() {
    return this.sisi;
  }

  @Override
  public int getKeliling() {
    return 4 * this.sisi;
  }

  // OVERLOAD METHODS: 2 METHODS / CONSTRUCTOR DALAM 1 FILE YG SAMA DENGAN SYARAT
  // PARAMETERNYA BEDA
  @Override
  public int getLuas() {
    return this.sisi * this.sisi;
  }

  public static int getLuas(int sisi) {
    return sisi * sisi;
  }

  @Override
  public void getTitle(String namaBangun) {
    // TODO Auto-generated method stub
    System.out.println("=== " + namaBangun + " ===");
  }

}
