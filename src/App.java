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
  }

  // 1. methods yg mengembalikan data -> tipe data, return
  // 2. methods void -> tidak mengembalikan
}