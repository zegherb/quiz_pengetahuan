import java.util.Random;

public class KuisPengetahuanUmum extends KategoriKuis {
    
    public KuisPengetahuanUmum() { 
        super("Pengetahuan Umum"); 
        muatPertanyaan();
    }
    
    public void muatPertanyaan() {
        Pertanyaan[] soal = new Pertanyaan[10];
        
        soal[0] = new Pertanyaan("Klub sepak bola asal Inggris yang memiliki julukan 'Setan Merah' adalah?", 
                new String[]{"Arsenal", "Manchester City", "Manchester United", "Chelsea"}, 'C');      
        soal[1] = new Pertanyaan("Ibukota negara Jepang adalah?", 
                new String[]{"Kyoto", "Tokyo", "Osaka", "Hokkaido"}, 'B');
        soal[2] = new Pertanyaan("Berapa jumlah provinsi di Indonesia saat ini?", 
                new String[]{"34", "35", "36", "37"}, 'C');
        soal[3] = new Pertanyaan("Siapa penemu Pesawat Terbang?", 
                new String[]{"Wright Bersaudara", "Leonardo da Vinci", "Nikola Tesla", "Alexander Graham Bell"}, 'A');
        soal[4] = new Pertanyaan("Negara dengan jumlah penduduk terbanyak di dunia adalah?", 
                new String[]{"India", "Amerika Serikat", "Indonesia", "China"}, 'D');
        soal[5] = new Pertanyaan("Siapa yang dikenal sebagai penemu komputer modern?", 
                new String[]{"Alan Turing", "Charles Babbage", "John von Neumann", "Ada Lovelace"}, 'B');
        soal[6] = new Pertanyaan("Apa nama file yang terkait dengan teori conspirasi Epstein?", 
                new String[]{"Epstein Files", "Epstein Papers", "Epstein Documents", "Epstein Records"}, 'A');
        soal[7] = new Pertanyaan("Berapa banyak bahasa yang diakui secara resmi di Indonesia?", 
                new String[]{"337", "503", "718", "912"}, 'C');
        soal[8] = new Pertanyaan("Negara dengan tingkat kemiskinan tertinggi di dunia adalah?", 
                new String[]{"Sudan Selatan", "Burundi", "Zambia", "Madagascar"}, 'A');
        soal[9] = new Pertanyaan("Makanan paling mahal di dunia adalah?", 
                new String[]{"Truffle", "Saffron", "Caviar", "Bottled Water"}, 'C');

        setDaftarPertanyaan(soal);
    }
}