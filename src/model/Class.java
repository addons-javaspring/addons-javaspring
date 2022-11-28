package model;

public class Class {
  public static void main(String[] args) {
    BiodataEntity biodataEntity = new BiodataEntity();
    biodataEntity.setFullName("Ini Budi");
    biodataEntity.setNik("12345");

    // cetak datanya
    System.out.println(biodataEntity.getFullName());
    System.out.println(biodataEntity.getNik());
  }
}
