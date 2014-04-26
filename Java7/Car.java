package Java7;

public class Car {
	private int speed;
	private final static int SPEEDLIMIT=5;
	
	   public boolean goFaster() {
		  if (speed < SPEEDLIMIT) {
			  speed++;
			  return true;
		  }
		  else 
			  return false;
	   }
}
