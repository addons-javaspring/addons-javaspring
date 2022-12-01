import model.BiodataEntity;

public class App {
  private String firstName = "Femilia";
  String lastName = "Putri";

  public static void main(String[] args) {
    // Instance object
    // Class namaObj = new Class();
    App app = new App();
    System.out.println(app.firstName);

    // Instance object
    BiodataEntity biodataEntity = new BiodataEntity();
    biodataEntity.setFullName(app.firstName + " " + app.lastName);
    System.out.println(biodataEntity.getFullName());

    int[] arr1 = { 1, 2, 3, 4, 5 };
    int[] arr2 = { 1, 3, 5, 7, 9 };
    int[] arr3 = new int[5];
    int temp = 0;

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        if (arr1[i] == arr2[j]) {
          System.out.println(arr1[i]);
          arr3[temp] = arr1[i];
          temp++;
        }
      }
    }

    for (int i = 0; i < arr3.length; i++) {
      System.out.println(arr3[i]);
    }
  }

  // 1. methods yg mengembalikan data -> tipe data, return
  // 2. methods void -> tidak mengembalikan
}