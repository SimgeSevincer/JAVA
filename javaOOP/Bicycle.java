public class Bicycle
{
    private int speed;
    public Bicycle(int speed){
        this.speed = speed;
    }
    public void speedDown(int decrement){
        speed-=decrement;
    }
    public void speedUp(int increment){
        speed+=increment;
    }
    public String toString() 
    {
        return("Bicycle(" + String.valueOf(this.speed) + ")" );
    }
    
}