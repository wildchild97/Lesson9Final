public class FullTimeEmployee extends Employee{
    
    public FullTimeEmployee()
    {
        super();
    }

        
    public double getPay()
    {
        double pay;
          boolean noovertime=(hours<=40);
          if (noovertime)
              pay=rate*hours;
          
          else
              pay=(hours-40)* (rate*2)+rate*40;
          
          totalPay+=pay;
          return pay;
    }
    
}
