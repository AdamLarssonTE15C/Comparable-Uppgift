
	public class Person implements Comparable<Person>{
		
		private String FirstName;
		private String LastName;
		
		public Person(String fullname){
			
			int space = fullname.indexOf(' ');
			
			this.LastName = fullname.substring(0, space);
			this.FirstName = fullname.substring(space+1);
			
		}
		

		
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


		public int compareTo(Person pers) {
			
			if(this.LastName.compareTo(pers.LastName) == 0){
				return this.FirstName.compareTo(pers.FirstName);
			}
			else{
				return this.LastName.compareTo(pers.LastName);
			}
		}
		

	}

