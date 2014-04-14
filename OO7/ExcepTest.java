package OO7;

class ExcepTest {       
	   public static void main(String[] args) {               
	       Msg obj = new Msg();               
	       try {
			obj.setMsg("Hey Hobo");
		} catch (Exception e) {
			e.printStackTrace();
		}               
	       System.out.println(obj.getMsg());                
	       try {
			obj.setMsg("Good bye Hobo");
		} catch (Exception e) {	
			e.printStackTrace();
		}               
	       System.out.println(obj.getMsg());       
	   }
}
