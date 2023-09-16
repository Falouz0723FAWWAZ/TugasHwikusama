import java.util.Scanner;

public class Cottage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di BHAKTI ALAM");
        System.out.println("Duku\nJeruk\nAlpukat\nJambu air\nDurian\nMelon\nBelimbing\nMangga\nKedondong");

        System.out.println("Pilih kamar Anda (duku, jeruk, alpukat, jambu air, durian, melon, belimbing, mangga, kedondong):");
        String Pkamar = scanner.nextLine();

        System.out.println("Anda akan menginap di hari weekday, weekend, atau Holiday?");
        String jenisHari = scanner.nextLine();

        System.out.println("Mau menginap berapa malam?");
        int malam = scanner.nextInt();
        
        int harga = 0;

        if (Pkamar.equalsIgnoreCase("duku") || Pkamar.equalsIgnoreCase("jeruk")) {
            switch (jenisHari) {
                case "weekday":
                    harga = 915000;
                    break;
                case "weekend":
                    harga = 1025000;
                    break;
                case "Holiday":
                    harga = 1225000;
                    break;
                default:
                    System.out.println("Hari tidak valid.");
                    return; // Exit the program if the day is not valid.
            }
        } else if (Pkamar.equalsIgnoreCase("Alpukat") || Pkamar.equalsIgnoreCase("Jambu air")){
            switch (jenisHari) {
                case "weekday":
                    harga = 575000;
                    break;
                case "weekend":
                    harga = 695000;
                    break;
                case "Holiday":
                    harga = 895000;
                    break;
                default:
                    System.out.println("Hari tidak valid.");
                    return; 
                 }
        } else if (Pkamar.equalsIgnoreCase("Durian") || Pkamar.equalsIgnoreCase("Melon")){
            switch (jenisHari) {
                case "weekday":
                    harga = 595000;
                    break;
                case "weekend":
                    harga = 715000;
                    break;
                case "Holiday":
                    harga = 915000;
                    break;
                default:
                    System.out.println("Hari tidak valid.");
                    return; 
                }
        } else if (Pkamar.equalsIgnoreCase("Belimbing") || Pkamar.equalsIgnoreCase("Mangga") || Pkamar.equalsIgnoreCase("Kedondong")){
            switch (jenisHari) {
                case "weekday":
                    harga = 495000;
                    break;
                case "weekend":
                    harga = 575000;
                    break;
                case "Holiday":
                    harga = 755000;
                    break;
                default:
                    System.out.println("Hari tidak valid.");
                    return; 
                }
        } else {
            System.out.println("Kamar tidak valid.");
            return; // Exit the program if the room is not valid.
        }

        int totalBiaya = harga * malam;
        System.out.println("Total biaya penginapan Anda adalah: " + totalBiaya);
    }
}
