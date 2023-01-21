/*
    implement Circle, Square, Rectangle classes 
    implement Test class including main() that:
        opens "shape.txt"
        reads three lines
        find the object with largest area by using Shape.compareTo() only
    
    
*/

/*
public abstract class Shape
{
    public abstract int area();
    public boolean equals(Shape other)
    {
        ...
    }
    public int compareTo(Shape other)
    {
        ...        
    }
}

class Circle & toString() & clone()
class Square & toString() & clone()

shape.txt 
C 3
S 2
R 3 5

*/


public class Cube // implements Shape
{
    static int count = 0;
    private int length;
    public Cube(int length) {
        Cube.count++;
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























