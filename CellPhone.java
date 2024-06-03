
/**

 Lab 5 Starter program
 The CellPhone class holds data about a cell phone.
*/
public class CellPhone
{
   // Fields
   private String model;
   private String manufacturer;    // Manufacturer
   private double retailPrice; // Retail price

   public CellPhone(String m, String man, double price) throws InvalidModelException,InvalidManufacturerException,InvalidRetailPriceException
   {
      setModel(m);
      setManufacturer(man);
     setRetailPrice(price);

   }


   public CellPhone() throws InvalidRetailPriceException,InvalidModelException,InvalidManufacturerException
   {

      this("","",0.0);
   }

   public void setModel(String m) throws InvalidModelException   {
      if (m == null || m.length() == 0)
         throw new InvalidModelException();
      else
         model = m;
   }
   public void setManufacturer(String man) throws InvalidManufacturerException
   {
      if (man == null || man.length()==0)
         throw new InvalidManufacturerException();
      else
         manufacturer = man;
      }
   
   public void setRetailPrice(double price) throws InvalidRetailPriceException
   {
      if (price > 1500.00 || price <0.0)
         throw new InvalidRetailPriceException();
      else
       retailPrice = price;
      }


   public String getModel(){return model;}
   public String getManufacturer()
   {
      return manufacturer;
   }
   public double getRetailPrice()
   {
      return retailPrice;
   }



   @Override
   public String toString(){
      return String.format("Model: %-20sManufacturer: %-20sretail price: %10.2f%n",getModel(), getManufacturer(),
              getRetailPrice());

    }
}