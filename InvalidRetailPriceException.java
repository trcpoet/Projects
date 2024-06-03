public class InvalidRetailPriceException extends Exception{
    public InvalidRetailPriceException(){
        super("Invalid Price");

    }

    public InvalidRetailPriceException(double price){
       super("Invalid Price"+price);
    }
}
