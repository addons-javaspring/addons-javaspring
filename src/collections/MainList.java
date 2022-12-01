package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainList {
  public static void main(String[] args) {
    // instance list
    List<String> days = new ArrayList<>(Arrays.asList("Senin", "Selasa", "Rabu"));

    // add data
    days.add("Senin");
    days.add("Selasa");
    days.add("Raby");
    days.add("Jumat");

    System.out.println(days);

    // update data
    days.set(2, "Rabu");

    System.out.println(days);

    // add specific position
    days.add(3, "Kamis");

    // remove
    days.remove(0);

    System.out.println(days);
    System.out.println(days.get(1));
  }
}
