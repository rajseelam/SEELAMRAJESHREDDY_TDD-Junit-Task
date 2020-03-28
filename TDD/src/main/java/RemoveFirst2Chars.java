
public class RemoveFirst2Chars {
	
	public String Remove(String string)
	{
		
		int StringLength=string.length();
		
		String newString="";
		if(StringLength==0)
		{
			
			newString="";
			
		}
		
		else if(StringLength==1)
		   {
			   if(string.charAt(0)!='A')
			   {
				   newString=newString+string.charAt(0);
			   }
		   } 
		   else
		   {
			   if(string.charAt(0)=='A'&&string.charAt(1)=='A')
			  
			   {
				  newString="";  
				  
				  }
			   else if(string.charAt(0)=='A')
				   {
				   
				   newString=newString+string.charAt(1);
				   }
			   else if(string.charAt(1)=='A')
				  
			   {
				   newString=newString+string.charAt(0);
				  
			   }
			   else
			   {
				   newString=newString+string.charAt(0)+string.charAt(1);
			   }
		   }
		  if(StringLength!=0)
		  {
		  newString=newString+string.substring(2,StringLength);
		  }
		return newString; 
	}
}  
	


