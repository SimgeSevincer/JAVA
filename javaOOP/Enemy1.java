public class Enemy {
    static private int time = 0; //class attribute
    private char id; // encapsulation of data //instance attribute
    private int points;
    private int position;
    private int total;
    public Enemy(char id) {
        this.id = id;
        this.points = 0;
        this.position = 0;
    }
    public void setPosition(int steps) {
        this.position += steps;
    }
    public int getPosition() {
        return(this.position);
    }
    public static int getTime() {
        return(time);
    }
    public void setTotal(){
        this.position+=2;
    }
}