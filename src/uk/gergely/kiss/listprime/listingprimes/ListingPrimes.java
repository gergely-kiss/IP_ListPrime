package uk.gergely.kiss.listprime.listingprimes;

import java.util.ArrayList;
import java.util.List;

import uk.gergely.kiss.educationutil.print.method.printable.Printable;

public class ListingPrimes implements Printable<Long, List<Long>> {

	public List<Long> listPrimes(Long max) {
		List<Long> primes = new ArrayList<>();
		for (Long i = new Long(1); i <= max; i++) {
			if(isItAPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
	}

	private Boolean isItAPrime(Long input) {
		return input < 2 ? false : isDefined(input);

	}

	private boolean isDefined(Long input) {
		if (input == 2)
			return true;
		if (input % 2 == 0)
			return false;
		for (Long i = new Long(3); i * i <= input; i += 2) {
			if (input % i == 0)
				return false;
		}
		return true;
	}

	@Override
	public List<Long> execute(Long arg0) {
		return listPrimes(arg0);
	}

}
