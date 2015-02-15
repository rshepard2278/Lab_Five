/**
 * @author Richard Shepard
 * @Feb 15, 2015
 */


public class Invoice {
	
	private static final int[] basePrices = {300, 350, 375, 400, 500};  
	private static final int[][] featurePrices = { { 10,  15,  20,  25,  30},
												   { 20,  30,  40,  50,  60},
												   { 30,  40,  50,  60,  70},
												   { 85,  95, 110, 130, 210},
												   {100, 200, 300, 400, 500}};
	
	private Person customer;
	private Website site;
	
	private boolean[] selectedFeatures;
	
	private double basePrice;
	private double featurePrice;
	private double totalPrice;
	
	private int baseNum;
	
	public Invoice(Person customer, Website site) {
		this.customer = customer;
		this.site = site;		
		selectedFeatures = site.getFeatures();
		basePrice = 0;
		featurePrice = 0;
		totalPrice = 0;
		setPrices();
	}
	
	public void setPrices() {
		setBase();
		setFeatures();
		setTotal();
	}
	
	private void setBase() {
		String base = site.getBase();
		baseNum = 0;
		switch(base) {
			case "nature":
				baseNum = 0;
				break;
			case "tech":
				baseNum = 1;
				break;
			case "business":
				baseNum = 2;
				break;
			case "music":
				baseNum = 3;
				break;
			case "naughty":
				baseNum = 4;
				break;
			default:
				System.out.println("Invalid base number");
				break;
		}
		basePrice = basePrices[baseNum];
	}
	
	private void setFeatures() {
		for(int i = 0; i < selectedFeatures.length; i++) {
			if(selectedFeatures[i]) {
				featurePrice += featurePrices[baseNum][i];
			}
		}
	}
	
	private void setTotal() {
		totalPrice = basePrice + featurePrice;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String line = "\n\n" + customer.toString();
		line = line + "\nWebsite design:       " + site.getBase();
		line = line + "\nBase price:           " + basePrice;
		for(int i = 0; i < selectedFeatures.length; i++) {
			if(selectedFeatures[i]) {
				line = line + "\nFeature:       " + (i+1) + "   $" + featurePrices[baseNum][i];
			}
		}	
		line = line + "\nTotal:       $"	+ totalPrice;
		return line;
	}
	
	

}
