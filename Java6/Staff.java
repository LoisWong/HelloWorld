package Java6;

public class Staff {
	String name;
	double payrate, salary;
	int hours1, hours2;
	
	public Staff(String nm, double pr, int hrs1, int hrs2)
	{
		name = new String(nm);
		payrate = pr;
		hours1 = hrs1;
		hours2 = hrs2;
		salary = caculate(hours1) + caculate(hours2);
	}
	
	public double caculate(double hours)
	{
		if(hours>40)
		{
			return payrate * 1.5 * (hours-40) + payrate * 40;
		}
		else return payrate*hours;
	}


}
