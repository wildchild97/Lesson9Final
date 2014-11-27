public abstract class Employee 
{
    protected double hours;
    protected double rate;
    protected String name;
    
    public double LowRate=6.75;
    public double HighRate=30.50;
    public double LowHours=1;
    public double HighHours=60;
    
    protected double totalPay=0;
   
    public Employee()
    {
        name="";
        rate=0;
        hours=0;
    }
    
    public boolean setName(String nm)
    {
   
    }
    
    public String getName()
    {
        
    }
    
    public boolean setRate(double rt)
    {
   
    } 
     
    public boolean setHours(int hrs)
    {

    } 
      
      
    public abstract double getPay();
     
      
    public String getNameRules()
    {
        return "nonblank";
    }
   
    public String getRateRules()
    {
        return "between 6.75 and 30.50, inclusive";
    }
   
    public String getHourRules()
    {
        return "between 1 and 60, inclusive";
    }
    
    public double getTotalPay()
    {
        return totalPay;
    }
}