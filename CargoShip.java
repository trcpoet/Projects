public class CargoShip extends Ship {
    private int tonnage;

    public CargoShip(String name, String year, int tonnage) {
        super(name, year);
        this.tonnage=tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public int gettonnage(){
        return tonnage;
    }

    @Override
    public void display() {

    }

    public String toString(){
        return "\nShip Name: "+getName()+ "\nCargo Capacity: "+gettonnage();
    }
}

