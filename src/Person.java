/**
 * @author Richard Shepard
 * @version Feb 15, 2015
 */


public class Person {
	
	private static int customerNumberPool = 1000;
	
	private String firstName;
	private String lastName;
	private String coName;
	private String address;
	private String city;
	private String state;
	private String phone;
	
	private int zip;
	private int customerNum;
	
	
	/**
	 * This constructor creates a person object and 
	 * a unique customer number based on a static variable
	 * that is incremented with each person that is 
	 * created
	 */
	public Person() {
		getCustomerInfo();
		this.customerNum = customerNumberPool++;
	}
	
	private void getCustomerInfo() {
		System.out.print("What is your first name? ");
		firstName = TextIO.getln();
		
		System.out.print("What is your last name? ");
		lastName = TextIO.getln();
		
		System.out.print("What is your Company name? ");
		coName = TextIO.getln();
		
		System.out.print("What is your address? ");
		address = TextIO.getln();
		
		System.out.print("What is your city? ");
		city = TextIO.getln();
		
		System.out.print("What is your state? ");
		state = TextIO.getln();
		
		System.out.print("What is your zip code? ");
		zip = TextIO.getlnInt();
		
		System.out.print("What is your phone number? ");
		phone = TextIO.getln();
	}


	/**
	 * @return the customerNumberPool
	 */
	public static int getCustomerNumberPool() {
		return customerNumberPool;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @return the coName
	 */
	public String getCoName() {
		return coName;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}


	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}


	/**
	 * @return the zip
	 */
	public int getZip() {
		return zip;
	}


	/**
	 * @return the customerNum
	 */
	public int getCustomerNum() {
		return customerNum;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String line =  "FirstName:     " + firstName + 
				"\nLastName:      " + lastName + 
				"\nCustomerNum:   " + customerNum +
				"\nCoName:        " + coName + 
				"\nAddress:       " + address + 
				"\nCity:          " + city + 
				"\nState:         " + state + 
				"\nZip:           " + zip +
				"\nPhone:         " + phone;
		return line;
	}
	
	
	
	
}
