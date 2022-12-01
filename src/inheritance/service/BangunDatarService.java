package inheritance.service;

// class abstraction: class yang di dalamnya menyimpan methods tanpa body
public interface BangunDatarService {
  // abstract method: kerangka methods yg tanpa body, wajib diimplementasi
  void getTitle(String namaBangun);

  int getLuas();

  int getKeliling();

  // int getAtribut();

  // methods optional implement
  default int getHasil() {
    return 0;
  };

  // methods private
  private void rahasia() {
    System.out.println("rahasia");
  }
}
