package OO7;

class TestThrow {       
    public static void main(String args[]) {
        int i = 0;
		try {
			i = cal(args[0], args[1]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Without two args.");
		}
        // exception without two args
        System.out.println(i);       
    }       

    static int cal(String str1, String str2) {
        int i=0,j=0;               
        try {
			i = Integer.parseInt(str1);
			j = Integer.parseInt(str2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Cannot be converted into an integer.");
		}
		//      throw an exception if it cannot be converted
        //      into an integer               
        return i/j; 
        // could be devided by ZERO       
    }
} 