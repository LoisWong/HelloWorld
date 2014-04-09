package OO3;

import java.io.BufferedReader;
import java.io.InputStreamReader; 
import java.io.IOException;  
public class GetInput{   
	public static void main(String args[]){     
		String str = null;     
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     
		try{       
			str = br.readLine();     
			}
		catch(IOException e){       
			System.out.println("Input error:" + e.getMessage());     
			}     
		System.out.println("input: '" + str + "'");   
	} 
} 
