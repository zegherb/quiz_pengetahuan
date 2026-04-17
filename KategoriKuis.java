import java.util.Scanner;

public class KategoriKuis {
    private String namaKategori;
    private int skorTertinggi;
    private Pertanyaan[] daftarPertanyaan;

    public KategoriKuis(String namaKategori) {
        this.namaKategori = namaKategori;
        this.skorTertinggi = 0;
    }

    public void setDaftarPertanyaan(Pertanyaan[] daftarPertanyaan) {
        this.daftarPertanyaan = daftarPertanyaan;
    }

    public String getNamaKategori() { 
        return namaKategori; 
    }
    
    public void muatPertanyaan() {
            // Diisi di kelas turunan
    }

    public void mainkan(Player pemain, Scanner scanner) {
        System.out.println("\n=======================================");
        System.out.println("  Memulai Kategori: " + namaKategori.toUpperCase());
        System.out.println("=======================================");
        
        int skorSesiIni = 0; 

        for (int i = 0; i < daftarPertanyaan.length; i++) {
            Pertanyaan p = daftarPertanyaan[i];
            System.out.println("\n" + (i + 1) + ". " + p.getTeksPertanyaan());
            String[] opsi = p.getPilihan();
            
            for (int j = 0; j < opsi.length; j++) {
                System.out.println("   " + (char)('A' + j) + ". " + opsi[j]);
            }
            
            char jawaban;
            
            System.out.println("WAKTU DIMULAI! (Maks 20 detik untuk skor penuh)");
            long waktuMulai = System.currentTimeMillis();
            
            while (true) {
                System.out.print("Jawaban kamu (A/B/C/D): ");
                String input = scanner.nextLine().toUpperCase();

                if (input.length() == 1 && "ABCD".contains(input)) {
                    jawaban = input.charAt(0);
                    break;
                } else {
                    System.out.println("Input tidak valid! Masukkan hanya A, B, C, atau D.");
                }
            }
            
            
            long waktuSelesai = System.currentTimeMillis(); 
            double selisihDetik = (waktuSelesai - waktuMulai) / 1000.0; // Ubah milidetik ke detik

            if (jawaban == p.getJawabanBenar()) {
                System.out.println(">> Mantap! Jawaban BENAR.");
                System.out.printf("Waktu menjawab: %.2f detik.\n", selisihDetik);
                
                int poinDidapat;
                
                
                if (selisihDetik >= 20) {
                    poinDidapat = 1; // Lewat 10 detik cuma dapat 1 poin
                    System.out.println("Yah, waktu kamu lewat dari 20 detik. Kamu cuma dapat 1 poin.");
                } else {
                    poinDidapat = 100 - ((int)selisihDetik * 5);
                    System.out.println("Cepat! Kamu mendapatkan " + poinDidapat + " poin.");
                }
                
                skorSesiIni += poinDidapat;
                pemain.setScore(poinDidapat); 
                
            } else {
                System.out.println(">> Salah bro. Yang bener itu: " + p.getJawabanBenar());
                 System.out.printf("Waktu menjawab: %.2f detik.\n", selisihDetik);
            }
        }

        System.out.println("\nSelesai! Skor kamu di kategori " + namaKategori + ": " + skorSesiIni);

        if (skorSesiIni > skorTertinggi) {
            skorTertinggi = skorSesiIni;
            System.out.println(" Wuih! Kamu mencetak REKOR BARU! ");
        }
    }

    public void tampilkanSkorTertinggi() {
        System.out.println("- " + namaKategori + ": " + skorTertinggi + " Poin ");
    }
}