package TestController;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import starting.controller.SelectNodeController;
import starting.controller.SwapEdgesController;
import starting.model.Model;
import starting.view.TrianglePuzzleApp;

class SwapControllerTest {

	@Test
	void test() {
		Model model = new Model();
		TrianglePuzzleApp app = new TrianglePuzzleApp(model);
		SwapEdgesController sec= new SwapEdgesController(model, app);
		sec.process();
		sec.setMoves(1);
		assertEquals(sec.getMoves(),1);
		
		
		
	}

}
