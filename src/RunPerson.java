	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;


	public class RunPerson {

		
		public static void main(String[] args) throws FileNotFoundException {
			
			Scanner sc = new Scanner(new File("Names.txt"));
			
			ArrayList<Person> Person = new ArrayList<Person>();
			
			for(int i = 0; i < 10 ; i++){
			
			Person p = new Person (sc.nextLine().trim());
			Person.add(p);
			
			
			}
			
			Collections.sort(Person);
			
			for(Person counter: Person);
				System.out.println(counter.getLastName +" "+counter.getFirstName());
			
		}

}
