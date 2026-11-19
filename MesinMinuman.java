

import java.util.Scanner;

public class MesinMinuman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MESIN MINUMAN ===");
        System.out.println("1. Air Mineral");
        System.out.println("2. Teh");
        System.out.println("3. Kopi");
        System.out.println("4. Susu");
        System.out.print("Pilih minuman: ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("Air Mineral - Rp 3000");
                break;
            case 2:
                System.out.println("Teh - Rp 5000");
                break;
            case 3:
                System.out.println("Kopi - Rp 8000");
                break;
            case 4:
                System.out.println("Susu - Rp 10000");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        input.close();
    }
}
