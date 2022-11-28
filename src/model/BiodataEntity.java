package model;

public class BiodataEntity {
  private String fullName;
  private String nik;

  // 2 method setter dan getter di atributnya
  // method setter
  public void setFullName(String namaLengkap) {
    this.fullName = namaLengkap;
  }

  public void setNik(String nik) {
    this.nik = nik;
  }

  // method getter
  public String getFullName() {
    return this.fullName;
  }

  public String getNik() {
    return this.nik;
  }
}
