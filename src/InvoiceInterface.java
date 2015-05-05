import java.util.ArrayList;

/**
 * @author Richard Shepard
 * @Feb 15, 2015
 */


public class InvoiceInterface {
	
	private ArrayList<Invoice> invoices;
	
	public InvoiceInterface() {
		invoices = new ArrayList<>();
	}
	
	public void inputInvoices() {
		boolean continueFlag = true;
		while(continueFlag) {
			invoices.add(new Invoice(new Person(), new Website()));
			System.out.print("Would you like to add another customer? ");
			continueFlag = TextIO.getlnBoolean();
		}
	}
	
	public void printInvoices() {
		for(int i = 0; i < invoices.size(); i++) {
			System.out.print(invoices.get(i).toString());
		}
	}
	
}
