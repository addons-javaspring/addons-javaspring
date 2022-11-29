package inheritance.subClass;

import inheritance.superClass.Segitiga;

public class PrismaSegitiga extends Segitiga {
  // Atribut
  private int tinggiPrisma;

  // Constructor
  public PrismaSegitiga(int sisi, int tinggiAlas, int tinggiPrisma) {
    super(sisi, tinggiAlas);
    this.tinggiPrisma = tinggiPrisma;
  }

  public PrismaSegitiga() {
  }

  // Method
  public int getVolume() {
    // luas alas * tinggi prisma
    return super.getLuas() * this.tinggiPrisma;
  }

  @Override
  public void getTitle() {
    // TODO Auto-generated method stub
    System.out.println("=== PRISMA SEGITIGA ===");
  }

  public int getTinggiPrisma() {
    return tinggiPrisma;
  }
}
