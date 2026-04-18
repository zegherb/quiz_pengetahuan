import java.util.Random;

public class KuisPengetahuanAlam extends KategoriKuis {
    
    public KuisPengetahuanAlam() { 
        super("Pengetahuan Alam"); 
        muatPertanyaan();
    }
    
    public void muatPertanyaan() {
        Pertanyaan[] soal = new Pertanyaan[10];
        
        soal[0] = new Pertanyaan("Proses tumbuhan membuat makanan sendiri menggunakan cahaya matahari disebut?", 
                new String[]{"Respirasi", "Fotosintesis", "Ekskresi", "Metabolisme"}, 'B');     
        soal[1] = new Pertanyaan("Planet terdekat dari matahari dalam tata surya kita adalah?", 
                new String[]{"Venus", "Mars", "Bumi", "Merkurius"}, 'D');
        soal[2] = new Pertanyaan("Relativitas umum adalah teori yang dikembangkan oleh?", 
                new String[]{"Isaac Newton", "Albert Einstein", "Galileo Galilei", "Nikola Tesla"}, 'B');
        soal[3] = new Pertanyaan("Sebuah benda memiliki massa 10 kg dan berada di permukaan bumi. Berapakah berat benda tersebut? (Gunakan percepatan gravitasi 9.8 m/s²)", 
                new String[]{"98 Newton", "100 Newton", "90 Newton", "108 Newton"}, 'A');
        soal[4] = new Pertanyaan("Nomor atom dari unsur Oksigen adalah?", 
                new String[]{"6", "7", "8", "9"}, 'C');
        soal[5] = new Pertanyaan("Hukum Mendel berkaitan dengan?", 
                new String[]{"Fisika", "Kimia", "Biologi", "Astronomi"}, 'C');
        soal[6] = new Pertanyaan("Apa nama partikel dasar yang memiliki muatan negatif?", 
                new String[]{"Proton", "Neutron", "Elektron", "Foton"}, 'C');
        soal[7] = new Pertanyaan("Berapa jumlah planet dalam tata surya kita?", 
                new String[]{"7", "8", "9", "10"}, 'B');
        soal[8] = new Pertanyaan("Apa nama proses di mana air berubah menjadi uap?", 
                new String[]{"Kondensasi", "Evaporasi", "Presipitasi", "Sublimasi"}, 'B');
        soal[9] = new Pertanyaan("Siapa yang menemukan hukum gravitasi universal?", 
                new String[]{"Isaac Newton", "Albert Einstein", "Galileo Galilei", "Nikola Tesla"}, 'A');
               
        setDaftarPertanyaan(soal);
    }
}