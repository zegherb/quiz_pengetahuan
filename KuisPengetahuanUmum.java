public class KuisPengetahuanUmum extends KategoriKuis {
    
    public KuisPengetahuanUmum() { 
        super("Pengetahuan Umum"); 
        muatPertanyaan();
    }
    
    public void muatPertanyaan() {
        Pertanyaan[] soal = new Pertanyaan[5];
        
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
                
        setDaftarPertanyaan(soal);
    }
}