

public class DurasiBelajar {
    
    public static void main(String[] args) {
        int[] durasi = {45, 60, 30, 90, 75};

        int total = 0;
        int max = durasi[0];
        int min = durasi[0];

        System.out.print("Data durasi: ");
        for (int i = 0; i < durasi.length; i++) {
            System.out.print(durasi[i] + " ");
            total += durasi[i];
            if (durasi[i] > max) max = durasi[i];
            if (durasi[i] < min) min = durasi[i];
        }

        double rataRata = (double) total / durasi.length;

        System.out.println("\nTotal durasi: " + total + " menit");
        System.out.println("Rata-rata durasi: " + rataRata + " menit");
        System.out.println("Durasi paling lama: " + max + " menit");
        System.out.println("Durasi paling singkat: " + min + " menit");
    }
}

