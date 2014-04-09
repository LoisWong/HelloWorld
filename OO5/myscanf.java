package OO5;

import java.io.BufferedReader; 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader; 
import java.io.IOException;  

class myscanf{   
    public static void ReadFromFile(String args[]){     
        String str = null;
        // Step 1)
        System.err.println("Read From File: " + args[1] + "started.");
        BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(args[1]));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}     
        try{
            str = br.readLine();
        }catch(IOException e){
           System.out.println("Input error:" + e.getMessage());
        }
   
       // Step 2)
        System.err.println("Read From File: " + args[1] + "ended.");
    }

public class FunctionStepIOLog{
    public FunctionStepIOLog(){
    	StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
    	StackTraceElement e = stacktrace[1];
    	String methodName = e.getMethodName();
    	System.out.println("Method :" + methodName + "has been invoked");
    } 
} 
}