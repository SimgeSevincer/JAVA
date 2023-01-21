public class Square // implements Shape
{
    static int count = 0;
    private int length;
    public Square(int length) {
        Square.count++;
        this.length = length;
        // super.value = length;
    }

    public int area() {
        return(this.length * this.length);
        // return(super.value * super.value);
    }

    @Override
    public String toString() {
        return("S(" + String.valueOf(this.length) + ")" );
    }
}