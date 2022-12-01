package inheritance;

import java.util.Scanner;

// import inheritance.service.BangunDatarService;
import inheritance.subClass.Kubus;
import inheritance.subClass.PrismaSegitiga;
import inheritance.superClass.Persegi;
import inheritance.superClass.Segitiga;

public class MainApp {
  // Instance object scanner
  static Scanner in = new Scanner(System.in);
  static String pilihMenu, pilihSubMenu, state;

  public void menuApp() {
    System.out.println("=== PROGRAM HITUNG BANGUN RUANG & DATAR ===");
    System.out.println("1. Bangun Datar");
    System.out.println("2. Bangun Ruang");
    System.out.print("Tuliskan pilihan anda: ");
    pilihMenu = in.nextLine();
    System.out.println();
  }

  public void subMenuBangunDatar() {
    System.out.println("=== BANGUN DATAR ===");
    System.out.println("1. Persegi");
    System.out.println("2. Segitiga");
    System.out.print("Tuliskan pilihan anda: ");
    pilihSubMenu = in.nextLine();
    System.out.println();
  }

  public void subMenuBangunRuang() {
    System.out.println("=== BANGUN RUANG ===");
    System.out.println("1. Kubus");
    System.out.println("2. Prisma Segitiga");
    System.out.print("Tuliskan pilihan anda: ");
    pilihSubMenu = in.nextLine();
    System.out.println();
  }

  public static void main(String[] args) {
    // Instance object main
    MainApp main = new MainApp();
    Persegi persegi = new Persegi();
    // BangunDatarService bangunDatarService = new Persegi();
    Segitiga segitiga = new Segitiga();
    Kubus kubus = new Kubus();

    do {
      main.menuApp();

      switch (pilihMenu) {
        case "1":
          main.subMenuBangunDatar();

          switch (pilihSubMenu) {
            case "1":
              persegi.getTitle("PERSEGI");
              System.out.print("Input sisi persegi: ");
              int sisi = Integer.valueOf(in.nextLine());
              persegi.setSisi(sisi);
              System.out.println("Sisi Persegi: " + persegi.getSisi());
              System.out.println("Keliling Persegi: " + persegi.getKeliling());
              System.out.println("Luas Persegi: " + persegi.getLuas());
              break;

            case "2":
              segitiga.getTitle("SEGITIGA SAMA SISI");

              // Input data
              System.out.print("Input sisi segitiga: ");
              int sisiSegitiga = Integer.valueOf(in.nextLine());
              System.out.print("Input tinggi segitiga: ");
              int tinggiSegitiga = Integer.valueOf(in.nextLine());

              // Set atribut
              segitiga = new Segitiga(sisiSegitiga, tinggiSegitiga);
              System.out.println("Sisi segitiga: " + segitiga.getSisi());
              System.out.println("Tinggi segitiga: " + segitiga.getTinggi());
              System.out.println("Keliling segitiga: " + segitiga.getKeliling());
              System.out.println("Luas segitiga: " + segitiga.getLuas());
              break;

            default:
              System.out.println("Pilihan tidak tersedia!");
              break;
          }
          break;

        case "2":
          main.subMenuBangunRuang();

          switch (pilihSubMenu) {
            case "1":
              kubus.getTitle("KUBUS");
              System.out.print("Input sisi kubus: ");
              int sisi = Integer.valueOf(in.nextLine());
              kubus.setSisi(sisi);
              System.out.println("Sisi persegi: " + kubus.getSisi());
              System.out.println("Keliling persegi: " + kubus.getKeliling());
              System.out.println("Luas persegi: " + kubus.getLuas());
              System.out.println("Volume kubus: " + kubus.getVolume());
              break;

            case "2":
              PrismaSegitiga ps = new PrismaSegitiga();
              ps.getTitle("PRISMA SEGITIGA");

              // Input data
              System.out.print("Input sisi segitiga: ");
              int sisiSegitiga = Integer.valueOf(in.nextLine());
              System.out.print("Input tinggi segitiga: ");
              int tinggiSegitiga = Integer.valueOf(in.nextLine());
              System.out.print("Input tinggi prisma: ");
              int tinggiPrisma = Integer.valueOf(in.nextLine());

              // Set atribut
              ps = new PrismaSegitiga(sisiSegitiga, tinggiSegitiga, tinggiPrisma);
              System.out.println("Sisi segitiga: " + ps.getSisi());
              System.out.println("Tinggi segitiga: " + ps.getTinggi());
              System.out.println("Tinggi prisma segitiga: " + ps.getTinggiPrisma());
              System.out.println("Keliling segitiga: " + ps.getKeliling());
              System.out.println("Luas segitiga: " + ps.getLuas());
              System.out.println("Volume prisma segitiga: " + ps.getVolume());
              break;

            default:
              System.out.println("Pilihan tidak tersedia!");
              break;
          }
          break;

        default:
          System.out.println("Pilihan tidak tersedia!");
          break;
      }

      System.out.print("Ingin melanjutkan aplikasi? (y/n): ");
      state = in.nextLine();
      System.out.println();
    } while (state.equalsIgnoreCase("y"));

    System.out.println("\n === TERIMA KASIH === \n");

  }
}
