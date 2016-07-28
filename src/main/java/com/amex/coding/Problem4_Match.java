package com.amex.coding;

import java.util.HashSet;
import java.util.Set;

public class Problem4_Match {

	public boolean doTheyMatch(Person p1, Person p2) {
		// Are they equal?
		boolean personEqual = p1.equals(p2);
		// If I add both to a Set does it enforce uniqueness? Yes
		Set<Person> setPerson = new HashSet<Person>();
		setPerson.add(p1);
		setPerson.add(p2);
		boolean setSize = (1 == setPerson.size() ? true : false);
		// If both conditions above are true, then return true, else false;
		return personEqual && setSize;
	}
}
