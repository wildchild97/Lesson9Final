public abstract class Employee 
{
    protected double hours;
    protected double rate;
    protected String name;
    
    public static double LowRate=6.75;
    public static double HighRate=30.50;
    public static double LowHours=1;
    public static double HighHours=60;
    
    protected static double totalPay=0;
   
    public Employee()
    {
        name="";
        rate=0;
        hours=0;
    }
    
    public boolean setName(String nm)
    {
         boolean blank= (nm.equals(""));
        if (blank) return false;
        else
        {
           name=nm;
           return true;
        }
        
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean setRate(double rt)
    {
       boolean rateok= (rt>=LowRate && rt<=HighRate);
        if (rateok)
        {
            rate=rt;
            return true;
        }
        else return false;
    } 
     
    public boolean setHours(double hrs)
    {
        boolean hoursok= (hrs>=LowHours && hrs<=HighHours);
        if (hoursok)
        {
            hours=hrs;
            return true;
        }
        else return false;
    } 
      
      
    public abstract double getPay();
     
      
    public static String getNameRules()
    {
        return "nonblank";
    }
   
    public static String getRateRules()
    {
        return "between " + LowRate + " and " +  HighRate + " inclusive.";
    }
   
    public static String getHourRules()
    {
        return "between" + LowHours+ " and "+ HighHours +" inclusive.";
    }
    
    public static double getTotalPay()
    {
        return totalPay;
    }
}