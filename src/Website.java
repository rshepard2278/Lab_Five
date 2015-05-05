/**
 * @author Richard Shepard
 * @Feb 15, 2015
 */


public class Website {

	private String base;
	private boolean[] features;
	private static final String[] bases = {"nature", "tech", "business", "music", "naughty" };
	
	public Website() {
		features = new boolean[5];
		displayChoices();
		selectBase();
		selectFeatures();
	}
	
	private void displayChoices() {
		System.out.println("|  Design  |   Base   |  Feature  |  Feature  |  Feature  |  Feature  |  Feature  |");
		System.out.println("|          |   Price  |     1     |     2     |     3     |     4     |     5     |");
		System.out.println("|==========|==========|===========|===========|===========|===========|===========|");
		System.out.println("|  Nature  |   300    |    10     |    15     |    20     |    25     |    30     |");
		System.out.println("|----------|----------|-----------|-----------|-----------|-----------|-----------|");
		System.out.println("|   Tech   |   350    |    20     |    30     |    40     |    50     |    60     |");
		System.out.println("|----------|----------|-----------|-----------|-----------|-----------|-----------|");
		System.out.println("| Business |   375    |    30     |    40     |    50     |    60     |    70     |");
		System.out.println("|----------|----------|-----------|-----------|-----------|-----------|-----------|");
		System.out.println("|  Music   |   400    |    85     |    95     |   110     |   130     |    210    |");
		System.out.println("|----------|----------|-----------|-----------|-----------|-----------|-----------|");
		System.out.println("| Naughty  |   500    |   100     |   200     |   300     |   400     |    500    |");
		System.out.println("-----------------------------------------------------------------------------------");
	}
	
	private void selectBase() {
		System.out.print("\nWhat Design would you like? ");
		base = TextIO.getln().trim().toLowerCase();
		boolean found = false;
		int i = 0;
		while(!found && i < bases.length) {
			if(bases[i].equalsIgnoreCase(base)) {
				found = true;
			}
			i++;
		}
		if(!found) {
			System.out.println("Please select a proper base....");
			displayChoices();
			selectBase();
		}
	}
	
	/**
	 * @return the base
	 */
	public String getBase() {
		return base;
	}

	/**
	 * @return the features
	 */
	public boolean[] getFeatures() {
		return features;
	}

	private void selectFeatures() {
		for(int i = 0; i < features.length; i++) {
			System.out.print("\nWould you like feature# " + (i+1) + "? ");
			features[i] = TextIO.getlnBoolean();
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String line = "Website base: " + base;
		for(int i = 0; i < features.length; i++) {
			if(features[i]) {
				line = line + "\nFeature: " + (i+1);
			}
		}		
		return line;
	}
}


