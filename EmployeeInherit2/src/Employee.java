
public class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private String gender;
	
	public Employee(String first, String last, String sex, String ssn)
	{
		firstName = first;
	    lastName = last;
	    socialSecurityNumber = ssn;
	    gender = sex;
	}
	public void setFirstName( String first )
	{
	    firstName = first; // should validate
	} // end method setFirstName

	   // return first name
	public String getFirstName()
	{
	    return firstName;
	} // end method getFirstName

	   // set last name
	   public void setLastName( String last )
	   {
	      lastName = last; // should validate
	   } // end method setLastName

	   // return last name
	   public String getLastName()
	   {
	      return lastName;
	   } // end method getLastName

	   // set social security number
	   public void setSocialSecurityNumber( String ssn )
	   {
	      socialSecurityNumber = ssn; // should validate
	   } // end method setSocialSecurityNumber

	   // return social security number
	   public String getSocialSecurityNumber()
	   {
	      return socialSecurityNumber;
	   } // end method getSocialSecurityNumber
	   
	   public String getGender()
	   {
		   return gender;
	   }
	
	@Override
	 public String toString()
	 {
		return String.format("%s: %s %s Gender:%s \n%s: %s\n",
				"commission employee", getFirstName(), getLastName(), getGender(),
		         "social security number", getSocialSecurityNumber());
	 }
}
