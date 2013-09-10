
public class RegistrationManager {

	
	public boolean registerUser(String email,String password,String firstname, String surname)
	{
		boolean registered=false;
		if(email != null && !email.isEmpty()|| password != null && !password.isEmpty()|| firstname != null && !firstname.isEmpty()||surname != null && !surname.isEmpty())
		{
			return registered;
		}
		else
		{
		if(this.validateEmail(email))
		{
		Account account= new Account(email,password,firstname,surname);
		//TODO there should be a method in Account to add the user to the Data base.
		
		//TODO call that method to create the user in th date base
		
		return registered;	
		}else
		{
			return registered;
		}
		}
	}
	//TODO validate weather email exist in the data base , need to have one method some where to check database 
	private boolean validateEmail(String email)
	{
		return false;
	}
}
