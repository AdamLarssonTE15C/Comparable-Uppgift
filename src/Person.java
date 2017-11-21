
public class Person implements Comparable<Person>{
	
	private String FirstName;
	private String LastName;

	
	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public int compareTo(Person arg0) {
		
		return 0;
	}
	

}
