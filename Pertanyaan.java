public class Pertanyaan {
    private String pertanyaan;
    private String[] pilihan;
    private char jawabanBenar;

    public Pertanyaan(String pertanyaan, String[] pilihan, char jawabanBenar){
        this.pertanyaan = pertanyaan;
        this.pilihan = pilihan;
        this.jawabanBenar = jawabanBenar;
    }
    public String getTeksPertanyaan(){
        return pertanyaan;
    }

    public String[] getPilihan(){
        return pilihan;
    }

    public char getJawabanBenar(){
        return jawabanBenar;
    }
    
}