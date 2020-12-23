public class AirplaneTest
{
   public static void main(String () args)
   {
      Airplane plane1 = new Airplane();
      
      System.out.println( plane1.getManufacturer() );
      
      System.out.println( plane1.availablePayload( 40 ) );
      
   }// end main

}