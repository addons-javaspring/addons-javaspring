package inheritance.superClass;

// Class Persegi
public class Persegi {
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

  public int getKeliling() {
    return 4 * this.sisi;
  }

  // OVERLOAD METHODS: 2 METHODS / CONSTRUCTOR DALAM 1 FILE YG SAMA DENGAN SYARAT
  // PARAMETERNYA BEDA
  public int getLuas() {
    return this.sisi * this.sisi;
  }

  public static int getLuas(int sisi) {
    return sisi * sisi;
  }

  public void getTitle() {
    System.out.println("=== PERSEGI ===");
  }
}
