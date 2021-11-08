package starting.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCoordinate {

	@Test
	void test() {
		Coordinate c1 = new Coordinate(200,10);
		assertFalse(c1.equals(null));
		assertFalse(c1.equals("1"));
		
		Coordinate c2 = new Coordinate(200,10);
		Coordinate c3 = new Coordinate(135,130);
		
		assertTrue (c1.equals(c2));
		assertFalse(c1.equals(c3));
	}

}
