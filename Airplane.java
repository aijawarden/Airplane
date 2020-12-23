public class Airplane
{
   //fields
   private String manufacturer; // builder of airplane
   private String models; // model number of airplane
   private double cost; // cost of airplane
   private double mtow; // maximum takeoff weight
   private double emptyWeight; // weight without fuel or passengers
   private int stallSpeed; // stall speed in knots
   private int maximumSpeed; // maximum speed in knots
   
   //constructors
   public Airplane()
   {
      manufacturer = "Cessna";
      model = "172M";
      cost = 50000;
      mtow = 2450;
      //emptyWeight = 1691;
      //stallSpeed = 47;
      //maximumSpeed = 130;
   }
   
   public Airplane( String man, String mod, double c, 
                    double mtow, double ew, int ss, 
                    int ms )
 {
   manufacturer = man;
   model = mod;
   
   this.mtow = mtow;
   
 }
   
   // General Accessors
   public String getManufacturer() { return manufacturer; }
   public String getModel() { return model; }
   public double getcost() { return cost; }
   public double getmtow() { return mtow; }
   public double getemptyWeight() { return emptyWeight; }
   public int getstallSpeed() { return stallSpeed; }
   public int getmaximumSpeed() { return maximumSpeed; }
   
   // General Methods 
   public double availablePayload( double gallonOfFuel )
   {
      return 1;
   }
   
   public double speedDifferential()
   {
      return 1;
   }
}

  