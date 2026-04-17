public class Player{
    private String nama;
    private int score;

    public Player(String nama){
        this.nama = nama;
        this.score = 0;
    }

    public void setScore(int point){
        score += point; 
    }

    public String getNama(){
        return nama;
    }

    public int getScore(){
        return score;
    }
}