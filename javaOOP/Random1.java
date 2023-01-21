public class Random{
    private char lower;
    private char upper;
    
    public Random(char lower,char upper){
        this.lower=lower;
        this.upper=upper;
    }
    public char randomLowerLetter(char lower,char upper){
        return((char)((lower + Math.random())*(upper)));
    }
     //public char randomUpperLetter(char lower,char upper){
        //return((char)('A' + Math.random() * ('Z' + 'A' -1)));
    //}
}