public class Enemy{
    static private int time=0;//static classın her nesnesi için değeri aynı olan demek (class attribute)
    private char id;//encapsulation of data (instance attribute yani static değil)
    private int points;
    private int position;
    private boolean direction;
    private int steps;
    public Enemy(char id){
        this.id=id;
        this.points=0;
        this.position=0;
    }
    public void setSteps(int steps){
        this.steps=steps;
    }
    public void setDirection(boolean direction){
        this.direction=direction;
    }
    public static int getTime(){
        return(time);
    }
}