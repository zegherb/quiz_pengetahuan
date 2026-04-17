import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        KategoriKuis[] daftarKategori = new KategoriKuis[3];
        daftarKategori[0] = new KuisPengetahuanUmum();
        daftarKategori[1] = new KuisTeknologi();
        daftarKategori[2] = new KuisPengetahuanAlam();

        System.out.println("=======================================");
        System.out.println("SELAMAT DATANG DI GAME KUIS PENGETAHUAN!");
        System.out.println("=======================================");
        System.out.print("Masukkan nama Kamu: ");
        
        String inputNama = scanner.nextLine();
        Player pemain = new Player(inputNama); 

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("Halo, " + pemain.getNama() + "! | Total Skor Keseluruhan: " + pemain.getScore());
            System.out.println("1. Main Kuis (Pilih Kategori)");
            System.out.println("2. Lihat Skor Tertinggi per Kategori");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1/2/3): ");
            
            String menu = scanner.nextLine();

            switch (menu) {
                case "1":
                    System.out.println("\n=== PILIH KATEGORI ===");
                    for (int i = 0; i < daftarKategori.length; i++) {
                        System.out.println((i + 1) + ". " + daftarKategori[i].getNamaKategori());
                    }
                    System.out.print("Pilih (1-3): ");
                    
                    try {
                        int pilihanKategori = Integer.parseInt(scanner.nextLine());
                        if (pilihanKategori >= 1 && pilihanKategori <= daftarKategori.length) {
                            daftarKategori[pilihanKategori - 1].mainkan(pemain, scanner);
                        } else {
                            System.out.println("Kategori nggak ada bro.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Input harus angka ya!");
                    }
                    break;

                case "2":
                    System.out.println("\n=== HIGH SCORE ===");
                    for (int i = 0; i < daftarKategori.length; i++) {
                        daftarKategori[i].tampilkanSkorTertinggi();
                    }
                    break;

                case "3":
                    System.out.println("\nTerima kasih udah main, " + pemain.getNama() + "! Total poin akhirmu: " + pemain.getScore());
                    isRunning = false;
                    break;

                default:
                    System.out.println("\nPilihan tidak valid, coba lagi bro.");
            }
        }
        scanner.close();
    }
}