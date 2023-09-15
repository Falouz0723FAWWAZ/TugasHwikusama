import java.util.Scanner;

public class Hwikusama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Halo pengunjung...Selamat datang di hotel Wikusama, mau pesan kamar apa?");
        System.out.println("Lavana 450000");
        System.out.println("merapi 568000");
        System.out.println("king jowas 234500");
        System.out.println("Matahari 750000");

        String Jkamar = scanner.nextLine();
        System.out.println("Mau menginap berapa malam?");
        int malam = scanner.nextInt();

        double total = 0;
        double harga=0;
        if (Jkamar.equalsIgnoreCase("Lavana")) {
            harga=450000;
        } else if (Jkamar.equalsIgnoreCase("merapi")) {
            harga = 568000;
            
        }if (Jkamar.equalsIgnoreCase("king jowas")) {
            harga= 234500;

            
        } else if(Jkamar.equalsIgnoreCase("Matahari")) {
            harga = 750000;
            
        }

        total = harga*malam;
        System.out.println(total);
    }
}
