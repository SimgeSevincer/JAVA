public class Main {
    public static void main (String[] args) 
    {
        int count = 0;
        Scanner input = new Scanner(new java.io.File("shape.txt"));
	    Square s=new Square();
	    Cube c=new Cube();
		 while(input.hasNextInt()){
            int edge1=input.nextInt();
            Square s=new Square();
            int edge2=input.nextInt();
            Cube c=new Cube();//annonymous declaration
		 }
        System.out.println(count + " squares are created.");
        System.out.println(Square.count + " squares are created.");
    }
}

// class Circle & toString() & clone()
// class Square & toString() & clone()
