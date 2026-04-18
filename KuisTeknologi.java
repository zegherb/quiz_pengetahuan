import java.util.Random;

public class KuisTeknologi extends KategoriKuis {
    
    public KuisTeknologi() { 
        super("Teknologi"); 
        muatPertanyaan();
    }
    
    public void muatPertanyaan() {
        Pertanyaan[] soal = new Pertanyaan[10];
        
        soal[0] = new Pertanyaan("Sistem operasi open-source dengan maskot pinguin adalah?", 
                new String[]{"Windows", "macOS", "Linux", "FreeBSD"}, 'C');        
        soal[1] = new Pertanyaan("Bahasa pemrograman yang sering digunakan dengan framework Flask adalah?", 
                new String[]{"PHP", "Java", "Ruby", "Python"}, 'D');
        soal[2] = new Pertanyaan("Game console generasi ke-8 yang dikembangkan oleh Sony adalah?", 
                new String[]{"PlayStation 3", "PlayStation 4", "PlayStation 5", "PlayStation 6"}, 'C');
        soal[3] = new Pertanyaan("Apa kepanjangan dari AI dalam konteks teknologi?", 
                new String[]{"Artificial Intelligence", "Automated Interface", "Advanced Internet", "Analog Input"}, 'A');
        soal[4] = new Pertanyaan("Kriptografi yang menggunakan sepasang kunci (publik dan privat) disebut?", 
                new String[]{"Symmetric", "Asymmetric", "Hashing", "Steganography"}, 'B');
        soal[5] = new Pertanyaan("Apa nama dari teknologi yang digunakan untuk mengenkripsi data?", 
                new String[]{"Firewall", "Antivirus", "Kriptografi", "Hashing"}, 'C');
        soal[6] = new Pertanyaan("Siapa yang dikenal sebagai penemu komputer modern?", 
                new String[]{"Alan Turing", "Charles Babbage", "John von Neumann", "Ada Lovelace"}, 'B');
        soal[7] = new Pertanyaan("Apa nama dari protokol jaringan yang digunakan untuk mengirim email?", 
                new String[]{"HTTP", "FTP", "SMTP", "TCP/IP"}, 'C');
        soal[8] = new Pertanyaan("Apa nama dari perangkat keras yang digunakan untuk menyimpan data secara permanen?", 
                new String[]{"RAM", "CPU", "Hard Drive", "GPU"}, 'C');
        soal[9] = new Pertanyaan("Apa nama dari teknologi yang memungkinkan komputer untuk berkomunikasi satu sama lain?", 
                new String[]{"Internet", "Intranet", "Extranet", "World Wide Web"}, 'A');
        
        Random rand = new Random();
        for (int i = soal.length - 1; i > 0; i--) {
                int j = rand.nextInt(i + 1);
                Pertanyaan temp = soal[i];
                soal[i] = soal[j];
                soal[j] = temp;
        }
        Pertanyaan[] soalTerpilih = new Pertanyaan[5];
        for (int i = 0; i < 5; i++) {
                soalTerpilih[i] = soal[i];
        }

        setDaftarPertanyaan(soalTerpilih);
    }
}