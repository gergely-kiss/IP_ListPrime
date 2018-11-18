package uk.gergely.kiss.listprime;

import uk.gergely.kiss.educationutil.print.method.PrintMethod;
import uk.gergely.kiss.listprime.listingprimes.ListingPrimes;

public class ListPrime {
	
	public static void main(String[] args) {
		PrintMethod pm = new PrintMethod();
		pm.printMehod(new Long(1000), new ListingPrimes());
	}

}
