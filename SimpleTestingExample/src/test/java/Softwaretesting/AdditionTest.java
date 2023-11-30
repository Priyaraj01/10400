package Softwaretesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void test() {
		assertEquals(Addition.add(3, 5),8);
	}

}
