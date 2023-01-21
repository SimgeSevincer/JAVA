public class Random{
    private int min;
    private int max;
    public Random(int min,int max){
        this.min=min;
        this.max=max;
    }
    public int randomDigit(int min, int max){
        return( (int)min + (int) (Math.random() * (max-min)));
    }
}