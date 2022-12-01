package collections;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
  public static void main(String[] args) {
    // Instance object
    Set<String> month = new HashSet<>();

    month.add("Januari");
    month.add("Februari");
    month.add("Februari");
    month.add("Februari");
    month.add("Maret");

    System.out.println(month);
  }
}
