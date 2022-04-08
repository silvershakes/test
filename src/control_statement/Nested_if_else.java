package control_statement;

public class Nested_if_else {//String username="velocity";
	//Stirng password="v123";
    
	//if (username="velocity")
	//{
		//System.out.println("username is correct,enter password");
	   
	//if (password="v123")
	//{
		//System.out.println("password is correct,enter captcha");
	  
	//if (captcha="ASDF")
	//{
		//System.out.println("login success");
	//}
	//else
	//{
		//System.out.println("captcha is incorrect");
	//}
	
//else
//{
	//System.out.println("password is incorrect");
//}
	
	
	//}
	
//else
//{
	//System.out.println("username is incorrect");
//}
	
	
	
	//}

	public static void main(String[] args) 
	{
	    String username="pravinbalgore";
	    String password="pravin@2211";
	    int captcha=123456;
	    
	   if (username=="pravinbalgore")
	   {
		   System.out.println("inter password");
	       if (password=="pravin@2211")
	       {
	    	   System.out.println("inter captcha");
               if (captcha==123456)
               {
            	   System.out.println("login success");
               }
               else
               {
            	   System.out.println("captcha incorrect");
               }             	   
               
	       }
	       else
	       {
	    	   System.out.println("password incoreect");
	       }
	   }
	   else
	   {
		   System.out.println("username is incorrect");
	   }
	}
	
	}
	
	
	

   
