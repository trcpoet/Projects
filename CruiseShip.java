public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, String year, int maxPassengers){
        super(name,year);
        this.maxPassengers=maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers(){
        return maxPassengers;
    }

    @Override
    public void display() {

    }

    public String toString(){
        return "\nShip Name: "+getName()+ "\nMax Number of passengers: "+getMaxPassengers();
    }
}
