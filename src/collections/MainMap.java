package collections;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
  public static void main(String[] args) {
    // Instance
    Map<String, Integer> nilaiSiswa = new HashMap<>();

    nilaiSiswa.put("123", 100);
    nilaiSiswa.put("234", 90);
    nilaiSiswa.put("345", 89);

    int nilai = nilaiSiswa.get("123");

    System.out.println(nilaiSiswa);
    System.out.println(nilai);
  }
}
