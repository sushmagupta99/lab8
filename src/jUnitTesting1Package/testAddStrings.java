package jUnitTesting1Package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitFunction junitstring = new jUnitFunction();
		String result = junitstring.addstrings("capstone", "project");
		assertEquals("capstoneproject",result);
	}
}


