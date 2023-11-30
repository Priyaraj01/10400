package Softwaretesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxArrayTest {

	@Test
	public void test() {
		assertEquals(MaxArray.max(1,5,10,15,20,25),25);
	}

}
