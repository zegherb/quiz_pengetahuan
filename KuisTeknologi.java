public class KuisTeknologi extends KategoriKuis {
    
    public KuisTeknologi() { 
        super("Teknologi"); 
        muatPertanyaan();
    }
    
    public void muatPertanyaan() {
        Pertanyaan[] soal = new Pertanyaan[5];
        
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
                
        setDaftarPertanyaan(soal);
    }
}