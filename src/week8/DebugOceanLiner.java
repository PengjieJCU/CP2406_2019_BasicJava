package week8;

public abstract class DebugOceanLiner extends DebugBoat
{
   public DebugOceanLiner()
   {
      super();
      Debug("ocean liner ");
      setPassengers();
      setPower();
   }
   public void setPassengers()
   {
      super.passengers = 2400;
   }
   public void power()
   {
      super.power = "" +
              "four engines";
   }
}
