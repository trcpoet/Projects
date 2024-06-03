public abstract class Ship implements Displayable {
    private String name;
    private String year;

    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String toString()
    {
        return "Ship Name :"+getName()+ "\nBuilt Year :"+getYear();
    }

    @Override
    public abstract void display();
}


