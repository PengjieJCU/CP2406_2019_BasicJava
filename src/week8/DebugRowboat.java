package week8;

import week8.DebugBoat;

public class DebugRowboat extends DebugBoat
{
   public DebugRowboat()
   {
      super("row");
   }
   public void setPassengers()
   {
      super.passengers = 2;
   }
   public void setPower()
   {
      super.power = "oars";
   }
}