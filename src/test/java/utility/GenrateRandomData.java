package utility;

import java.util.Random;

public  class  GenrateRandomData {

	public  String   randomFourDigit()
	{
		Random rand = new Random(); 
		  
        // Generate random integers in range 0 to 999 
        int rand_int1 = rand.nextInt(1000); 
     
        return String.valueOf(rand_int1);
        

	}
	
	public String generateRandomString(int n)
	{
		 String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                 
                 + "abcdefghijklmnopqrstuvxyz"; 

// create StringBuffer size of AlphaNumericString 
StringBuilder sb = new StringBuilder(n); 

for (int i = 0; i < n; i++) { 

// generate a random number between 
// 0 to AlphaNumericString variable length 
int index 
= (int)(AlphaNumericString.length() 
		* Math.random() ); 

// add Character one by one in end of sb 
sb.append(AlphaNumericString 
       .charAt(index)); 
} 

return sb.toString(); 
		
	}
}
