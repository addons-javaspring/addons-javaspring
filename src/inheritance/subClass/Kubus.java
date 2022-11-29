package inheritance.subClass;

import inheritance.superClass.Persegi;

public class Kubus extends Persegi {
  // method
  public int getVolume() {
    return super.getSisi() * super.getSisi() * super.getSisi();
  }

  // OVERRIDE METHODS: METHODS DARI PARENT YG DIBUAT DI CLASS CHILDNYA
  public void getTitle() {
    System.out.println("=== KUBUS ===");
  }
}
