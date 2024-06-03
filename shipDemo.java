import java.util.ArrayList;

public class shipDemo {
    public static void main(String[] args) {
        Ship[] ships = new Ship[4];
        System.out.println("This is the array");

        ships[0]=new CruiseShip("SS-DHR","2004",1000);
        ships[1]=new CruiseShip("SS-TRC","1999",3000);
        ships[2]=new CargoShip("Poet-Cargo","2017", 20000);
        ships[3]=new CargoShip("Warrior-Cargo","2010", 30000);
        for (Ship ship : ships) System.out.println(ship.toString());

        System.out.println("----------------------------------------------------------");

        System.out.println("This is the Array List");

        ArrayList<Ship>shipArrayList= new ArrayList<>();
        shipArrayList.add(new CruiseShip("SS-DHR","2004",1000));
        shipArrayList.add(new CruiseShip("SS-TRC","1999",3000));
        shipArrayList.add(new CargoShip("Poet-Cargo","2017", 20000));
        shipArrayList.add(new CargoShip("Warrior-Cargo","2010", 30000));

        for (Ship s : shipArrayList){
            System.out.println(s.toString());
        }
    }

}

